package lab04;

import javax.print.PrintException;

public interface TipoFigura {

	public double area()throws Exception;
	public double perimetro()throws PrintException;
	public String meutoString();
}
