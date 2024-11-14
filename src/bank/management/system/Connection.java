package bank.management.system;

import java.sql.*;

public class Connection {

    java.sql.Connection connection;

    Statement statement;

    public Connection(){
        try{
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bms","root","admin123@123");
            statement = connection.createStatement();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
