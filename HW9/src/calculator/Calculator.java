package calculator;

import javax.swing.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.*;
import java.awt.event.*;

public class Calculator extends JFrame{
	JFrame f;

	public void go() {
		f = new JFrame();
		f.setSize(500, 700);
		f.setTitle("Calculator");
		f.setLayout(new BorderLayout());
		f.setBackground(Color.WHITE);

		JMenuBar jmb = new JMenuBar();
	    JMenu jm1 = new JMenu("View");
	    jm1.setFont(new Font("Arial", Font.PLAIN, 18));
	    JMenu jm2 = new JMenu("Edit");
	    jm2.setFont(new Font("Arial", Font.PLAIN, 18));
	    JMenu jm3 = new JMenu("Help");
	    jm3.setFont(new Font("Arial", Font.PLAIN, 18));
	    
	    jmb.add(jm1);
	    jmb.add(jm2);
	    jmb.add(jm3);
	    
	    f.setJMenuBar(jmb);
	    
	    JPanel topPanel = new JPanel();
	    JTextArea textArea = new JTextArea("0", 4, 18);
	    textArea.setFont(new Font("Arial", Font.PLAIN, 30));
	    topPanel.add(textArea);
	    
	    JPanel bottomPanel = new JPanel();
	    GridBagLayout gridBag = new GridBagLayout();
        GridBagConstraints c = new GridBagConstraints();
		bottomPanel.setLayout(gridBag);
		
        JButton btmc = new JButton("MC");
        btmc.setFont(new Font("Arial", Font.PLAIN, 18));
        JButton btmr = new JButton("MR");
        btmr.setFont(new Font("Arial", Font.PLAIN, 18));
        JButton btms = new JButton("MS");
        btms.setFont(new Font("Arial", Font.PLAIN, 18));
        JButton btmp = new JButton("M+");
        btmp.setFont(new Font("Arial", Font.PLAIN, 18));
        JButton btmm = new JButton("M-");
        btmm.setFont(new Font("Arial", Font.PLAIN, 18));
        JButton btarrow = new JButton("ก๖");
        btarrow.setFont(new Font("Arial", Font.PLAIN, 18));
        JButton btce = new JButton("CE");
        btce.setFont(new Font("Arial", Font.PLAIN, 18));
        JButton btc = new JButton("C");
        btc.setFont(new Font("Arial", Font.PLAIN, 18));
        JButton btpm = new JButton("กำ");
        btpm.setFont(new Font("Arial", Font.PLAIN, 18));
        JButton btroot = new JButton("กิ");
        btroot.setFont(new Font("Arial", Font.PLAIN, 18));
        JButton bt7 = new JButton("7");
        bt7.setFont(new Font("Arial", Font.PLAIN, 18));
        JButton bt8 = new JButton("8");
        bt8.setFont(new Font("Arial", Font.PLAIN, 18));
        JButton bt9 = new JButton("9");
        bt9.setFont(new Font("Arial", Font.PLAIN, 18));
        JButton btdivide = new JButton("/");
        btdivide.setFont(new Font("Arial", Font.PLAIN, 18));
        JButton btpercent = new JButton("%");
        btpercent.setFont(new Font("Arial", Font.PLAIN, 18));
        JButton bt4 = new JButton("4");
        bt4.setFont(new Font("Arial", Font.PLAIN, 18));
        JButton bt5 = new JButton("5");
        bt5.setFont(new Font("Arial", Font.PLAIN, 18));
        JButton bt6 = new JButton("6");
        bt6.setFont(new Font("Arial", Font.PLAIN, 18));
        JButton bttimes = new JButton("*");
        bttimes.setFont(new Font("Arial", Font.PLAIN, 18));
        JButton btreverse = new JButton("1/x");
        btreverse.setFont(new Font("Arial", Font.PLAIN, 18));
        JButton bt1 = new JButton("1");
        bt1.setFont(new Font("Arial", Font.PLAIN, 18));
        JButton bt2 = new JButton("2");
        bt2.setFont(new Font("Arial", Font.PLAIN, 18));
        JButton bt3 = new JButton("3");
        bt3.setFont(new Font("Arial", Font.PLAIN, 18));
        JButton btminus = new JButton("-");
        btminus.setFont(new Font("Arial", Font.PLAIN, 18));
        JButton btequal = new JButton("=");
        btequal.setFont(new Font("Arial", Font.PLAIN, 18));
        JButton bt0 = new JButton("0");
        bt0.setFont(new Font("Arial", Font.PLAIN, 18));
        JButton btdot = new JButton(".");
        btdot.setFont(new Font("Arial", Font.PLAIN, 18));
        JButton btplus = new JButton("+");
        btplus.setFont(new Font("Arial", Font.PLAIN, 18));
        
        bottomPanel.add(btmc);bottomPanel.add(btmr);bottomPanel.add(btms);bottomPanel.add(btmp);bottomPanel.add(btmm);
        bottomPanel.add(btarrow);bottomPanel.add(btce);bottomPanel.add(btc);bottomPanel.add(btpm);bottomPanel.add(btroot);
        bottomPanel.add(bt7);bottomPanel.add(bt8);bottomPanel.add(bt9);bottomPanel.add(btdivide);bottomPanel.add(btpercent);
        bottomPanel.add(bt4);bottomPanel.add(bt5);bottomPanel.add(bt6);bottomPanel.add(bttimes);bottomPanel.add(btreverse);
        bottomPanel.add(bt1);bottomPanel.add(bt2);bottomPanel.add(bt3);bottomPanel.add(btminus);bottomPanel.add(btequal);
        bottomPanel.add(bt0);bottomPanel.add(btdot);bottomPanel.add(btplus);
        
        c.fill=GridBagConstraints.BOTH; c.gridwidth=1; c.gridheight=1;
		c.insets=new Insets(5, 5, 5, 5); c.weightx=1; c.weighty=1;
		c.gridx=0; c.gridy=0;
		gridBag.setConstraints(btmc, c);
	    
		c.fill=GridBagConstraints.BOTH; c.gridwidth=1; c.gridheight=1;
		c.insets=new Insets(5, 5, 5, 5); c.weightx=1; c.weighty=1;
		c.gridx=1; c.gridy=0;
		gridBag.setConstraints(btmr, c);
		
		c.fill=GridBagConstraints.BOTH; c.gridwidth=1; c.gridheight=1;
		c.insets=new Insets(5, 5, 5, 5); c.weightx=1; c.weighty=1;
		c.gridx=2; c.gridy=0;
		gridBag.setConstraints(btms, c);
		
		c.fill=GridBagConstraints.BOTH; c.gridwidth=1; c.gridheight=1;
		c.insets=new Insets(5, 5, 5, 5); c.weightx=1; c.weighty=1;
		c.gridx=3; c.gridy=0;
		gridBag.setConstraints(btmp, c);
		
		c.fill=GridBagConstraints.BOTH; c.gridwidth=1; c.gridheight=1;
		c.insets=new Insets(5, 5, 5, 5); c.weightx=1; c.weighty=1;
		c.gridx=4; c.gridy=0;
		gridBag.setConstraints(btmm, c);
		
		c.fill=GridBagConstraints.BOTH; c.gridwidth=1; c.gridheight=1;
		c.insets=new Insets(5, 5, 5, 5); c.weightx=1; c.weighty=1;
		c.gridx=0; c.gridy=1;
		gridBag.setConstraints(btarrow, c);
		
		c.fill=GridBagConstraints.BOTH; c.gridwidth=1; c.gridheight=1;
		c.insets=new Insets(5, 5, 5, 5); c.weightx=1; c.weighty=1;
		c.gridx=1; c.gridy=1;
		gridBag.setConstraints(btce, c);
		
		c.fill=GridBagConstraints.BOTH; c.gridwidth=1; c.gridheight=1;
		c.insets=new Insets(5, 5, 5, 5); c.weightx=1; c.weighty=1;
		c.gridx=2; c.gridy=1;
		gridBag.setConstraints(btc, c);
		
		c.fill=GridBagConstraints.BOTH; c.gridwidth=1; c.gridheight=1;
		c.insets=new Insets(5, 5, 5, 5); c.weightx=1; c.weighty=1;
		c.gridx=3; c.gridy=1;
		gridBag.setConstraints(btpm, c);
		
		c.fill=GridBagConstraints.BOTH; c.gridwidth=1; c.gridheight=1;
		c.insets=new Insets(5, 5, 5, 5); c.weightx=1; c.weighty=1;
		c.gridx=4; c.gridy=1;
		gridBag.setConstraints(btroot, c);
		
		c.fill=GridBagConstraints.BOTH; c.gridwidth=1; c.gridheight=1;
		c.insets=new Insets(5, 5, 5, 5); c.weightx=1; c.weighty=1;
		c.gridx=0; c.gridy=2;
		gridBag.setConstraints(bt7, c);
		
		c.fill=GridBagConstraints.BOTH; c.gridwidth=1; c.gridheight=1;
		c.insets=new Insets(5, 5, 5, 5); c.weightx=1; c.weighty=1;
		c.gridx=1; c.gridy=2;
		gridBag.setConstraints(bt8, c);
		
		c.fill=GridBagConstraints.BOTH; c.gridwidth=1; c.gridheight=1;
		c.insets=new Insets(5, 5, 5, 5); c.weightx=1; c.weighty=1;
		c.gridx=2; c.gridy=2;
		gridBag.setConstraints(bt9, c);
		
		c.fill=GridBagConstraints.BOTH; c.gridwidth=1; c.gridheight=1;
		c.insets=new Insets(5, 5, 5, 5); c.weightx=1; c.weighty=1;
		c.gridx=3; c.gridy=2;
		gridBag.setConstraints(btdivide, c);
		
		c.fill=GridBagConstraints.BOTH; c.gridwidth=1; c.gridheight=1;
		c.insets=new Insets(5, 5, 5, 5); c.weightx=1; c.weighty=1;
		c.gridx=4; c.gridy=2;
		gridBag.setConstraints(btpercent, c);
		
		c.fill=GridBagConstraints.BOTH; c.gridwidth=1; c.gridheight=1;
		c.insets=new Insets(5, 5, 5, 5); c.weightx=1; c.weighty=1;
		c.gridx=0; c.gridy=3;
		gridBag.setConstraints(bt4, c);
		
		c.fill=GridBagConstraints.BOTH; c.gridwidth=1; c.gridheight=1;
		c.insets=new Insets(5, 5, 5, 5); c.weightx=1; c.weighty=1;
		c.gridx=1; c.gridy=3;
		gridBag.setConstraints(bt5, c);
		
		c.fill=GridBagConstraints.BOTH; c.gridwidth=1; c.gridheight=1;
		c.insets=new Insets(5, 5, 5, 5); c.weightx=1; c.weighty=1;
		c.gridx=2; c.gridy=3;
		gridBag.setConstraints(bt6, c);
		
		c.fill=GridBagConstraints.BOTH; c.gridwidth=1; c.gridheight=1;
		c.insets=new Insets(5, 5, 5, 5); c.weightx=1; c.weighty=1;
		c.gridx=3; c.gridy=3;
		gridBag.setConstraints(bttimes, c);
		
		c.fill=GridBagConstraints.BOTH; c.gridwidth=1; c.gridheight=1;
		c.insets=new Insets(5, 5, 5, 5); c.weightx=1; c.weighty=1;
		c.gridx=4; c.gridy=3;
		gridBag.setConstraints(btreverse, c);
		
		c.fill=GridBagConstraints.BOTH; c.gridwidth=1; c.gridheight=1;
		c.insets=new Insets(5, 5, 5, 5); c.weightx=1; c.weighty=1;
		c.gridx=0; c.gridy=4;
		gridBag.setConstraints(bt1, c);
		
		c.fill=GridBagConstraints.BOTH; c.gridwidth=1; c.gridheight=1;
		c.insets=new Insets(5, 5, 5, 5); c.weightx=1; c.weighty=1;
		c.gridx=1; c.gridy=4;
		gridBag.setConstraints(bt2, c);
		
		c.fill=GridBagConstraints.BOTH; c.gridwidth=1; c.gridheight=1;
		c.insets=new Insets(5, 5, 5, 5); c.weightx=1; c.weighty=1;
		c.gridx=2; c.gridy=4;
		gridBag.setConstraints(bt3, c);
		
		c.fill=GridBagConstraints.BOTH; c.gridwidth=1; c.gridheight=1;
		c.insets=new Insets(5, 5, 5, 5); c.weightx=1; c.weighty=1;
		c.gridx=3; c.gridy=4;
		gridBag.setConstraints(btminus, c);
		
		c.fill=GridBagConstraints.BOTH; c.gridwidth=1; c.gridheight=2;
		c.insets=new Insets(5, 5, 5, 5); c.weightx=1; c.weighty=1;
		c.gridx=4; c.gridy=4;
		gridBag.setConstraints(btequal, c);
		
		c.fill=GridBagConstraints.BOTH; c.gridwidth=2; c.gridheight=1;
		c.insets=new Insets(5, 5, 5, 5); c.weightx=1; c.weighty=1;
		c.gridx=0; c.gridy=5;
		gridBag.setConstraints(bt0, c);
		
		c.fill=GridBagConstraints.BOTH; c.gridwidth=1; c.gridheight=1;
		c.insets=new Insets(5, 5, 5, 5); c.weightx=1; c.weighty=1;
		c.gridx=2; c.gridy=5;
		gridBag.setConstraints(btdot, c);
		
		c.fill=GridBagConstraints.BOTH; c.gridwidth=1; c.gridheight=1;
		c.insets=new Insets(5, 5, 5, 5); c.weightx=1; c.weighty=1;
		c.gridx=3; c.gridy=5;
		gridBag.setConstraints(btplus, c);
		
		//topPanel.setPreferredSize(new Dimension(400, 200));
		bottomPanel.setPreferredSize(new Dimension(450, 450));
		
		f.setLayout(new FlowLayout());
		f.add(topPanel);
		f.add(bottomPanel);
		
	    f.setVisible(true);
	    f.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}



