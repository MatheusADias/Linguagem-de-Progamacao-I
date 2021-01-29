/*
MATHEUS AUGUSTO DO NASCIMENTO DIAS
SP3030687

A explicação do código foi feita com comentários dentro das classes.
*/
package empresa;
import java.util.Scanner;

// Criando main class
public class EmpresaTeste {
    public static void main(String[] args){
        //Instanciando classe Scanner para receber entrada do usuário.
        Scanner sc1 = new Scanner(System.in);

        //Solicitando dados.
        System.out.println("Informe o nome do funcionário: ");
        String nome = sc1.nextLine();

        System.out.println("Informe o salário bruto: ");
        double salario = sc1.nextDouble();

        System.out.println("Informe o código função (1=funcionarioNormal, 2=Coordenador, 3=Gerente,4=Diretor): ");
        int codigo = sc1.nextInt();

        /*
            Cada case instancia uma classe relativa ao 'código função' do tipo
            'Funcionario' informada pelo usuário, e printa a função 'informarSalario'.
        */
        switch(codigo){
            case 1:
                Funcionario f1 = new FuncionarioNormal(salario,nome);
                System.out.println(f1.informarSalario());
                ;
            break;

            case 2:
                Funcionario f2 = new Coordenador(salario,nome);
                System.out.println(f2.informarSalario());
                ;
            break;

            case 3:
                Funcionario f3 = new Gerente(salario,nome);
                System.out.println(f3.informarSalario());
                ;
            break;

            case 4:
                Funcionario f4 = new Diretor(salario,nome);
                System.out.println(f4.informarSalario());
                ;
            break;

            default: System.out.println("Código inválido");
        }
    }
}
