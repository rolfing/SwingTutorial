import java.awt.Color;
import java.awt.Font;

import javax.swing.Icon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class DemoJFrame {

	public static void main(String[] args) {
	   // The event Dispatch Thread can not start in the main
	   // So we in main method we need to invoke startUp method in the event Dispatch Thread
		SwingUtilities.invokeLater(new Runnable(){

			
			public void run() {
				new DemoJFrame().startUp();
				
			}
			
			
		});
	}
		public void startUp(){
		JLabel text= new JLabel("This is a Swing Frame",JLabel.CENTER);
		text.setForeground(Color.RED);
		text.setFont(new Font("serif", Font.BOLD, 42));		
		JFrame frame = new JFrame("Welcome to Swing Training");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(text);
		//
		frame.pack();
		frame.setVisible(true);
	}

}
