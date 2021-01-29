package IFSP;

public class Shirt
{
    public int ID = 1; 
    public String descricao = "Camisa gola V branca"; 
    public char colorCode = 'A';
    public double preco = 20.0; 
    public int quantidadeEstoque = 2;

    public void displayInformation()
    {
        System.out.println("Shirt ID :" + ID);
        System.out.println("Shirt description: " + descricao);
        System.out.println("Color Code: " + colorCode);
        System.out.println("Shirt price: " + preco);
        System.out.println("Quantity in stock: " + quantidadeEstoque);
    }
    
    public void alterarID()
    {}
    public void calculateShirtID()
    {}
}
