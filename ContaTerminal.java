import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String nomeCliente;
		String agencia;
		int conta;
		double saldo;
		String encerramento = "saindo...";
		
		
		System.out.println ("CONTA BANCÁRIA");

		System.out.println ("Nome do Cliente: ");
		nomeCliente = scanner.nextLine();

		System.out.println ("Digite a Agência:");
		agencia = scanner.nextLine();

		System.out.println ("Digite a Conta:");
		conta = scanner.nextInt();
		scanner.nextLine();
		

		System.out.println("Saldo atual: ");
		saldo = scanner.nextDouble();
	
		scanner.close();

		String mensagem = "Olá " + nomeCliente +", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + " conta " + conta +" e seu saldo " + saldo + " já está disponível para saque.";
		
		System.out.println(mensagem);
		System.out.println(encerramento); 
	}
}
