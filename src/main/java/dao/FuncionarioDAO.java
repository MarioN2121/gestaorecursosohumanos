
package dao;


import db.util.ConexaoDB;
import rh.modelo.Funcionario;
import java.sql.*;

public class FuncionarioDAO {
    
     String INSERT="INSERT INTO funcionario VALUES(?, ?)";
    String UPDATE=" UPDATE funcionario SET nome_departamento=? WHERE sigla=?";
    String DELETE=" DELETE FROM funcionario WHERE sigla=?";
    String SELECT_ALL="SELECT * FROM funcionario";
    String SELECT_BY_NOME="SELECT * FROM funcionario WHERE nome_departamento=?";
    String SELECT_BY_SIGLA="SELECT * FROM funcionario WHERE sigla=?";
    
    
        
    public void save(Funcionario f){
        PreparedStatement ps = null;
        Connection conn = null;
        
        try{
            conn=ConexaoDB.ligarBD();
            ps = conn.prepareStatement(INSERT); 
            ps.setString(1, f.getNome());
            ps.setString(2, f.getSobrenome());
            ps.executeUpdate();
            ps.close();
            conn.close();
        }catch(SQLException e){
            System.err.println("Erro ao inserir dados: FuncionarioDAO:save"+e.getLocalizedMessage());
        }        
        
    }
}
