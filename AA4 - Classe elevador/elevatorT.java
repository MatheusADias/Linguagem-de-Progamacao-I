/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elevator;

/**
 *
 * @author IFSP
 */
public class elevatorT {
    public static void main(String[] args) {
    elevator elevatorT = new elevator();
    elevatorT.goUp();
    elevatorT.goUp();
    elevatorT.goUntil(3);
    }
}