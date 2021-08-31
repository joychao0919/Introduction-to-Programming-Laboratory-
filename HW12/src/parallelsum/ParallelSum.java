package parallelsum;

import java.util.Random;

public class ParallelSum {
	
	public static void main(String[] args) {
		
		int[] a = new int[300];
		int sum = 0;
		
		Random r = new Random();
		
		for(int i=0; i<300; i++) {
			a[i] = r.nextInt(100)+1;
		}
		
		thread1 t1 = new thread1(a);
		t1.start();
		
		thread2 t2 = new thread2(a);
		t2.start();
		
		thread3 t3 = new thread3(a);
		t3.start();
		
		buffer b = new buffer();
		
		sum = t1.sum1 + t2.sum2 + t3.sum3;
		System.out.println(sum);
	}
}

class thread1 extends Thread {
	boolean isEmpty = true;
	int[] array = new int[300];
	int sum1 = 0;
	
	thread1(int[] array){
		this.array = array;
	}
	
	public void run() {
		for(int i=0; i<100; i++) {
			sum1 += array[i];
		}
	}
}

class thread2 extends Thread {
	int[] array = new int[300];
	int sum2 = 0;
	
	thread2(int[] array){
		this.array = array;
	}
	
	public void run() {
		for(int i=100; i<200; i++) {
			sum2 += array[i];
		}
	}
}

class thread3 extends Thread {
	int[] array = new int[300];
	int sum3 = 0;
	
	thread3(int[] array){
		this.array = array;
	}
	
	public void run() {
		for(int i=200; i<300; i++) {
			sum3 += array[i];
		}
	}
}

class buffer extends Thread {
	
}
