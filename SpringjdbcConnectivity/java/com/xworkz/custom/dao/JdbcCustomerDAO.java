package com.xworkz.custom.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.sql.DataSource;

import com.xworkz.custom.Customer;

public class JdbcCustomerDAO implements CustomerDAO {
	public static void main(String[] args) throws ClassNotFoundException, ServletException, SQLException 
    {

        try
        {
            Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/customer=root&password=root"); 
            Statement   s = (Statement) conn.createStatement();
            int result = s.executeUpdate("CREATE DATABASE databasename");
        }


        catch ( Exception e)
        {
            e.printStackTrace();
        }
}

}
