package Exercício_1;

import java.util.Scanner;

public class Main {
	
	private static final Consumo calculo = new Consumo();

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		entradaKm(sc, calculo);
		
		entradaLitro(sc, calculo);
		
		informaConsumo(calculo);
	}

	private static void informaConsumo(Consumo calculo) {
		double calculaConsumo = calculo.calculaConsumo();
		String verificaConsumo = calculo.verificaConsumo(calculaConsumo);
		System.out.println(verificaConsumo + ". Consumo do carro: " + String.format("%.2f", calculaConsumo));
	}

	private static void entradaLitro(Scanner sc, Consumo calculo) {
		System.out.print("Entre com o litro de combustivel: ");
		double litro = sc.nextDouble();
		calculo.setLitros(litro);
	}

	private static void entradaKm(Scanner sc, Consumo calculo) {
		System.out.print("Entre com o KM: ");
		double km = sc.nextDouble();
		calculo.setKm(km);
	}

}
