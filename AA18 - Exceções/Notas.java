package sobrecarga;

public class Notas {

    public static int mediaFinal(int n1, int n2) {
        return (n1 + n2) / 2;
    }
    public static int mediaFinal(int n1, int n2, int n3 ) {
        return (n1 + n2 + n3) / 3;
    }
       
    public static int mediaFinal(int n1, int n2, int n3, int n4) {
        return (n1 + n2 + n3 + n4) / 4;
    }
    public static int mediaFinal(int n1, int n2, int n3, int n4, int n5) {
        return (n1 + n2 + n3 + n4 + n5) / 5;
    }
}
