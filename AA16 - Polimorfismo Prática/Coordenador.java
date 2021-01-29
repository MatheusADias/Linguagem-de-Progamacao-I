/*
MATHEUS AUGUSTO DO NASCIMENTO DIAS
SP3030687
*/
package empresa;

public class Coordenador extends Funcionario {
    /*
        Criando sub classe Coordenador com um construtor que irá passar o valor
        de seus argumentos para os campos 'salario' e 'nome' da classe pai (Funcionario).
    */  
    public Coordenador(double _salario, String _nome) {
       super.setSalario(_salario);
       super.setNome(_nome);
    }
    /*
        Implemento do método abstrato informarSalario que retornará o valor do salário
        vezes dois.
    */
    @Override
    public double informarSalario(){
        double salario = super.getSalario()*2;
        return salario;
    }
}
