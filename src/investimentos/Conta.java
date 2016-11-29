package investimentos;

public class Conta {
	
	private Double saldo;
	private String titular;
	
	public Conta(Double saldo, String titular) {
		super();
		this.saldo = saldo;
		this.titular = titular;
	}
	
	public void adicionaSaldo(Double valor) {
		this.saldo += valor;
	}

	public Double getSaldo() {
		return saldo;
	}

	public String getTitular() {
		return titular;
	}

}
