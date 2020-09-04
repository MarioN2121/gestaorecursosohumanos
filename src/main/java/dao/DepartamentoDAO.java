
package dao;

import db.util.ConexaoDB;
import rh.modelo.Departamento;
import java.sql.*;

public class DepartamentoDAO {
    
    String INSERT="INSERT INTO departamento VALUES(?, ?)";
    String UPDATE=" UPDATE departamento SET nome_departamento=? WHERE sigla=?";
    String DELETE=" DELETE FROM departamento WHERE sigla=?";
    String SELECT_ALL="SELECT * FROM departamento";
    String SELECT_BY_NOME="SELECT * FROM departamento WHERE nome_departamento=?";
    String SELECT_BY_SIGLA="SELECT * FROM departamento WHERE sigla=?";
    
    
        
    public void save(Departamento d){
        PreparedStatement ps = null;
        Connection conn = null;
        try{
            conn=ConexaoDB.ligarBD();
            ps = conn.prepareStatement(INSERT); 
            ps.setString(1, d.getSigla());
            ps.setString(2, d.getNome());
            ps.executeUpdate();
            ps.close();
            conn.close();
        }catch(SQLException e){
            System.err.println("Erro ao inserir dados: DepartamentoDAO:save"+e.getLocalizedMessage());
        }
        
        
    }
    
    
    
}
