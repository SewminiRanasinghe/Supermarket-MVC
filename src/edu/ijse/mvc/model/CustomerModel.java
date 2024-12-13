package edu.ijse.mvc.model;

import edu.ijse.mvc.db.DBConnection;
import edu.ijse.mvc.dto.CustomerDto;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


/**
 *
 * @author anjan
 */
public class CustomerModel {
    
    public ArrayList<CustomerDto> getAll() throws Exception{
        String sql = "SELECT * FROM Customer";
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement statement = connection.prepareStatement(sql);
        
        ResultSet rst = statement.executeQuery();
        ArrayList<CustomerDto> customerDtos = new ArrayList<>();
        while (rst.next()) {            
            CustomerDto dto = new CustomerDto(
                    rst.getString("CustID"), rst.getString("CustTitle"),
                    rst.getString("CustName"), rst.getString("DOB"),
                    rst.getDouble("salary"), rst.getString("CustAddress"),
                    rst.getString("City"),
                    rst.getString("Province"), rst.getString("PostalCode"));
            customerDtos.add(dto);
        }
        return customerDtos;
    }

    public CustomerDto getCustomer(String custId) throws Exception {
        String sql = "SELECT * FROM Customer WHERE CustID = ?";
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, custId);
        
        ResultSet rst = statement.executeQuery();
        
        if (rst.next()) {            
            CustomerDto dto = new CustomerDto(
                    rst.getString("CustID"), rst.getString("CustTitle"),
                    rst.getString("CustName"), rst.getString("DOB"),
                    rst.getDouble("salary"), rst.getString("CustAddress"),
                    rst.getString("City"),
                    rst.getString("Province"), rst.getString("PostalCode"));
            return dto;
        }
        return null;
    }
    
     public String saveCustomer(CustomerDto dto) throws Exception{
        String sql = "INSERT INTO Customer VALUES(?,?,?,?,?,?,?,?,?)";
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, dto.getId());
        statement.setString(2, dto.getTitle());
        statement.setString(3, dto.getName());
        statement.setString(4, dto.getDOB());
        statement.setDouble(5, dto.getSalary());
        statement.setString(6, dto.getAddress());
        statement.setString(7, dto.getCity());
        statement.setString(8, dto.getProvince());
        statement.setString(9, dto.getPostalCode());
        
        return statement.executeUpdate() > 0 ? "Success" : "Fail";
    }
     
    public String updateCustomer(CustomerDto dto) throws Exception{
        String sql = "UPDATE Customer SET CustTitle=?, CustName=?, DOB=?,"
                + " salary=?, CustAddress=?, City=?, Province=?,"
                + " PostalCode=? WHERE CustID = ?";
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement statement = connection.prepareStatement(sql);

        statement.setString(1, dto.getTitle());
        statement.setString(2, dto.getName());
        statement.setString(3, dto.getDOB());
        statement.setDouble(4, dto.getSalary());
        statement.setString(5, dto.getAddress());
        statement.setString(6, dto.getCity());
        statement.setString(7, dto.getProvince());
        statement.setString(8, dto.getPostalCode());
        statement.setString(9, dto.getId());

        return statement.executeUpdate() > 0 ? "Success" : "Fail";
    }

     public String deleteCustomer(String custId) throws Exception{
        String sql = "DELETE from Customer WHERE CustID=?";
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement statement = connection.prepareStatement(sql);

        statement.setString(1, custId);

        return statement.executeUpdate() > 0 ? "Success" : "Fail";
    }
    
}