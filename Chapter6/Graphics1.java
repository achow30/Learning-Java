import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import java.util.Random;

public class Graphics1 extends JPanel {
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		Random randomNumbers = new Random();
		
		int xCenter = getWidth()/2;
		int yCenter = getHeight()/2;
		int colorOne = randomNumbers.nextInt(255);
		int colorTwo = randomNumbers.nextInt(255);
		
		Color randomOne = new Color(colorOne, colorOne, 0);
		Color randomTwo = new Color(colorTwo, 0, colorTwo);
		
		for (int i = 5; i >= 1; i--) {
			if (i%2 == 0) {
				g.setColor(randomOne);
			} else {
				g.setColor(randomTwo);
			}
			g.fillOval(xCenter - i*20, yCenter - i*20, i*40, i*40);
		}
	}

}
