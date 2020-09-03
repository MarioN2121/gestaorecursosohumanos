
package db.util;

import java.sql.*;

public class AppMYSQL {
    
    public static void main(String[] args) {
        String LISTA_DEPARTAMENTOS="SELECT * FROM departamento";
        
        try{
            Connection conn = ConecxaoDB.ligarBD();
            
            PreparedStatement ps = conn.prepareStatement(LISTA_DEPARTAMENTOS);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                System.out.println(rs.getInt(1)+" "+rs.getString(2));
            }
            conn.close();            
        }catch(SQLException ex){
            System.err.println("Erro na leitura de dados"+ex);
        }
    }
    
}
