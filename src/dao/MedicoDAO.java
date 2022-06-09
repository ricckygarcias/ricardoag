package dao;
/**** @author ricar */

import factory.Conexao;
import modelo.Medico;
import java.util.ArrayList;
import java.sql.ResultSet; //Incluí manualmente, a correção via menu da IDE não funcionou

public class MedicoDAO extends Conexao {
    
   public String cadastrarMedico (Medico medico)
   {
        try
        {
            String sql;
            sql = "INSERT INTO MEDICO VALUES (NULL, '" + medico.getNome() + "', " 
                    + medico.getEspecialidade() + ", " 
                    + medico.getCrm() + ", '" + medico.getCpf() + "')";
            return this.atualizarBanco(sql);
        }
        catch(Exception e)
        {
            return e.getMessage();
        }
    }
    
   public String atualizarMedico (Medico medico)
    {
        try
        {
            String sql;
            sql = "UPDATE MEDICO SET NOME = '" + medico.getNome() + "', ESPECIALIDADE = " + medico.getEspecialidade() + ", "
                    + "CRM = " + medico.getCrm() + ", CPF = '" + medico.getCpf() + "' WHERE IDMEDICO = " + medico.getIdmedico();
            return this.atualizarBanco(sql);
        }
        catch(Exception e)
        {
            return e.getMessage();
        }
    }
   
   public String excluirMedico (String idmedico)
    {
        try
        {
            String sql;
            sql = "DELETE FROM MEDICO WHERE IDMEDICO = " + idmedico;
            return this.atualizarBanco(sql);
        }
        catch(Exception e)
        {
            return e.getMessage();
        }
    }
   
   public ArrayList listarMedico ()
    {
        try
        {
            ArrayList medicos = new ArrayList();
            String sql = "SELECT * FROM MEDICO ORDER BY NOME";
            ResultSet rs = this.getResultSet(sql);
            while (rs.next())
            {
                Medico medico = new Medico();
                medico.setIdmedico(rs.getInt("IDMEDICO"));
                medico.setNome(rs.getString("NOME"));
                medico.setEspecialidade(rs.getInt("ESPECIALIDADE"));
                medico.setCrm(rs.getInt("CRM"));
                medico.setCpf(rs.getString("CPF"));
                medicos.add(medico);
            }
            return medicos;   
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
            return null;
        }
    }
}
