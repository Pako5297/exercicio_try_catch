package TryCatch;

public class Conta {
	private int numeroConta;
	private String nome;
	private double saldo;
	private double limiteSaque;

	public Conta(int numeroConta, String nome, double saldo, double limiteSaque) {
		this.numeroConta = numeroConta;
		this.nome = nome;
		this.saldo = saldo;
		this.limiteSaque = limiteSaque;
	}
	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getLimiteSaque() {
		return limiteSaque;
	}

	public void setLimiteSaque(double limiteSaque) {
		this.limiteSaque = limiteSaque;
	}

	public void deposito(double valor) {
		saldo += valor;
	}

	public void Saque(double valor) throws Excecoes{
		if (valor > saldo) {
			throw new Excecoes("Deu ruim!!! Vc não tem saldo suficiente!");
		}
		else if (valor > limiteSaque) {
			throw new Excecoes("Deu ruim, excedeu o limite de saque!!!");
		}
		else {
			saldo -= valor;
		}
	}

	@Override
	public String toString() {
		return "Nome: " 
				+ nome 
				+ "\nNúmero da conta: " 
				+ numeroConta 
				+ "\nSaldo R$" 
				+ String.format("%.2f", saldo)
				+ "\nLimite de Saque R$" 
				+ String.format("%.2f", limiteSaque);
	}

}
