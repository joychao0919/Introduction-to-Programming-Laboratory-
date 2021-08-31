package datachooser;

import java.io.*;
import java.util.*;

public class DataChooser {

	public static void bubbleSort(int[] array) {
        if (null==array || array.length==0) {
            return;
        }
        int tmp;
        for (int i=0; i<array.length-1; i++) {
            for (int j=i+1; j<array.length; j++) {
                if (array[j] < array[i]) {
                    tmp = array[j];
                    array[j] = array[i];
                    array[i] = tmp;
                }
            }
        }
	}

	public static void main(String[] args) throws IOException, FileNotFoundException, NumberFormatException {
		try {			
			File file1 = new File("C:\\Users\\joych\\Desktop\\Data.txt");
			File file2 = new File("C:\\Users\\joych\\Desktop\\Data_out.txt");
			if(!file2.exists()) {
				file2.createNewFile();
			}
			BufferedReader reader = new BufferedReader(new FileReader(file1));
			PrintWriter writer = new PrintWriter(new FileWriter(file2));
			

			char[]a = new char[1000];
			int[]b = new int[36802];
			String string = reader.readLine();
			int i=0 ;
			int counter=0;

			while (string!=null) {	
				counter++;
				a = string.toCharArray();
				
				for(i=0 ; i<10000; i++) {
					if(a[i]=='6') {
						if(a[i+1]=='0') {
							if(a[i+2]=='0') {
								if(a[i+3]=='0') {
									if(a[i+4]=='1') {
										break;
									}
								}
							}
						}
					}
				}
					
				string = string.substring(i+5,i+11);
				int blank = string.indexOf("  ");
				if(blank<1) {
					string = string.substring(blank+2,string.length());
				}
				else string = string.substring(blank+1,string.length());
				
				b[counter] = Integer.valueOf(string).intValue();
				string = reader.readLine();
			}
			
			bubbleSort(b);
			
			for(int k=1 ; k<36801 ; k++) {
				writer.println(b[k]);
			}
			
			System.out.println(b[1]); //ins數列從ins[1]開始記錄
			reader.close();
			writer.close();
			
		}	
		
		catch(NumberFormatException e){
			System.out.println("Number Format Exception");
		}	
	
		catch(FileNotFoundException e){
			System.out.println("File Not Found Exception");
		}	
		
		catch(IOException e2) {
			System.out.println("IO Exception");
		}
		
		System.out.println("");
	}
}

