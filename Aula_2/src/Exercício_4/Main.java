package Exercício_4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		Desconto desc = new Desconto();
		
		System.out.print("Digite o valor do item: ");
		double valor = sc.nextDouble();
		desc.setValor(valor);
		
		System.out.println("\nCódigo:");
		System.out.println("1 - 5% de desconto");
		System.out.println("2 - 10% de desconto");
		System.out.println("3 - 20% de desconto");
		System.out.println("4 - 50% de desconto");
		
		System.out.print("\nDigite o código de desconto: ");
		int codigo = sc.nextInt();
		desc.setOpcao(codigo);
		
		desc.calc_Desc();
		
		double novo_valor = desc.calc_Desc();
		
		System.out.println(novo_valor);
		
	}

}
