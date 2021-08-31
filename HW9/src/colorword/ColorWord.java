package colorword;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorWord 
{
	JFrame f;
	JTextField textField;
	
	public void go() {
		f = new JFrame();
		f.setSize(600, 150);
		f.setTitle("Color Word");

		JPanel p1 = new JPanel();
		textField = new JTextField("EXAMPLE", 28);
		textField.setFont(new Font("Arial", Font.PLAIN, 24));
		p1.add(textField);
		
		JPanel p2 = new JPanel();
		JButton bt1 = new JButton("Blue");
		JButton bt2 = new JButton("Red");
		p2.setLayout(new FlowLayout());
		p2.add(bt1);
		p2.add(bt2);
		
		f.setLayout(new FlowLayout());
		f.add(p1);
		f.add(p2);
		
		BlueListener listener1 = new BlueListener();
		bt1.addActionListener(listener1);
		
		RedListener listener2 = new RedListener();
		bt2.addActionListener(listener2);
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}
	
	class BlueListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			textField.setForeground(Color.BLUE);
		}
	}
	
	class RedListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			textField.setForeground(Color.RED);
		}
	}
}
