package aa20;
import java.util.ArrayList;
import java.util.Collections;

public class ContaTeste {

	public static void main(String[] args) {
		Conta c1 = new Conta(100);
		Conta c2 = new Conta(1000);
		Conta c3 = new Conta(60);
		Conta c4 = new Conta(20000);
		Conta c5 = new Conta(10);
		int i = 0;
		
		ArrayList<Conta> saldoArray = new ArrayList<>();
		
		saldoArray.add(c1);
		saldoArray.add(c2);
		saldoArray.add(c3);
		saldoArray.add(c4);
		saldoArray.add(c5);
		
		Collections.sort(saldoArray);
		
		while(i < saldoArray.size()) {
			System.out.println(saldoArray.get(i).getSaldo());
			i++;
		}
	}

}
