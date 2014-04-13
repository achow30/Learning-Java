import java.awt.Graphics;
import javax.swing.JPanel;

public class Problem2a extends JPanel{
	
	public void paintComponent(Graphics g){
		
		super.paintComponent(g);
		
		int width = getWidth();
		int height = getHeight();
		int xStep = 0; 
		int yStep = 15;
		
		while (xStep <= 15){
			g.drawLine(0, height*xStep/15, (width*(xStep+1)/15), height);
			g.drawLine(width, height*xStep/15, width*(yStep-1)/15, height);
			g.drawLine(0, height*yStep/15, width*(xStep+1)/15, 0);
			g.drawLine(width, height*yStep/15, width*(yStep-1)/15, 0);
			
			xStep++;
			yStep--;
		}
	}

}
