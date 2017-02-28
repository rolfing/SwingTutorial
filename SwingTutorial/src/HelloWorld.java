import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class HelloWorld {

	public static void main(String[] args) {
		// This should not be in the main method
		JLabel text= new JLabel("Hello World",JLabel.CENTER);
		text.setFont(new Font("serif", Font.BOLD, 40));
		text.setForeground(Color.RED );
		
		
		
		JFrame frame= new JFrame("Swing Training");
		
		frame.getContentPane().add(text);
		frame.setVisible(true);
		frame.setSize(400, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

	

