package matrixcalculator;

import java.util.Random;

public class MatrixCalculator {
	public static void main(String[] args) throws InterruptedException {
		double[][] M1 = new double[1000][1000];
		double[][] M2 = new double[1000][1000];
		double[][] A1 = new double[1000][1000];
		double[][] A2 = new double[1000][1000];
		
		Random r = new Random();
		
		//int i;
		//int j;
		//int x;
		
		for(int i=0; i<1000; i++) {
			for(int j=0; j<1000; j++) {
				M1[i][j] = r.nextInt(100);
				M2[i][j] = r.nextInt(100);
			}
		}
		
		long startTime1 = System.currentTimeMillis();
		
		for(int i=0; i<1000; i++) {
			for(int j=0; j<1000; j++) {
				int tmp = 0;
				for(int x=0; x<1000; x++) {
					tmp += M1[i][x]*M2[x][j];
				}
				A1[i][j] = tmp;
			}
		}
		
		long endTime1 = System.currentTimeMillis();
		System.out.println("串行時間：" + (endTime1 - startTime1) + "ms");
		
		Thread thread1 = new Thread() {
			@Override
			public void run() {
				for(int i=0; i<250 ;i++) {
					for(int j=0; j<1000; j++) {
						int tmp = 0;
						for(int x=0; x<1000 ;x++) {
							tmp += M1[i][x]*M2[x][j];
							
						}
						A2[i][j] = tmp;
					}
				}
			}
		};
		
		Thread thread2 = new Thread() {
			@Override
			public void run() {
				for(int i=250; i<500 ;i++) {
					for(int j=0; j<1000; j++) {
						int tmp = 0;
						for(int x=0; x<1000 ;x++) {
							tmp += M1[i][x]*M2[x][j];
						}
						A2[i][j] = tmp;
					}
				}
			}
		};
        
        Thread thread3 = new Thread() {
			@Override
			public void run() {
				for(int i=500; i<750 ;i++) {
					for(int j=0; j<1000; j++) {
						int tmp = 0;
						for(int x=0; x<1000 ;x++) {
							tmp += M1[i][x]*M2[x][j];
						}
						A2[i][j] = tmp;
					}
				}
			}
		};
        
        Thread thread4 = new Thread() {
			@Override
			public void run() {
				for(int i=750; i<1000 ;i++) {
					for(int j=0; j<1000; j++) {
						int tmp = 0;
						for(int x=0; x<1000 ;x++) {
							tmp += M1[i][x]*M2[x][j];
						}
						A2[i][j] = tmp;
					}
				}
			}
		};
		
		long startTime2 = System.currentTimeMillis();
		
		thread1.start();  
		thread2.start();  
		thread3.start();  
        thread4.start();
        
        thread1.join();  
        thread2.join(); 
        thread3.join();  
        thread4.join(); 
		
		long endTime2 = System.currentTimeMillis();
		System.out.println("並行時間：" + (endTime2 - startTime2) + "ms");
		
		int flag=0;

		for(int i=0; i<1000; i++) {
			for(int j=0; j<1000; j++) {
				if(A1[i][j]==A2[i][j]) {
					continue;
				}
				else {
					flag = 1;
					break;
				}
			}
		}
		
		if(flag==1) {
			System.out.println("NO");
		}
		else {
			System.out.println("YES");
		}
	}
}

