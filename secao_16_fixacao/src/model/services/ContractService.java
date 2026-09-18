package model.services;

import java.time.LocalDate;

import entities.Contract;
import entities.Installment;

public class ContractService {
	
	private OnlinePaymentService onlinePaymentService;
	
	public ContractService(OnlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}


	public void processContract(Contract contract, Integer months) {
		
		Double installmentValue = contract.getTotalValue() / months; 
		
		for (int i=1; i<=months; i++) {
			
			LocalDate dueDate = contract.getDate().plusMonths(i);
			
			Double installmentWithInterest = installmentValue 
					+ onlinePaymentService.interest(installmentValue, i);
			
			Double installmentTotal = installmentWithInterest + onlinePaymentService.paymentFee(installmentWithInterest);
			
			Installment ins = new Installment(dueDate, installmentTotal);
			contract.getInstallments().add(ins);
		}
	}
}
