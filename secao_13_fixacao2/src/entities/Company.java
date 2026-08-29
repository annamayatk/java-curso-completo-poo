package entities;

public class Company extends TaxPayer {

	private Integer employees;
	
	public Company() {
	}
	
	public Company(String name, Double annualIncome, Integer employees) {
		super(name, annualIncome);
		this.employees = employees;
	}

	public Integer getEmployees() {
		return employees;
	}

	public void setEmployees(Integer employees) {
		this.employees = employees;
	}

	@Override
	public Double taxesPaid() {
		Double tax = super.getAnnualIncome();
		if (employees > 10 )
			tax *= 0.14;
		else
			tax *= 0.16;
		
		return tax;
	}

}
