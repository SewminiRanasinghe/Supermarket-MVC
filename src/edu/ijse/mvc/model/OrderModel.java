
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.mvc.model;

import edu.ijse.mvc.db.DBConnection;
import edu.ijse.mvc.dto.OrderDto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import edu.ijse.mvc.dto.ItemDto;
import edu.ijse.mvc.dto.OrderDetailDto;
import java.util.ArrayList;

/**
 *
 * @author anjan
 */
public class OrderModel {
    
    private OrderDetailModel orderDetailModel = new OrderDetailModel();
    private ItemModel itemModel = new ItemModel();

    public String placeOrder(OrderDto orderDto, ArrayList<OrderDetailDto> orderDetailDtos) throws Exception{
        Connection connection = DBConnection.getInstance().getConnection();
        try {
            connection.setAutoCommit(false);
            String orderSaveResp = saveOrder(orderDto);
            if(orderSaveResp.equalsIgnoreCase("Success")){
                boolean isOrderDetailSaved = true;
                for (OrderDetailDto orderDetailDto : orderDetailDtos) {
                    String orderDetailRsp = orderDetailModel.saveOrderDetail(orderDetailDto);
                    if(!orderDetailRsp.equalsIgnoreCase("Success")){
                        isOrderDetailSaved = false;
                    }
                }
                if(isOrderDetailSaved){
                    boolean isItemUpdate = true;
                    for (OrderDetailDto orderDetailDto : orderDetailDtos) {
                        ItemDto itemDto = itemModel.searchItem(orderDetailDto.getItemId());
                        if(itemDto != null){
                            itemDto.setQoh(itemDto.getQoh() - orderDetailDto.getQty());
                            String resp = itemModel.updateItem(itemDto);
                            if(!resp.equalsIgnoreCase("Successfully Updated")){
                                isItemUpdate = false;
                            }
                        } else {
                            connection.rollback();
                            return "Item Not Found";
                        }
                    }
                    if(isItemUpdate){
                        connection.commit();
                        return "Success";
                    } else {
                        connection.rollback();
                        return "Item Update Error";
                    }
                } else {
                    connection.rollback();
                    return "Order Detail Save Error";
                }
            } else {
                connection.rollback();
                return "Order Save Error";
            }
        } catch (Exception e) {
            throw e;
        } finally {
            connection.setAutoCommit(true);
        }
    }
    
    public String saveOrder(OrderDto orderDto) throws Exception{
        String sql = "INSERT INTO Orders VALUES (?,?,?)";
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, orderDto.getOrderId());
        statement.setString(2, orderDto.getDate());
        statement.setString(3, orderDto.getCustId());
        
        return statement.executeUpdate() > 0 ? "Success" : "Fail";
    }
    
}
