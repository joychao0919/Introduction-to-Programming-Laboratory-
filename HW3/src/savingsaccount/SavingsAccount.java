package savingsaccount;

public class SavingsAccount {
	static double annualInterestRate=0.04;
	public double savingsBalance;
	
	SavingsAccount(double savings){
		savingsBalance = savings;
	}
	
	void calculateMonthlyInterest() {
		double oldSavings;
		oldSavings = savingsBalance;
		savingsBalance += savingsBalance*annualInterestRate/12;
		System.out.println(savingsBalance);
		System.out.print("interest:");
		System.out.println(savingsBalance-oldSavings);
	}
	
	void modifyInterestRate(double rate) {
		annualInterestRate = rate;
	}
}
