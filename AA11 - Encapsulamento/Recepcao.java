/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulamento;

/**
 *
 * @author Matheus Augusto
 */
public class Recepcao {
    private int id;
    private String nome;
    
    public int getId (){
        return id;
    }
        public String getNome (){
            return nome;
    }
    
        public void setId (int novoId){
        this.id = novoId;
    }
        
    public void setNome (String novoNome){
        this.nome = novoNome;
    }
}
