package Exercício_4_n;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double calc;
		double valor_atua;
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o valor do item: ");
		double valor = sc.nextDouble();

		System.out.println("\nCódigo:");
		System.out.println("1 - 5% de desconto");
		System.out.println("2 - 10% de desconto");
		System.out.println("3 - 20% de desconto");
		System.out.println("4 - 50% de desconto");

		System.out.print("\nDigite o código de desconto: ");
		int codigo = sc.nextInt();

		switch (codigo) {
		case 1:
			calc = valor * 0.05;
			valor_atua = valor - calc;
			System.out.println("\nO valor do desconto é: R$ " + calc);
			System.out.println("O valor atualizado é: R$ " + valor_atua);
		    break;

		case 2:
			calc = valor * 0.10;
			valor_atua = valor - calc;
			System.out.println("\nO valor do desconto é: R$ " + calc);
			System.out.println("O valor atualizado é: R$ " + valor_atua);
		    break;

		case 3:
			calc = valor * 0.20;
			valor_atua = valor - calc;
			System.out.println("\nO valor do desconto é: R$ " + calc);
			System.out.println("O valor atualizado é: R$ " + valor_atua);
		    break;

		case 4:
			calc = valor * 0.50;
			valor_atua = valor - calc;
			System.out.println("\nO valor do desconto é: R$ " + calc);
			System.out.println("O valor atualizado é: R$ " + valor_atua);
		    break;
		}

	}

}
