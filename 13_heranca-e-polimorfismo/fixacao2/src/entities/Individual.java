package entities;

public class Individual extends TaxPayer {

	private Double healthExpenditures;
	
	public Individual() {
	}
	
	public Individual(String name, Double annualIncome, Double healthExpenditures) {
		super(name, annualIncome);
		this.healthExpenditures = healthExpenditures;
	}

	public Double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}

	@Override
	public Double taxesPaid() {
		Double tax1 = super.getAnnualIncome();
		if (super.getAnnualIncome() < 20000) 
			tax1 *= 0.15;
		else 
			tax1 *= 0.25;
	
		Double tax2 = getHealthExpenditures();
		if (healthExpenditures > 0) {
			tax2 *= 0.5;
		}
		return tax1 - tax2;
	}

}
