import javax.swing.JFrame;

public class GraphicsProblem1Test {
	public static void main(String[] args) {
		GraphicsProblem1 panelThing = new GraphicsProblem1();
		
		JFrame app = new JFrame();
		
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		app.add(panelThing);
		app.setSize(300, 300);
		app.setVisible(true);
	}
	
}
