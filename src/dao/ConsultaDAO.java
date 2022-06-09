package dao;
/**** @author ricar */

import factory.Conexao;
import modelo.Consulta;
import java.util.ArrayList;
import java.sql.ResultSet; //Incluí manualmente, a correção via menu da IDE não funcionou

public class ConsultaDAO extends Conexao {
    
   public String cadastrarConsulta (Consulta consulta)
   {
        try
        {
            String sql;
            sql = "INSERT INTO CONSULTA VALUES (NULL, " + consulta.getId_medico() + ", " 
                    + consulta.getId_paciente() + ",' " 
                    + consulta.getConvenio()+ "')";
            return this.atualizarBanco(sql);
        }
        catch(Exception e)
        {
            return e.getMessage();
        }
    }
    
   public String atualizarConsulta (Consulta consulta)
    {
        try
        {
            String sql;
            sql = "UPDATE CONSULTA SET ID_MEDICO = " + consulta.getId_medico() + 
                    ", ID_PACIENTE = " + consulta.getId_paciente() + 
                    ", CONVENIO = '" + consulta.getConvenio()+ "' WHERE IDCONSULTA = " + consulta.getIdconsulta();
            return this.atualizarBanco(sql);
        }
        catch(Exception e)
        {
            return e.getMessage();
        }
    }
   
   public String excluirConsulta (String idconsulta)
    {
        try
        {
            String sql;
            sql = "DELETE FROM CONSULTA WHERE IDCONSULTA = " + idconsulta;
            return this.atualizarBanco(sql);
        }
        catch(Exception e)
        {
            return e.getMessage();
        }
    }
   
   public ArrayList listarConsulta ()
    {
        try
        {
            ArrayList consultas = new ArrayList();
            String sql = "SELECT * FROM CONSULTA ORDER BY IDCONSULTA";
            ResultSet rs = this.getResultSet(sql);
            while (rs.next())
            {
                Consulta consulta = new Consulta();
                consulta.setId_medico(rs.getInt("ID_MEDICO"));
                consulta.setId_paciente(rs.getInt("ID_PACIENTE"));
                consulta.setConvenio(rs.getString("CONVENIO"));
                consultas.add(consulta);
            }
            return consultas;   
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
            return null;
        }
    }
}
