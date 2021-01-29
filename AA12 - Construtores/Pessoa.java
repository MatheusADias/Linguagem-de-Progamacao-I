/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pessoas;

/**
 *
 * @author mat_a
 */
public class Pessoa {
    private String nome;
    private int idade;
    private String cpf;
    private String sexo;
    
    //Getters
    public String getNome() {
    return nome;
    }
    public int getIdade() {
    return idade;
    }
    public String getCpf() {
    return cpf;
    }
    public String getSexo() {
    return sexo;
    }
    
    public void exibir(){
    System.out.println(
            "Nome: " + getNome() +
            "\nIdade: " + getIdade() +
            "\nCPF: " + getCpf() +
            "\nSexo: " + getSexo()
        );
    }

    // Setters
    public void setNome(String novoNome) {
        this.nome = novoNome;
    }
    public void setIdade(int novaIdade) {
        this.idade = novaIdade;
    }
    public void setCpf(String novoCpf) {
        this.nome = novoCpf;
    }
    public void setSexo (String novoSexo) {
        this.nome = novoSexo;
    }
    
    // Construtor sem argumentos. Cria um objeto com campos NULL
    public Pessoa(){
    }
    
    /*Construtor com argumento novoNome. Cria um objeto com o campo nome com
    o valor do novoNome e o resto dos campos NULL*/
    public Pessoa(String novoNome) {
        this.nome = novoNome;
    }
    
    /*Construtor com argumento novoNome e novaIdade. Cria um objeto com o campo
    nome com o valor do novoNome, o campo idade com o valor do novaIdade e o
    resto dos campos NULL*/
    public Pessoa(String novoNome, int novaIdade) {
        this.nome = novoNome;
        this.idade = novaIdade;
    }
    
    /*Construtor com argumento novoNome, novaIdade e novoCpf. Cria um objeto com
    o campo nome com o valor do novoNome, o campo idade com o valor do novaIdade,
    o campo cpf com o valor de novoCpf e o resto dos campos NULL*/
    public Pessoa(String novoNome, int novaIdade, String novoCpf) {
        this.nome = novoNome;
        this.idade = novaIdade;
        this.cpf = novoCpf;
    }
    
    /*Cria um objeto com os valores de todos os campos correspontes ao argumento
    do construtor*/
    public Pessoa(String novoNome, int novaIdade, String novoCpf, String novoSexo) {
        this.nome = novoNome;
        this.idade = novaIdade;
        this.cpf = novoCpf;
        this.sexo = novoSexo;
    }
}
