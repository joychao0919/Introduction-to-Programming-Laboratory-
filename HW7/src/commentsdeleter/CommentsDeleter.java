package commentsdeleter;

import java.io.*;

public class CommentsDeleter {
	
	public static void main(String[] args) throws IOException, FileNotFoundException {
		File file1 = new File("C:\\Users\\joych\\Desktop\\Lab7.java");
		if(!file1.exists() || file1.isDirectory()) {
			throw new FileNotFoundException();
		}
		
		File file2 = new File("C:\\Users\\joych\\Desktop\\Lab7_out.java");
		if(!file2.exists()) {
			file2.createNewFile();
		}
		BufferedReader reader = new BufferedReader(new FileReader(file1));
		PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(file2)));
		
		boolean findHead = true;
		boolean markFind = false;
		
		String tmp = null;
		tmp = reader.readLine();
		while(tmp!=null) {
			if(tmp!=null) {
				StringBuilder builder = new StringBuilder();
				for(int i=0; i<tmp.length(); i++) {
					if (tmp.charAt(i) == '/' && !(i > 0 && markFind)) {              
	                       if (i+1<tmp.length() && tmp.charAt(i+1)=='/') {    
	                           break;  
	                       } 
	                       else if (findHead && i+1<tmp.length() && tmp.charAt(i+1)=='*') {  
	                           findHead = false;  
	                           for (int j=i+1; j<tmp.length(); j++) {  
	                               i = j;  
	                               if (tmp.charAt(j) == '*' && (j+1<tmp.length() && tmp.charAt(j+1)=='/')) {  
	                                   findHead = true;  
	                                   i += 2;  
	                                   break;  
	                               }  
	                           }  
	                       }  
	                   }
					if (!findHead && tmp.charAt(i)=='*' && (i+1<tmp.length() && tmp.charAt(i+1)=='/')) {  
	                       findHead = true;  
	                       i += 2;  
	                }  
	                if (findHead && i<tmp.length()) {  
	                	if(tmp.charAt(i)=='\"' && markFind==false)             
	                    	markFind=true;  
	                    else if(tmp.charAt(i)=='\"' && markFind==true)   
	                        markFind=false;  
	                    builder.append(tmp.charAt(i));  
	                }  
				}
				tmp = builder.toString();
			}
			if (tmp.length()>0) {  
	               writer.write(tmp + "\r\n");  
	               writer.flush();  
	           }  
	           tmp = reader.readLine();  
		}
		reader.close();
		writer.close();
	}
}
