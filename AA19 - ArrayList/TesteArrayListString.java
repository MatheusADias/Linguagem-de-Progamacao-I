package aa19;
import java.util.ArrayList;
import java.util.Scanner;

public class TesteArrayListString
{

	public static void main(String[] args)
	{
		ArrayList<String> list1 = new ArrayList<>();
		ArrayList<String> list2 = new ArrayList<>();
		Scanner str = new Scanner(System.in);
		
		try
		{
			for (int i = 1; i <=10 ; i++)
			{
				System.out.println("Informe a string " + i + ":");
				list1.add(str.nextLine());
				
				if(list1.get(i-1).length() < 3)
				{
					list2.add(list1.get(i-1));
				}
			}
			
			list1.removeAll(list2);
			System.out.println("A lista tem " + list1.size() + " strings.");
		}
		catch(Exception e)
		{
			System.out.println("\nAlgum erro ocorreu.\nO programa foi fechado.");
			System.exit(1);
		}
		finally
		{
			str.close();
		}
	}

}