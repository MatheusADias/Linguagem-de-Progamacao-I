/*
MATHEUS AUGUSTO DO NASCIMENTO DIAS
SP3030687
*/
package empresa;

/*
    Criando uma classe abstrata com dois campos privados: salario e nome, junto
    com seus getters e setters.
*/
public abstract class Funcionario {
    private double salario;
    private String nome;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    /*
        Criando método abstrado informarSalario, que terá seu comportamento
        definido nas subclasses.
    */
    public abstract double informarSalario();
}
