package Exemplo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Entre com a sua idade: ");
		int n1 = sc.nextInt();
		
		
		if(Estrutura.verificaIdade(n1)) {
			System.out.println("Voc� tem " + n1 +" anos, voc� � maior de idade");
		}
		else {
			System.out.println("Voc� tem " + n1 +" anos, voc� � menor de idade");
		}
	}

}
