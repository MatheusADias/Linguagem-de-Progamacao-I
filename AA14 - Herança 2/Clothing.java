/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aa14;

/**
 *
 * @author mat_a
 */
public abstract class Clothing {
    private int itemID = 0; // Default ID for all clothing items
    private String description = "-description required-"; // default
    private char colorCode = 'U'; //'U' is Unset
    private double price = 0.0; // Default price for all items
    
    // Constructor
    public Clothing(int itemID, String description, char colorCode, double price) {
        this.itemID = itemID;
        this.description = description;
        this.colorCode = colorCode;
        this.price = price;
    }

    public void setItemID(int itemID) {
        this.itemID = itemID;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setColorCode(char colorCode) {
        this.colorCode = colorCode;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public String getDescription(){
        return description;
    }
    public double getPrice() {
        return price;
    }
    public int getItemID() {
        return itemID;
    }
    public char getColorCode() {
        return colorCode;
    }
    
    public void display() {
        System.out.println("Item ID: " + getItemID());
        System.out.println("Item description: " + description);
        System.out.println("Item price: " + getPrice());
        System.out.println("Color code: " + getColorCode());
    } // end of display method
}
