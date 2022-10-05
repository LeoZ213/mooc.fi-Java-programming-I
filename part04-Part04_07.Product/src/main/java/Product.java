/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lzhan
 */
public class Product {
    private String name;
    private double price;
    private int quantity;
    
    public Product(String name1, double price1, int quantity1) {
        this.name = name1;
        this.price = price1;
        this.quantity = quantity1;
    }
    public void printProduct() {
        System.out.println(this.name + ", " + "price " + this.price + ", " + this.quantity + " pcs");
    }
}
