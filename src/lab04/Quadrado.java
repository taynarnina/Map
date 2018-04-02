package lab04;

import javax.print.PrintException;

public class Quadrado implements TipoFigura {
	private double largura;
	
	public Quadrado(double largura) {
		this.largura = largura;
		
	}
	@Override
	public double area() throws Exception {
		
		return 2*largura;
	}

	@Override
	public double perimetro() throws PrintException{
		// TODO Auto-generated method stub
		
		return 4*largura;
		
	}

	@Override
	public String meutoString() {
		String res;
		res = "O quadrado criado tem lados de tamanho: " + largura;
		return res;
	}

}
