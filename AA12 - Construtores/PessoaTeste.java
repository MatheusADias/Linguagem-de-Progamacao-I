package pessoas;

/**
 *
 * @author mat_a
 */
public class PessoaTeste {
     public static void main(String[] args) {
        // Criando objetos com todos os construtores
        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2 = new Pessoa("Rafael");
        Pessoa pessoa3 = new Pessoa("Dwight Schrute", 68);
        Pessoa pessoa4 = new Pessoa("Michael Scott", 28, "5885.687.47-78");
        Pessoa pessoa5 = new Pessoa("Clarete Jorranson", 19, "5001.687.56-54", "Feminino");
        
        // Exibindo todos os objetos criados.
        pessoa1.exibir();
        System.out.println("\n");
        pessoa2.exibir();
        System.out.println("\n");
        pessoa3.exibir();
        System.out.println("\n");
        pessoa4.exibir();
        System.out.println("\n");
        pessoa5.exibir();
    }
}
