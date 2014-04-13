import javax.swing.JFrame;

public class Problem1aTest {

	public static void main(String[] args) {
		
		Problem1a panel = new Problem1a();
		
		JFrame application = new JFrame();
		
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		application.add(panel);
		application.setSize(300,300);
		application.setVisible(true);

	}

}
