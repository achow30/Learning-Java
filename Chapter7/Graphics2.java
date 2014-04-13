import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Graphics2 extends JPanel{

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		g.setColor(Color.RED);
		
		int radius = 20;
		int centerX = getWidth()/2;
		int centerY = getHeight()/2;
		int amountOfLoops = getWidth()/radius;
		
		for(int count = 0; count < amountOfLoops; count++) {
			
		}
	}
}
