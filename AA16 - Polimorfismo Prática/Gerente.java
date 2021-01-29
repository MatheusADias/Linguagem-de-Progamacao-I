/*
MATHEUS AUGUSTO DO NASCIMENTO DIAS
SP3030687
*/
package empresa;

public class Gerente extends Funcionario {
    /*
        Criando sub classe Gerente com um construtor que irá passar o valor
        de seus argumentos para os campos 'salario' e 'nome' da classe pai (Funcionario).
    */  
    public Gerente(double _salario, String _nome) {
        super.setSalario(_salario);
        super.setNome(_nome);
}
    
    /*
        Implemento do método abstrato informarSalario que retornará o valor do salário
        vezes dez.
    */
    @Override
    public double informarSalario(){
        double salario = super.getSalario()*10;
        return salario;
    }
}
