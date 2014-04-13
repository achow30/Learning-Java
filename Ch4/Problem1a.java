import java.awt.Graphics;
import javax.swing.JPanel;

public class Problem1a extends JPanel {
	
	public void paintComponent(Graphics g){
		
		super.paintComponent(g);
		
		int width = getWidth();
		int height = getHeight();
		int xStep = 1; //This is where the x-coordinate of the first endpoint begins (divided by 15)
		int yStep = 14; //Divide this number by 15 and it will give you the y-coordinate of the endpoint
		
		while (xStep <= 14){
			g.drawLine(0, 0, (width*xStep/15), (height*yStep/15));
			xStep++;
			yStep--;
		}
		
	}

}
