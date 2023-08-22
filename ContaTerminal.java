package desafio;

import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int numero;
		String agencia;
		String nomeCliente;
		double saldo;
		String sair;

		System.out.println("--------CONTA BANCÁRIA----------");
		System.out.println();
		System.out.println("1 - Por favor, digite o número da Conta: (1234)");
		numero = sc.nextInt();

		System.out.println("2 - Por favor, digite o número da Agência: (123-0)");
		agencia = sc.next();

		System.out.println("3 - Mostrar dados: ");
		nomeCliente = sc.next();
		sc.nextLine();

		System.out.println("4 - Mostrar saldo atual: ");
		saldo = sc.nextDouble();

  		System.out.println("0 - Sair -----");
            	leitura.nextLine();

		System.out.println();
		System.out.printf("Olá %s, obrigado por criar uma conta"
				+ "nosso banco, sua agência é %s, "
				+ "conta %d e seu saldo %.2f já está disponível"
				+ " para saque.", nomeCliente, agencia, numero, saldo, sair);

		sc.close();
	}

}


