package bank;

abstract public class Bank {
	double oneyearRate = 0.0178;
	double oneyearNationaldebt = 0.0198;
	double interestRate = 0.0078;
	public abstract double count();
	public abstract void show();
}

class oneyearRateAccount extends Bank{
	double MONEY1 = 0;
	double NEW1 = 0;
	oneyearRateAccount(double money){
		MONEY1 = money;
	}
	public double count() {
		NEW1 = MONEY1 + MONEY1*oneyearRate;
		return NEW1;
	}
	public void show() {
		System.out.println(NEW1);
	}
}

class oneyearNationaldebtAccount extends Bank{
	double MONEY2 = 0;
	double NEW2 = 0;
	oneyearNationaldebtAccount(double money){
		MONEY2 = money;
	}
	public double count() {
		NEW2 = MONEY2 + MONEY2*oneyearNationaldebt;
		return NEW2;
	}
	public void show() {
		System.out.println(NEW2);
	}
}

class interestAccount extends Bank{
	double MONEY3 = 0;
	double NEW3 = 0;
	interestAccount(double money){
		MONEY3 = money;
	}
	public double count() {
		NEW3 = MONEY3 + MONEY3*interestRate;
		return NEW3;
	}
	public void show() {
		System.out.println(NEW3);
	}
}
