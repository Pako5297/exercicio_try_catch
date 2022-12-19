package TryCatch;

import java.util.Scanner;

public class MainTry {
	public static void main(String[] args) {
		Scanner tcl = new Scanner(System.in);
		Conta contaNova;
		try {
		System.out.println("Digite os dados do cliente!");
		System.out.print("Nome: ");
		String nome = tcl.nextLine();
		System.out.print("Número da conta: ");
		int conta = tcl.nextInt();
		tcl.nextLine();
		System.out.print("Saldo: ");
		double saldo = tcl.nextDouble();
		tcl.nextLine();
		System.out.print("Limite de saque: ");
		double limite = tcl.nextDouble();
		tcl.nextLine();
		contaNova = new Conta(conta,nome,saldo,limite);
		System.out.println(contaNova);
		
		System.out.print("Digite a quantia de deposito: ");
		double deposito = tcl.nextDouble();
		tcl.nextLine();
		contaNova.deposito(deposito);
		System.out.println("DADOS ATUALIZADOS");
		System.out.println(contaNova);
		System.out.print("Digite o valor para saque: ");
		double saque = tcl.nextDouble();
		tcl.nextLine();
		contaNova.Saque(saque);
		System.out.println("DADOS ATUALIZADOS");
		System.out.println(contaNova);
		}
		catch(Excecoes e){
			System.out.println(e.getMessage());
		}
		tcl.close();
		
	}

}
