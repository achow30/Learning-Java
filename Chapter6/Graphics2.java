import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import java.util.Random;

public class Graphics2 extends JPanel
{
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		Random randomNumbers = new Random();
		
		int height = getHeight();
		int width = getWidth();
		
		for (int i = 1; i <= 10; i++) {
			int randomX = randomNumbers.nextInt(width);
			int randomY = randomNumbers.nextInt(height);
			int randomLength = randomNumbers.nextInt(width);
			int randomHeight = randomNumbers.nextInt(height);
			
			int rectOrOval = 1 + randomNumbers.nextInt(2);
			int redShade = randomNumbers.nextInt(256);
			int greenShade = randomNumbers.nextInt(256);
			int blueShade = randomNumbers.nextInt(256);
			
			Color randomColor = new Color(redShade, greenShade, blueShade);
			g.setColor(randomColor);
			
			if (rectOrOval == 1) {
				g.fillRect(randomX, randomY, randomLength/2, randomHeight/2);
			}
			else {
				g.fillOval(randomX, randomY, randomLength/2, randomHeight/2);
			}
		}
	}
}
