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
public class Trousers extends Clothing {
    private char fit;
    private char gender = 'U';

    public Trousers(int itemID, String description, char colorCode, double price, char fit, char gender) {
        super(itemID, description, colorCode, price);
        this.fit = fit;
        this.gender = gender;
    }
    
    public int getFit() {
        return fit;
    }

    public void setFit(char fit) {
        this.fit = fit;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
    
    @Override
    public void display() {
        System.out.println("Trouser ID: " + getItemID());
        System.out.println("Trouser description: " + getDescription());
        System.out.println("Trouser price: " + getPrice());
        System.out.println("Color code: " + getColorCode());
        System.out.println("Fit: " + getFit());
        System.out.println("Fit: " + getGender());
    }
}