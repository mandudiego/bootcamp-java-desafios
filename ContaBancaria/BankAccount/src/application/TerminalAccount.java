package application;

import java.util.Scanner;

public class TerminalAccount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Name: "); // Nome
		String name = sc.next();
		System.out.print("Bank branch: "); // Agencia bancária
		int bankBranch = sc.nextInt();
		System.out.print("Account number: "); // Numero da conta
		int accountNumber = sc.nextInt();
		System.out.print("Balance: "); // Saldo
		double balance = sc.nextDouble();
		
		System.out.println("Hello " + name + ", thanks for creating an account at our bank, "
				+ "your branch are " + bankBranch + ", account " + accountNumber + " and "
						+ "your balance " + balance + " is now available for withdraw");
		
		
		sc.close();
	}

}
