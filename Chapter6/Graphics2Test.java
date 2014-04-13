import javax.swing.JFrame;

public class Graphics2Test {
	public static void main(String[] args) {
		Graphics2 panel = new Graphics2();
		JFrame app = new JFrame();
		
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		app.add(panel);
		app.setSize(300, 300);
		app.setVisible(true);
	}
}
