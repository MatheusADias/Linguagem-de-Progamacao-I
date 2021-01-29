package sobrecarga;

public class NotasTeste {
    
     public static void main(String[] args){
;    	 try {
    		 int media = Notas.mediaFinal(2,4,7,10,10);
    		 System.out.println(media);
    	 }
    	 catch(Exception e) {
    		 System.out.println("Erro na aplicação!");
    	 }
     }
}
