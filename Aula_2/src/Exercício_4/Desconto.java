package Exercício_4;

public class Desconto {
	private double valor;
	private double calc;
	private double valor_atua;
	private int opcao;
	
	
	
	public double getValor() {
		return valor;
	}



	public void setValor(double valor) {
		this.valor = valor;
	}



	public double getCalc() {
		return calc;
	}



	public void setCalc(double calc) {
		this.calc = calc;
	}



	public double getValor_atua() {
		return valor_atua;
	}



	public void setValor_atua(double valor_atua) {
		this.valor_atua = valor_atua;
	}



	public int getOpcao() {
		return opcao;
	}



	public void setOpcao(int opcao) {
		this.opcao = opcao;
	}



	public double calc_Desc() {
		
		switch (opcao) {
		 case 1:
			calc = valor * 0.05;
			valor_atua = valor - calc;
		
			return valor_atua;

		 case 2:
			 calc = valor * 0.10;
			 valor_atua = valor - calc;
			
			 return valor_atua;
			 
		case 3:
			 calc = valor * 0.20;
			 valor_atua = valor - calc;
			
			 return valor_atua;
			 
		 case 4:
			 calc = valor * 0.50;
			 valor_atua = valor - calc;
			
			 return valor_atua;
		}
		
		
		return 0;
	}

}
