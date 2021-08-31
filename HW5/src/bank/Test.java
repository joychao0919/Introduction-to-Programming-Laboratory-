package bank;

public class Test {
	public static void main(String[] args) {
		System.out.print("oneyearRate: ");
		oneyearRateAccount test1 = new oneyearRateAccount(3000);
		test1.count();
		test1.show();
		System.out.print("oneyearNationaldebt: ");
		oneyearNationaldebtAccount test2 = new oneyearNationaldebtAccount(3000);
		test2.count();
		test2.show();
		System.out.print("interestRate: ");
		interestAccount test3 = new interestAccount(3000);
		test3.count();
		test3.show();
	}
}
