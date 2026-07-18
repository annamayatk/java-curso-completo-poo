package utils;

public class ShippingCalculator {
	 
	private static final double HEAVY_LOAD_TAX = 20.0;
	private static final double RATE_PER_KG = 1.5;
	private static final double RATE_PER_KM = 0.35;
	private static final double HEAVY_LOAD_LIMIT = 30.0;
	
	
	public static double calculateShipping(double weight, double distance) {
		double shipping = weight * RATE_PER_KG + distance * RATE_PER_KM;
		if (weight > HEAVY_LOAD_LIMIT) {
			shipping += HEAVY_LOAD_TAX;
		}
		return shipping;
	}
}
