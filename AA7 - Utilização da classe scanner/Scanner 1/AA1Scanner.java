/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aa1.scanner;

import java.util.Scanner;

public class AA1Scanner {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Diga 'Hello World!': ");
    String hello = scanner.nextLine();
    System.out.print("Mensagem:\n" + hello + "\n");
    }
}
