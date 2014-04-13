import java.awt.Graphics;
import javax.swing.JPanel;

public class Problem1b extends JPanel{
	
	public void paintComponent(Graphics g){
		
		super.paintComponent(g);
		
		int width = getWidth();
		int height = getHeight();
		int Corner1StepX = 1;
		int Corner1StepY = 14;
		
		while (Corner1StepX <= 14){
			g.drawLine(0, 0, (width*Corner1StepX/15), (height*Corner1StepY/15));
			g.drawLine(width, 0, width*Corner1StepY/15, height*Corner1StepY/15);
			g.drawLine(0, height, width*Corner1StepY/15, height*Corner1StepY/15);
			g.drawLine(width, height, width*Corner1StepX/15, height*Corner1StepY/15);
			
			Corner1StepX++;
			Corner1StepY--;
		}
	}

}
