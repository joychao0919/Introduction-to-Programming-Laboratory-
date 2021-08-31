package savingsaccount;

public class Test {
	public static void main(String[] args) {
		SavingsAccount saver1 = new SavingsAccount(2000);
		SavingsAccount saver2 = new SavingsAccount(3000);
		System.out.println("rate:0.04");
		System.out.print("saver1 balance:");
		saver1.calculateMonthlyInterest();
		System.out.print("saver2 balance:");
		saver2.calculateMonthlyInterest();
		System.out.println(" ");
		
		saver1.modifyInterestRate(0.05);
		saver2.modifyInterestRate(0.05);

		System.out.println("rate:0.05");
		System.out.print("saver1 balance:");
		saver1.calculateMonthlyInterest();
		System.out.print("saver2 balance:");
		saver2.calculateMonthlyInterest();
	}
}
