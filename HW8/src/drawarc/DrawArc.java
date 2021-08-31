package drawarc;

import java.awt.*;
import javax.swing.*;

public class DrawArc extends JFrame {
	public DrawArc() {
		setVisible(true);
		setSize(500, 500);
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		g.setColor(Color.GREEN);
		g.fillRect(245, 165, 10, 300 );
		
		g.setColor(Color.BLACK);
		g.setFont(new Font("Arial", Font.BOLD, 24 ));
		g.drawString("DrawArc", 50, 100 );
		
		for(int i=0; i<90; i++) {
			g.setColor(Color.BLUE);
			g.fillArc(150, 65, 200, 200, 30+3*i, 30);
			g.setColor(Color.BLUE);
			g.fillArc(150, 65, 200, 200, 120+3*i, 30);
			g.setColor(Color.BLUE);
			g.fillArc(150, 65, 200, 200, 210+3*i, 30);
			g.setColor(Color.BLUE);
			g.fillArc(150, 65, 200, 200, 300+3*i, 30);
			try {
				Thread.sleep(500); 
			}
			catch(Exception e1){}
			Color background = new Color(238, 238, 238);
			g.setColor(background);
			g.fillArc(150, 65, 200, 200, 30+3*i, 30);
			g.setColor(background);
			g.fillArc(150, 65, 200, 200, 120+3*i, 30);
			g.setColor(background);
			g.fillArc(150, 65, 200, 200, 210+3*i, 30);
			g.setColor(background);
			g.fillArc(150, 65, 200, 200, 300+3*i, 30);
			g.setColor(Color.GREEN);
			g.fillRect(245, 165, 10, 300 );
		}
	}
	
	public static void main(String[] args) { 
        DrawArc test = new DrawArc();   
        test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	}
}
