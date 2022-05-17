package Database;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection {


    public static Connection Connect(){

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
           Connection Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gestionbib","root","");
             if(Con!=null){
                 System.out.println("Connected");
             }
             return Con;

        }catch (Exception E){
            System.out.println(E.getMessage()+" "+ "Not Connected");

        }
        return null ;
    }
}
