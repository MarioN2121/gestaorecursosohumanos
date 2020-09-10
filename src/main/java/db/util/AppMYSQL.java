
package db.util;

import dao.DepartamentoDAO;
import java.sql.*;
import rh.modelo.Departamento;

public class AppMYSQL {
    
    public static void main(String[] args) {
        String LISTA_DEPARTAMENTOS="SELECT * FROM departamento";
        
        try{
            Connection conn = ConexaoDB.ligarBD();
            
            PreparedStatement ps = conn.prepareStatement(LISTA_DEPARTAMENTOS);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                System.out.println(rs.getInt(1)+" "+rs.getString(2));
            }
            conn.close();    
           
            /*System.out.println("TESTE 1");
            DepartamentoDAO dao =new DepartamentoDAO();
            int num=1;
            for(Departamento d: dao.listaDepartamentos()){
                System.out.println(d.getSigla()+" - "+d.getNome());
            }*/
            
        }catch(Exception ex){
            System.err.println("Erro na leitura de dados"+ex);
        }
    }
    
}
