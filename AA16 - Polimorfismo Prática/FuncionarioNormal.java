/*
MATHEUS AUGUSTO DO NASCIMENTO DIAS
SP3030687
*/
package empresa;

public class FuncionarioNormal extends Funcionario {
    /*
        Criando sub classe FuncionarioNormal com um construtor que irá passar o valor
        de seus argumentos para os campos 'salario' e 'nome' da classe pai (Funcionario).
    */  
    public FuncionarioNormal(double _salario, String _nome) {
       super.setSalario(_salario);
       super.setNome(_nome);
}
    
    /*
        Implemento do método abstrato informarSalario que retornará o valor do salário.
    */
    @Override
    public double informarSalario(){
       double salario = super.getSalario();
       return salario;
    }
}
