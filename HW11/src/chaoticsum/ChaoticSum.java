package chaoticsum;

public class ChaoticSum {
	
	static int sum = 0;
	
	public static void main(String[] args) {
		Thread t = new Thread() {
			@Override
			public void run() {
				for(int i=0; i<20; i++) {
					int t = sum;
					t = t+1;
					try {Thread.sleep(1);} catch(Exception e) {}
					sum = t;
				}
			}
		};
		
		t.start();
		
		for(int i=0; i<20; i++) {
			sum = sum+1;
			try {Thread.sleep(1);} catch(Exception e) {}
		}
		
		System.out.println(sum);
	}
}
