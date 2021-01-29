/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulamento;

/**
 *
 * @author Matheus Augusto
 */

import java.util.Scanner;

public class RecepcaoTeste {
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        Recepcao rp = new Recepcao();
        
        while (true) {
            System.out.println(
                "O que deseja fazer?"
                + "\n1 - Ver valor ID"
                + "\n2 - Atribuir valor para ID"
                + "\n3 - Ver valor nome"
                + "\n4 - Atribuir valor para nome"
                + "\n0 - Sair"
            );
            int select = scan.nextInt();
            switch(select){
                case 1:
                    System.out.println("\nID armazenado: " + rp.getId() + "\n");
                break;
                case 2:
                    System.out.println("\nInsira o valor para atribuir à ID:");
                    int id = scan.nextInt();
                    rp.setId(id);
                    System.out.println("\nID inserido: " + rp.getId() + "\n");
                break;
                case 3:
                    System.out.println("\nNome armazenado: " + rp.getNome() + "\n");
                break;
                case 4:
                    System.out.println("\nInsira o valor para atribuir à nome (sem espaço):");
                    String nome = scan.next();
                    rp.setNome(nome);
                    System.out.println("\nID inserido: " + rp.getNome() + "\n"); 
                break;
                case 0:
                    System.exit(0);
                break;
                default:
                    System.out.println("\nValor inválido\n"); 
            }
        }
    }
}
