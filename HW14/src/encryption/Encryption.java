package encryption;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Encryption {
	public static void main(String[] args) throws IOException { 
		HashMap<Character, String> code = new HashMap<Character, String>();
		code.put('a', "v");
		code.put('b', "e");
		code.put('c', "k");
		code.put('d', "n");
		code.put('e', "o");
		code.put('f', "h");
		code.put('g', "z");
		code.put('h', "f");
		code.put('i', " ");
		code.put('j', "i");
		code.put('k', "l");
		code.put('l', "j");
		code.put('m', "x");
		code.put('n', "d");
		code.put('o', "m");
		code.put('p', "y");
		code.put('q', "g");
		code.put('r', "b");
		code.put('s', "r");
		code.put('t', "c");
		code.put('u', "s");
		code.put('v', "w");
		code.put('w', "q");
		code.put('x', "u");
		code.put('y', "p");
		code.put('z', "t");
		code.put('A', "v");
		code.put('B', "e");
		code.put('C', "k");
		code.put('D', "n");
		code.put('E', "o");
		code.put('F', "h");
		code.put('G', "z");
		code.put('H', "f");
		code.put('I', " ");
		code.put('J', "i");
		code.put('K', "l");
		code.put('L', "j");
		code.put('M', "x");
		code.put('N', "d");
		code.put('O', "m");
		code.put('P', "y");
		code.put('Q', "g");
		code.put('R', "b");
		code.put('S', "r");
		code.put('T', "c");
		code.put('U', "s");
		code.put('V', "w");
		code.put('W', "q");
		code.put('X', "u");
		code.put('Y', "p");
		code.put('Z', "t");
		code.put(' ', "a");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		for(int i=0; i<str.length(); i++) {
			char c = str.charAt(i);
			System.out.print(code.get(c));
		}
	}
}
