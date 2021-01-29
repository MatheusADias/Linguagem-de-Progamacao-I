package scanner;

import java.util.Scanner;


class ScannerTeste {
	public static void main (String[] args)
	{
		 Scanner scanner = new Scanner(System.in);
		 System.out.println("Forneça nome:");
		 String username = scanner.next();
		 System.out.print("Qual a sua idade:");
		 int age = scanner.nextInt();
		 System.out.println(String.format("%s, sua idade é: %d", username, age));
		 scanner.close();
	}
}