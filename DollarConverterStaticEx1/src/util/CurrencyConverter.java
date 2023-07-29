package util;

public class CurrencyConverter {
	public static String convertDollar(double quantity, double dollar) {
		return String.format("%.2f", ((dollar * quantity) / 100 * 6) + dollar * quantity);
	}
}
