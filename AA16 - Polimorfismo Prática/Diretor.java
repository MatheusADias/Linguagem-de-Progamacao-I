/*
MATHEUS AUGUSTO DO NASCIMENTO DIAS
SP3030687
*/
package empresa;

public class Diretor extends Funcionario {
    /*
        Criando sub classe Diretor com um construtor que irá passar o valor
        de seus argumentos para os campos 'salario' e 'nome' da classe pai (Funcionario).
    */  
    public Diretor(double _salario, String _nome) {
        super.setSalario(_salario);
        super.setNome(_nome);
}
    
    /*
        Implemento do método abstrato informarSalario que retornará o valor do salário
        vezes vinte.
    */
    @Override
    public double informarSalario(){
        double salario = super.getSalario()*20;
        return salario;
    }
}
