/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;

import java.util.Scanner;
  
public class Fibonacci
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Insira a quantidade de elementos: ");
        int quantidade = scanner.nextInt();
         
        long  [] fibonacci = new long [quantidade];        
                fibonacci[0] = 0;
                fibonacci[1] = 1;
                       
        System.out.println(fibonacci[0]);
        System.out.println(fibonacci[1]);
        
        for (int n = 2 ; n < quantidade ; n++)
        {
            fibonacci[n] =  fibonacci[n-1] + fibonacci[n-2];
            System.out.println(fibonacci[n]);
            
        }
    }
}
