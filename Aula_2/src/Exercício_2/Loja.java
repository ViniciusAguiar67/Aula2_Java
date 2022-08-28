package Exercício_2;

public class Loja {

	private int codigo;
	private double qtde;
	private double total;

	
	
	public int getCodigo() {
		return codigo;
	}



	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}



	public double getQtde() {
		return qtde;
	}



	public void setQtde(double qtde) {
		this.qtde = qtde;
	}



	public double getTotal() {
		return total;
	}



	public void setTotal(double total) {
		this.total = total;
	}



	public double verificaLoja(int codigo) {

		if (codigo == 5) {
			return total = qtde * 32.00;
		}else if (codigo == 6) {
			return total = qtde * 45.00;
		}else if (codigo == 7) {
			return total = qtde * 37.00;
		}else if (codigo == 8) {
			return total = qtde * 40.00;
		}
		return 0;
	}

}
