package dao;
/**** @author ricar*/

import factory.Conexao;
import modelo.Paciente;
import java.util.ArrayList;
import java.sql.ResultSet; //Incluí manualmente, a correção via menu da IDE não funcionou

public class PacienteDAO extends Conexao {
    
    public String cadastrarPaciente (Paciente paciente)
   {
        try
        {
            String sql;
            sql = "INSERT INTO PACIENTE VALUES (NULL, '" + paciente.getNome() + "', '" 
                    + paciente.getCpf() + "', " + paciente.getIdade() + ")";
            return this.atualizarBanco(sql);
        }
        catch(Exception e)
        {
            return e.getMessage();
        }
    }
    
    public String atualizarPaciente (Paciente paciente)
    {
        try
        {
            String sql;
            sql = "UPDATE PACIENTE SET NOME = '" + paciente.getNome() + "', CPF = '" + paciente.getCpf() + "', "
                    + "Idade = " + paciente.getIdade() + " WHERE IDPACIENTE = " + paciente.getIdpaciente();
            return this.atualizarBanco(sql);
        }
        catch(Exception e)
        {
            return e.getMessage();
        }
    }
    
    public String excluirPaciente (String idpaciente)
    {
        try
        {
            String sql;
            sql = "DELETE FROM PACIENTE WHERE IDPACIENTE = " + idpaciente;
            return this.atualizarBanco(sql);
        }
        catch(Exception e)
        {
            return e.getMessage();
        }
    }
    
    public ArrayList listarPaciente ()
    {
        try
        {
            ArrayList pacientes = new ArrayList();
            String sql = "SELECT * FROM PACIENTE ORDER BY NOME";
            ResultSet rs = this.getResultSet(sql);
            while (rs.next())
            {
                Paciente paciente = new Paciente();
                paciente.setIdpaciente(rs.getInt("IDPACIENTE"));
                paciente.setNome(rs.getString("NOME"));
                paciente.setCpf(rs.getString("CPF"));
                paciente.setIdade(rs.getInt("IDADE"));
                pacientes.add(paciente);
            }
            return pacientes;   
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
            return null;
        }
    }
}
