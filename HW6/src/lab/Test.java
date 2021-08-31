package lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {
	public static void main(String[] args) throws Exception {
    	Lab test = new Lab();
    	test.readKeyboardInt();
    	System.out.println(test.exp(4, -3));
    	System.out.println(test.approach(0));
	}
}