
/*

 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.mvc.controller;

import edu.ijse.mvc.dto.CustomerDto;
import edu.ijse.mvc.model.CustomerModel;
import java.util.ArrayList;

/**
 *
 * @author anjan
 */
public class CustomerController {
    
    private CustomerModel customerModel = new CustomerModel();
    
    public ArrayList<CustomerDto> getAllCustomer() throws Exception{
        ArrayList<CustomerDto> customerDtos = customerModel.getAll();
        return customerDtos;
    }

    public CustomerDto searchCustomer(String custId) throws Exception{
        CustomerDto customerDto = customerModel.getCustomer(custId);
        return customerDto;
    }
    
     public String saveCustomer(CustomerDto dto) throws Exception{
        String resp = customerModel.saveCustomer(dto);
        return resp;
    }
     

    public String updateCustomer(CustomerDto dto) throws Exception {
         String resp = customerModel.updateCustomer(dto);
        return resp;
    }
    
    public String deleteCustomer(String custId) throws Exception {
        String resp = customerModel.deleteCustomer(custId);
        return resp;
    }
}

