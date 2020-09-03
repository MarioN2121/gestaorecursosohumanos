
package db.util;

import java.sql.*;

public class ConexaoDB {
    
    public static Connection ligarBD(){
        
        //em substituiçao do localhost podemos 127.0.0.1
        String URL_DB="jdbc:mysql://localhost:3306/gestaorh?serverTimezone=UTC";
        String DRIVER8="com.mysql.cj.jdbc.Driver";
        String DRIVER5="com.mysql.jdbc.Driver";
        String USER="root";
        String PASSWORD="root";
        Connection conn;
        
        try{
            Class.forName(DRIVER8);
            return conn=DriverManager.getConnection(URL_DB, USER, PASSWORD);
        }catch(ClassNotFoundException | SQLException ex){
            System.err.println("Erro de connexao"+ex.getLocalizedMessage());
            return null;
        }
                
    }
    
}
