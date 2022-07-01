package obj;

public class dola {
public static final double dolar = 3.10;
public static final double IOF = 6.0/100;



public static double currencyConverter(double dinheiro) {
	final double Dolars = dinheiro*dolar;
	 double IOFPercent = Dolars*IOF;
		return IOFPercent+Dolars;
}
	

}
