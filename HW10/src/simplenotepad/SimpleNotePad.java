package simplenotepad;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import javax.swing.*;

public class SimpleNotePad implements ActionListener {
	JFrame f;
	MenuBar menuBar;
	Menu jmFile;
	MenuItem jmiOpen, jmiSave, jmiQuit;
	TextArea jta;
	FileDialog openDia, saveDia;
	String str = null;
	StringBuffer stringBuffer = new StringBuffer();
	char[] c;
	int[] a;
	
	public SimpleNotePad() {
		f = new JFrame();
		f.setTitle("Simple Note Pad");
		
		menuBar = new MenuBar();
		jmFile = new Menu("File");
		jmiOpen = new MenuItem("Open");
		jmiSave = new MenuItem("Save");
		jmiQuit = new MenuItem("Quit");

		jmFile.setFont(new Font("Arial", Font.PLAIN, 18));
		jmiOpen.setFont(new Font("Arial", Font.PLAIN, 18));
		jmiSave.setFont(new Font("Arial", Font.PLAIN, 18));
		jmiQuit.setFont(new Font("Arial", Font.PLAIN, 18));

		menuBar.add(jmFile);
		jmFile.add(jmiOpen);
		jmFile.add(jmiSave);
		jmFile.add(jmiQuit);
		f.setMenuBar(menuBar);
		
		jmiOpen.addActionListener(this);
		jmiSave.addActionListener(this);
		
		openDia = new FileDialog(f, "Open File", FileDialog.LOAD);
		saveDia = new FileDialog(f, "Save File", FileDialog.SAVE);
		
		jta = new TextArea();
		jta.setBackground(Color.white);
		jta.setFont(new Font("Arial", 0, 16));
		f.add(jta);
		
		f.setBounds(200, 100, 600, 600);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==jmiOpen) {
			open();
			}
		else if(e.getSource()==jmiSave) {
			save();
		}
	}
	
	void open(){
		openDia.setVisible(true);
		BufferedReader br;
		try{
			jta.setText(null);
			br = new BufferedReader(new FileReader(openDia.getDirectory() + openDia.getFile()));
		    while ((str=br.readLine())!= null) {
		    	c = str.toCharArray();
		    	a = new int[str.length()];
		    	for(int i=0; i<c.length; i++) {
		    		a[i]=(int)c[i]-10;
		    		if(a[i]<0){
		    			a[i]+=255;
		    		}
		    		c[i]=(char)a[i];
		    	}
		    	str = String.valueOf(c);
		        jta.append(str+"\n");
		        }
		        br.close();
		        f.setTitle(openDia.getFile()+" - Simple Note Pad");
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	void save(){
		saveDia.setVisible(true);
		FileOutputStream out;
		try {
			out = new FileOutputStream(saveDia.getDirectory() + saveDia.getFile()+".txt");
		str = jta.getText().replace("\n", "\r\n");
		c = str.toCharArray();
		a = new int[str.length()];
		for(int i=0; i<c.length; i++){
			a[i]=(int)c[i]+10;
			if(a[i]>255){
				a[i]-=255;
			}
			c[i]=(char)a[i];
		}

		str = String.valueOf(c);
		out.write(str.getBytes());
		out.flush();
		out.close();
		f.setTitle(saveDia.getFile()+" - Simple Note Pad");
		} catch (IOException e1) {
			e1.printStackTrace();
		} 
	}
}
