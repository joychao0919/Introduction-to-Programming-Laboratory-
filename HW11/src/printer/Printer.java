package printer;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Printer {
	public static void main(String[] args) {

		PrintStream out;
		try {
			out = new PrintStream("C:\\Users\\joych\\Desktop\\writer.txt");
			System.setOut(out);
			SpeakThread1 thread1 = new SpeakThread1();
			thread1.start();
			SpeakThread2 thread2 = new SpeakThread2();
			Thread t = new Thread(thread2);
			t.start();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}  
		
	}
}

class SpeakThread1 extends Thread{
	public void run() {
		for(int i=1; i<=1000; i++) {
			System.out.print("Thread:");
			System.out.println(i );
		}
	}
}

class SpeakThread2 implements Runnable{
	public void run() {
		for(int i=1; i<=1000; i++) {
			System.out.print("Runnable:");
			System.out.println(i );
		}
	}
}
