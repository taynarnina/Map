package lab04;

import javax.print.PrintException;

public class Circulo implements TipoFigura {

		private int raio;
	
		public Circulo(int raio) {
			this.raio = raio;
		}
	@Override
	public double area() throws Exception {
		
		return 2*3.14*raio;
	}

	@Override
	public double perimetro() throws PrintException {
		return 3.14*raio;
	}

	@Override
	public String meutoString() {
		String res =  "O circulo criado tem raio de tamanho: " + raio;
		return res;
	}

}
