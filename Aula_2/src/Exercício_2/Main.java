package Exercício_2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		Loja item = new Loja();
		
		System.out.print("Entre com o c�digo do item: ");
		int n = sc.nextInt();
		item.setCodigo(n);
		
		System.out.print("Entre com a quantidade: ");
		double qtde = sc.nextDouble();
		item.setQtde(qtde);
		
		double verificaLoja = item.verificaLoja(n);
		System.out.print("\nO valor total da compra : R$" + verificaLoja);
	}

}
