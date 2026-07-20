package utils;

public class EnergyBillCalculator {

	private final static double AVAILABILITY_RATE_PRICE = 12.00;

	private final static double LOW_RATE_RANGE_KWH = 100.00;

	private final static double LOW_RATE_PRICE = 0.55;

	private final static double HIGH_RATE_PRICE = 0.82;

	public static double calculateEnergyBill(double kwh) {
		double energyBill = 0.0;

		if (kwh <= LOW_RATE_RANGE_KWH) {
			energyBill = kwh * LOW_RATE_PRICE;
		} else {
			energyBill = (kwh - LOW_RATE_RANGE_KWH) * HIGH_RATE_PRICE + LOW_RATE_RANGE_KWH * LOW_RATE_PRICE;
		}
		return energyBill + AVAILABILITY_RATE_PRICE;
	}

}
