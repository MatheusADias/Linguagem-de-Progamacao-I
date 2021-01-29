package aa19;
import java.util.ArrayList;
import java.util.Scanner;

public class TesteArrayListaNumero
{
	public static void main(String[] args)
	{
		ArrayList<Integer> numArray = new ArrayList<>();
		Scanner num = new Scanner(System.in);
		
		try
		{
			for(int i = 1; i<=10; i++)
			{
				System.out.println("Informe o número " + i + ":");
				numArray.add(num.nextInt());	
			}
			
			if(numArray.contains(1) || numArray.contains(10) || numArray.contains(100))
			{
				System.out.println("Você ganhou um bônus de R$ 50,00!");
			}
			else
			{
				System.out.println("Você não ganhou bônus.");
			}
		}
		catch(Exception e)
		{
			System.out.println("Você deve informar apenas um número inteiro.\nO programa foi fechado.");
			System.exit(1);
		}
		finally
		{
			num.close();
		}
	}
}
