/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package edu.ijse.mvc;

import edu.ijse.mvc.view.CustomerForm;
import edu.ijse.mvc.view.OrderForm;

/**
 *
 * @author META
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new CustomerForm().setVisible(true);
        new OrderForm().setVisible(true);
    }
    
}
