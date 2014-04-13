import javax.swing.JFrame;

public class Graphics2Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graphics2 panel = new Graphics2();
		JFrame app = new JFrame();
		
		app.add(panel);
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		app.setSize(300,300);
		app.setVisible(true);
	}

}
