import java.awt.*;
import javax.swing.*;

public class WelcomePage {

	JFrame frame = new JFrame();
	JLabel welcomeLabel = new JLabel("Hello 😊😊");
	
	
	
	public WelcomePage(String userId) {
		
		welcomeLabel.setBounds(125,150,200,35);
		welcomeLabel.setFont(new Font(null,Font.BOLD,30));
		welcomeLabel.setText("Hello "+ userId+ " 😊");
		
		frame.getContentPane().setBackground(new Color(240, 227, 127));
		frame.add(welcomeLabel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420,420);
		frame.setLayout(null);
		frame.setVisible(true);
		
		
	}

}
