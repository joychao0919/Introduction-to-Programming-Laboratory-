package fslister;

import java.io.File;

public class FSLister {
	String directory;
	
	FSLister(String directory){
		this.directory = directory;
	}

	void showFileList(String filePath) {
		File file = new File("filePath");
		if(file.isDirectory()) {
			String[] fileNames = file.list();
			for(int i=0; i<fileNames.length; i++) {
				System.out.println(fileNames[i]);
			}
		}
	}
}
