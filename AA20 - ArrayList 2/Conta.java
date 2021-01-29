package aa20;

public class Conta implements Comparable<Conta>{
	private int saldo;

	public int getSaldo() {
		return saldo;
	}

	public Conta(int saldo) {
		this.saldo = saldo;
	}
	
	@Override
	public int compareTo(Conta outraConta)
	{ 
		if (this.saldo > outraConta.getSaldo())
		{ 
			return -1; 
		}
		if (this.saldo < outraConta.getSaldo())
		{ 
			return 1; 
		} 
		else
		{
			return 0;
		}
	}
}
