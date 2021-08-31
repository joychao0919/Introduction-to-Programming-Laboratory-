package fakemenu;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;

import javax.swing.*;

public class FakeMenu {
	JFrame f;
	
	public void go() {
		f = new JFrame();
		f.setSize(500, 500);
		f.setTitle("Fake Menu");
		
		JMenuBar jmb = new JMenuBar();
	    JMenu jm1 = new JMenu("File");
	    jm1.setFont(new Font("Arial", Font.PLAIN, 18));
	    JMenu jm2 = new JMenu("Edit");
	    jm2.setFont(new Font("Arial", Font.PLAIN, 18));
	    JMenu jm3 = new JMenu("Help");
	    jm3.setFont(new Font("Arial", Font.PLAIN, 18));
	    
	    JMenuItem jmi1_1 = new JMenuItem("New");
	    jmi1_1.setFont(new Font("Arial", Font.PLAIN, 18));
	    JMenuItem jmi1_2 = new JMenuItem("Open");
	    jmi1_2.setFont(new Font("Arial", Font.PLAIN, 18));
	    JMenuItem jmi1_3 = new JMenuItem("Save");
	    jmi1_3.setFont(new Font("Arial", Font.PLAIN, 18));
	    JMenuItem jmi2_1 = new JMenuItem("Copy");
	    jmi2_1.setFont(new Font("Arial", Font.PLAIN, 18));
	    JMenuItem jmi2_2 = new JMenuItem("Cut");
	    jmi2_2.setFont(new Font("Arial", Font.PLAIN, 18));
	    JMenuItem jmi2_3 = new JMenuItem("Paste");
	    jmi2_3.setFont(new Font("Arial", Font.PLAIN, 18));
	    JMenuItem jmi3_1 = new JMenuItem("About");
	    jmi3_1.setFont(new Font("Arial", Font.PLAIN, 18));
	    
	    jm1.add(jmi1_1);
	    jm1.add(jmi1_2);
	    jm1.add(jmi1_3);
	    jm2.add(jmi2_1);
	    jm2.add(jmi2_2);
	    jm2.add(jmi2_3);
	    jm3.add(jmi3_1);
	    
	    jmb.add(jm1);
	    jmb.add(jm2);
	    jmb.add(jm3);
	    
	    
	    jmi1_1.addActionListener(new ActionListener(){
	    	public void actionPerformed(ActionEvent e) {
	    		System.out.println("You Clicked New");
            }
	    });
	    
	    jmi1_2.addActionListener(new ActionListener(){
	    	public void actionPerformed(ActionEvent e) {
	    		System.out.println("You Clicked Open");
            }
	    });
	    
	    jmi1_3.addActionListener(new ActionListener(){
	    	public void actionPerformed(ActionEvent e) {
	    		System.out.println("You Clicked Save");
            }
	    });
	    
	    jmi2_1.addActionListener(new ActionListener(){
	    	public void actionPerformed(ActionEvent e) {
	    		System.out.println("You Clicked Copy");
            }
	    });
	    
	    jmi2_2.addActionListener(new ActionListener(){
	    	public void actionPerformed(ActionEvent e) {
	    		System.out.println("You Clicked Cut");
            }
	    });
	    
	    jmi2_3.addActionListener(new ActionListener(){
	    	public void actionPerformed(ActionEvent e) {
	    		System.out.println("You Clicked Paste");
            }
	    });
	    
	    jmi3_1.addActionListener(new ActionListener(){
	    	public void actionPerformed(ActionEvent e) {
	    		System.out.println("You Clicked About");
            }
	    });
	    
	    f.setLayout(new BorderLayout());
		f.setJMenuBar(jmb);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
}
