import javax.swing.JFrame;

public class Graphics1Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graphics1 panel = new Graphics1();
		JFrame app = new JFrame();
		
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		app.add(panel);
		app.setSize(300, 300);
		app.setVisible(true);
	}

}
