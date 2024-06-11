package org.example;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class Mysqljava{
        public static void main(String[] args) {
            try {
                String url = "jdbc:mysql://localhost:3306/coforgedata";
                String database = "coforgedata";
                String username = "root";
                String password = "2002";

                Connection conn = DriverManager.getConnection(url, username, password);

                String query = "CREATE TABLE STUDENT" +
                        "(sid INTEGER not null," +
                        "fname VARCHAR(50) ," +
                        "lname VARCHAR(50), " +
                        "course VARCHAR(50)," +
                        "PRIMARY KEY(sid))";
                Statement statement = conn.createStatement();
                statement.executeUpdate(query);
                System.out.println("Student table created in database coforgedata.." );

                statement.close();

            }
            catch(SQLException e){
                e.printStackTrace();
                throw new RuntimeException(e);
            }
        }


}

