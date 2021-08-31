package lab;

import java.io.*;

public class Lab {
    /**   A buffered reader attached to the keyboard. If you store this value
      *   in a variable kbd (say), then
      * 
      *      kbd.readLine()
      * 
      *   will prompt the reader to type a line by putting in the Interactions pane
      *   a field into which to type and will then yield the string of characters
      *   the user typed in.
      */    
    public static BufferedReader getKeyboard()  {
        // Create a link to the keyboard
        return new BufferedReader(new InputStreamReader(System.in));
    }
    
    
    
    /** Prompt the reader to type a line into the interactions pane and
      * return the line that the user types. */
    public static String readKeyboardLine() throws IOException {
        BufferedReader kyboard= getKeyboard();
        String line= kyboard.readLine();
        return line;
    }
    
    /** Prompt the reader to type an integer (an int) into the interactions pane
      * and return the integer that they type. If the user types something that
      * is not an int, then issue a message (System.out.println(...) and prompts
      * again.
      */
    public static int readKeyboardInt() throws IOException {
    	try {
    		BufferedReader kyboard= getKeyboard();
    		String str = kyboard.readLine();
    		int n = Integer.parseInt(str);
    		System.out.print("you entered:");
    		System.out.println(n);
    		return n;
    	}
    	catch(NumberFormatException e) {
    		System.out.println("your input should be all integers");
    	}
        return 0;
    }
    
    /** = b**c.
          Precondition: c ?0
        */
    public static double exp(double b, int c) throws Exception{
    	try {
    		if (c < 0)
        		throw new Exception("c<0");
    		if (c == 0)
    			return 1;
    			// c > 0
    		if (c%2 == 0)
    			return exp(b*b, c / 2);
    		// c is odd and > 0
    		return b * exp(b, c-1);
    	}
    	catch(Exception e) {
    		System.out.print("error:");
    		System.out.println("c<0");
    		System.out.print("your c:");
    	}
    	return c;
    }
    
    /**   The value i such that x**i <= .00000001 but x**(i-1) is not.
          Throw MyException if x <= 0 or 1 <= x. 
       */
    public static int approach(double x) throws MyException{
        int i = 1; // stub; you have to complete this function
        try {
        	if(x<=0)
            	throw new MyException("error:x<=0");
            
            if(x>=1)
            	throw new MyException("error:x>=1");
            
            for(i=1; i<1000000000; i++) {
            	if(Math.pow(x, i)<0.1) {
            		break;
            	}
            }
            return i;
        }
        catch(MyException d) {
        	System.err.println(d.getMessage());
        	System.out.print("your x:");
        }
        return (int)x;
    }
}

class MyException extends Exception {
	MyException(){
	}
	MyException(String msg){
		super(msg);
	}
}
