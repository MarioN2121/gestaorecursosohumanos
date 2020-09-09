
package dao;


import db.util.ConexaoDB;
import rh.modelo.Funcionario;
import java.sql.*;

public class FuncionarioDAO {
    
    String INSERT="INSERT INTO funcionario(nome,sobrenome) VALUES(?, ?)";
    String UPDATE=" UPDATE funcionario SET nome=? WHERE idfuncionario=?";
    String DELETE=" DELETE FROM funcionario WHERE idfuncionario=?";
    String SELECT_ALL="SELECT * FROM funcionario";
    String SELECT_BY_NOME="SELECT * FROM funcionario WHERE nome=?";
    String SELECT_BY_SOBRENOME="SELECT * FROM funcionario WHERE sobrenome=?";
    
    
        
    public void save(Funcionario f){
        PreparedStatement ps = null;
        Connection conn = null;
        
        try{
            conn=ConexaoDB.ligarBD();
            ps = conn.prepareStatement(INSERT); 
            ps.setString(1, f.getNome());
            ps.setString(2, f.getSobrenome());
            ps.setDouble(4,f.getSalario());
            ps.setDate(5,new java.sql.Date(f.getDataNascimento().getTime()));
            ps.setString(6,f.getDepartamento().getSigla());
            ps.setInt(7,f.getMunicipio().getIdMunicipio());
            
            ps.executeUpdate();
            ps.close();
            conn.close();
        }catch(SQLException e){
            System.err.println("Erro ao inserir dados: FuncionarioDAO:save"+e.getLocalizedMessage());
        }        
        
    }
}
