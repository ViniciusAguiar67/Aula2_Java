package Exercício_1;

public class Consumo {

	private double consumo;
	private double km;
	private double litros;

	public double getKm() {
		return km;
	}

	public void setKm(double km) {
		this.km = km;
	}

	public double getLitros() {
		return litros;
	}

	public void setLitros(double litros) {
		this.litros = litros;
	}

	public double calculaConsumo() {
		return consumo = (km * 1000) / (litros * 1000);
	}

	public String verificaConsumo(double consumo) {
		if (consumo < 8) {
			return "Venda o carro";
		} else if (consumo < 14) {
			return "Econ�mico";
		}
		return "Super Econ�mico";
	}
}
