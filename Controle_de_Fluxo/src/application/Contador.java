package application;

import java.util.Scanner;

import exceptions.ParametersException;

public class Contador {

	public static void main(String[] args) throws ParametersException{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira o 1º parametro: ");
		int firstParameter = sc.nextInt();
		System.out.print("Insira o 2º parametro: ");
		int secondParameter = sc.nextInt();
		System.out.println();
		
		try {
			contar(firstParameter, secondParameter);
		} catch (ParametersException e) {
			e.printStackTrace();
		}
		finally {
			sc.close();
		}
	}

	
	public static void contar(int firstParameter, int secondParameter) throws ParametersException{
		if(firstParameter > secondParameter) {
			throw new ParametersException("O segundo parâmetro deve ser maior que o primeiro!");
		}
		
		int contagem = secondParameter - firstParameter;
		for (int i = 1 ; i <= contagem ; i++) {
			System.out.println("Imprimindo o número " + i);
		}
	}
}
