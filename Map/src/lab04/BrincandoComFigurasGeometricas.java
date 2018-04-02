package lab04;

import javax.print.PrintException;

public class BrincandoComFigurasGeometricas {

	public static void main(String[] args) {

		FigurasGeometricas fig = new FigurasGeometricas(10, 5, 7, 25);
		
		try {
		int per;
			System.out.println(fig.);
		per = fig.p(FigurasGeometricas.C);
		
		per = fig.p(-2);
		
		per = fig.p(0);
		
		}catch(PrintException printError) {
			System.out.println("ERRO!");
		}

		fig.a(0);
		fig.a(-1);
		fig.a(2);
		fig.a(1);
		fig.a(-2);
		
		String inf = fig.toStringDaFigura(-1);
		inf = fig.toStringDaFigura(1);
		System.out.println(inf);
		inf = fig.toStringDaFigura(0);
		System.out.println(inf);
		inf = fig.toStringDaFigura(4);
		System.out.println(inf);
		inf = fig.toStringDaFigura(2);
		System.out.println(inf);
	}

}
