/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package company;
/**
 *
 * @author mat_a
 */
public class Manager extends Employee {
    private int level;
    private String superior;
    
    public String getEmployees(){
        return "Name: " + getName() + "\nID " + getId();
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getSuperior() {
        return superior;
    }

    public void setSuperior(String superior) {
        this.superior = superior;
    }
}
