/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aa2scanner;
import java.util.Scanner;
/**
 *
 * @author IFSP
 */
public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Aa2Scanner MAIN = new Aa2Scanner();
        System.out.println("Escolha uma opção\n(1) Ir para baixo - (2) Ir para cima - (3) Fechar a porta - (4) Abir a porta - (5) Escolher um andar para ir - (0) Sair");
        int escolha = scanner.nextInt();
        switch(escolha){
            case 0: System.exit(0);
            break;
            case 1: MAIN.goDown();
            break;
            case 2: MAIN.goUp();
            break;
            case 3: MAIN.closeDoor();
            break;
            case 4: MAIN.openDoor();
            break;
            case 5:
            System.out.println("Escolha um andar:");
            int andar = scanner.nextInt();
            MAIN.goUntil(andar);
        }
    }
}
