package aa21;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class MapaAlunoTeste
{

	public static void main(String[] args)
	{
		Aluno a1 = new Aluno(1, "Matheus", "SP3030687", "Linguagem de programação");
		Aluno a2 = new Aluno(2, "Thiago", "SP3035687", "Linguagem de programação");
		Aluno a3 = new Aluno(3, "Diego", "SP30301154", "Banco de dados");
		Aluno a4 = new Aluno(4, "Rafael", "SP3030454", "Engenharia de software");
		Aluno a5 = new Aluno(5, "Antônio", "SP308787", "Desenvolvimento Web");
		
		Map<Integer, Aluno> mapa = new HashMap<>();
		
		mapa.put(1, a1);
		mapa.put(2, a2);
		mapa.put(3, a3);
		mapa.put(4, a4);
		mapa.put(5, a5);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a matrícula do aluno:");
		
		try
		{
			Aluno search = mapa.get(sc.nextInt());
			
			System.out.println(
					"\nMatrícula: " + search.getMatricula() +
					"\nNome: " + search.getNome() +
					"\nProntuário: " + search.getProntuario() +
					"\nCurso: " + search.getCurso());	
		}
		catch(NullPointerException e)
		{
			System.out.println("Aluno não encontrado.\nO programa foi finalizado.");
			System.exit(1);
		}
		catch(InputMismatchException e2)
		{
			System.out.println("Você deve inserir apenas números inteiros.\nO programa foi finalizado.");
			System.exit(1);
		}
		finally
		{
			sc.close();
		}
	}

}
