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
public class Shirt extends Clothing {
    private char fit = 'U'; //'U' is Unset, other codes 'S', 'M', or 'L'
    
    public Shirt(int itemID, String description, char colorCode, double price, char fit) {
        super(itemID, description, colorCode, price);
        this.fit = fit;
    }
        
    public char getFit() {
        return fit;
    }
    public void setFit(char fit) {
        this.fit = fit;
    }
    
    //This method overrides display in the Clothing superclass
    @Override
    public void display() {
        System.out.println("Shirt ID: " + getItemID());
        System.out.println("Shirt description: " + getDescription());
        System.out.println("Shirt price: " + getPrice());
        System.out.println("Color code: " + getColorCode());
        System.out.println("Fit: " + getFit());
    } // end of display method
    // This method overrides the methods in the superclass
}
