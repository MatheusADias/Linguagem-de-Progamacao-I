package aa14;
import java.util.Scanner;

public class ClothingTest {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        int choice;
        System.out.println("1 - Cadastrar Shirt\n2 - Cadastrar Trousers");
        choice = sc1.nextInt();
        
        switch(choice){
            case 1:
                String a1;
                char a2, a4;
                double a3;
                Scanner sc2 = new Scanner(System.in);

                System.out.println("Insira a descrição da camiseta: ");
                a1 = sc2.nextLine();
                
                System.out.println("Insira o código da cor da camiseta: ");
                a2 = sc2.next().trim().charAt(0);
                
                System.out.println("Insira o preço da camiseta: ");
                a3 = sc2.nextDouble();
                
                System.out.println("Insira o tamanho da camiseta: ");
                a4 = sc2.next().trim().charAt(0);
                
                Shirt s1 = new Shirt(1,a1,a2,a3,a4);
                
                System.out.println("\n");
                s1.display();
            ;
            break;
            case 2:
                String t1;
                char t2, t4, t5;
                double t3;
                Scanner sc3 = new Scanner(System.in);

                System.out.println("Insira a descrição da calça: ");
                t1 = sc3.nextLine();
                
                System.out.println("Insira o código da cor da calça: ");
                t2 = sc3.next().trim().charAt(0);
                
                System.out.println("Insira o preço da calça: ");
                t3 = sc3.nextDouble();
                
                System.out.println("Insira o tamanho da calça: ");
                t4 = sc3.next().trim().charAt(0);
                
                System.out.println("Insira o gênero da calça: ");
                t5 = sc3.next().trim().charAt(0);
                
                Trousers tt1 = new Trousers(1,t1,t2,t3,t4,t5);
                
                System.out.println("\n");
                tt1.display();
            ;
            break;
            default: System.out.println("Código inválido.");   
        }
    }
}
