package lab04;

import javax.print.PrintException;

public class Retangulo implements TipoFigura{
	private double altura;
	private double largura;
	public Retangulo(double altura,double largura) {
		this.largura = largura;
		this.altura =  altura;
	}
	@Override
	public double area() throws Exception {
		return altura*largura;
	}

	@Override
	public double perimetro() throws PrintException {
		return (2*altura)+(2*largura);
	}

	@Override
	public String meutoString() {
		String result;
		result = "O retângulo criado tem altura de tamanho: " + altura + 
				"e largura de tamanho: " + largura;
		return result;
		
	}

	


}
