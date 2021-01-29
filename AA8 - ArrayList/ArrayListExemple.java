/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylist;
import java.util.ArrayList;
 
public class ArrayListExemple {
 
  public static void main(String[] args) {
    ArrayList lista = new ArrayList();
  
    lista.add("Matheus");
    lista.add("Luís");
    lista.add("Molina");
    lista.add("Pedro");
    
    System.out.printf("Lista: %s\n", lista);
     
    lista.remove(0);
    lista.remove(lista.size()-1);
    
    System.out.printf("Lista: %s\n", lista);
  }
 
}