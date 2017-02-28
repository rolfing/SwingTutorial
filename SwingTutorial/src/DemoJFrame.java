import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class DemoJFrame {

	public static void main(String[] args) {
		// Should not be in the main method
		JLabel text= new JLabel("This is a Swing Frame", JLabel.CENTER);
		text.setForeground(Color.RED);
		text.setFont(new Font("serif", Font.BOLD, 42));
		
		JFrame frame = new JFrame("Welcome to Swing Training");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(text);
		frame.setSize(500, 300);
		frame.setVisible(true);
	}

}
