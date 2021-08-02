package util;

public class currencyConverter {
	
	public static double IOF = 0.06;

public static double howMuchInReais(double dollarPrice, double dollarBought) {
	return dollarPrice * dollarBought * (1.0 + IOF);
}
	
	
	
}
