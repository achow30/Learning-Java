import java.awt.Graphics;
import javax.swing.JPanel;

public class GraphicsProblem1 extends JPanel {
	public void paintComponent (Graphics g) {
		super.paintComponent(g);
		
		int width = getWidth();
		int height = getHeight();
		int xCenter = width/2;
		int yCenter = height/2;
		
		for (int i = 1; i < 13; i++) {
			g.drawOval(xCenter - i*10, yCenter - i*10, i*20, i*20);
		}
	}
}
