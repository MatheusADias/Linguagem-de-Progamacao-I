/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package company;

/**
 *
 * @author mat_a
 */
public class MainTest {
    public static void main(String[] args){
    
    Editor e1 = new Editor();
    e1.setName("Ricardo");
    e1.setId(1);
    e1.setEditType("Animação");
    e1.setSoftwareUsed("Adobe Premiere");
    
    GraphicIllustrator e2 = new GraphicIllustrator();
    e2.setName("Paola");
    e2.setId(2);
    e2.setToolsUsed("Adobe Illustrator");
    e2.setArtType("Modern");
    
    TechnicalWriter e3 = new TechnicalWriter();
    e3.setName("Meireles");
    e3.setId(3);
    
    Manager e4 = new Manager();
    e4.setName("Luís");
    e4.setId(4);
    e4.setLevel(4);
    e4.setSuperior("Hammer");
    
    System.out.println(
            "Nome: " + e1.getName() + "\nID: " + e1.getId() + "\nEdit type: " + e1.getEditType()+ "\nSoftware used: " + e1.getSoftwareUsed() + "\n\n" +
            "Nome: " + e2.getName() + "\nID: " + e2.getId() + "\nTools used: " + e2.getToolsUsed()+ "\nArt type: " + e2.getArtType() + "\n\n" +
            "Nome: " + e3.getName() + "\nID: " + e3.getId() + "\n\n" +
            "Nome: " + e4.getName() + "\nID: " + e4.getId() + "\nEmployees: " + "\nSuperior: " + e4.getSuperior() + "\n\n"
    );
    }
}
