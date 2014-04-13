import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Graphics1 extends JPanel{
	public Graphics1() {
		setBackground(Color.WHITE);
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		g.setColor(Color.BLUE);
		int radius = 20;
		int size = 0;
		
		int centerX = getWidth()/2;
		int centerY = getHeight()/2;
		
		int amountOfLoops = getHeight()/(radius*2);
		
		for(int count = 0; count < amountOfLoops; count++) {
			int line = count * radius;
			if (count == 0) {
				size += radius;
			}
			else {
				size += radius*2;
			}
			
			g.drawLine(centerX + line, centerY - line, centerX + line, (centerY - line) + size);
			g.drawLine(centerX + line, (centerY - line) + size, (centerX + line) - size, (centerY - line) + size);
			g.drawLine((centerX + line) - size, (centerY - line) + size, (centerX + line) - size, centerY - (line + radius));
			g.drawLine((centerX + line) - size, centerY - (line + radius), centerX + line + radius, centerY - (line + radius));
		}
	}
}
