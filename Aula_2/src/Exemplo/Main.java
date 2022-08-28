package Exemplo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Entre com a sua idade: ");
		int n1 = sc.nextInt();
		
		
		if(Estrutura.verificaIdade(n1)) {
			System.out.println("Você tem " + n1 +" anos, você é maior de idade");
		}
		else {
			System.out.println("Você tem " + n1 +" anos, você é menor de idade");
		}
	}

}
