
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.mvc.model;

import edu.ijse.mvc.db.DBConnection;
import edu.ijse.mvc.dto.OrderDetailDto;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author anjan
 */
public class OrderDetailModel {
    public String saveOrderDetail(OrderDetailDto dto) throws Exception{
        String sql = "INSERT INTO Orderdetail VALUES (?,?,?,?)";
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, dto.getOrderId());
        statement.setString(2, dto.getItemId());
        statement.setInt(3, dto.getQty());
        statement.setInt(4, dto.getDiscount());
        
        return statement.executeUpdate() > 0 ? "Success" : "Fail";
    }
}
