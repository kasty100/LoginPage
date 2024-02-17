import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;




public class LoginPage implements ActionListener {
	
	JFrame frame= new JFrame();
	JButton logininButton=new JButton("Login");
	JButton resetButton=new JButton("Reset");
	JTextField useridField=new JTextField();
	JPasswordField userPasswordField =new JPasswordField();
	JLabel userIDlaJLabel=new JLabel("userID");
	JLabel userPasswordJLabel=new JLabel("Password");
	JLabel massageLabel =new JLabel("This is a Test");
	
	
	
	HashMap<String, String>logininfo=new HashMap<String, String>();
	 LoginPage(HashMap<String, String>loginInfoOriginal) {
		logininfo=loginInfoOriginal;
		
		userIDlaJLabel.setBounds(50, 100, 75, 25);
		userPasswordJLabel.setBounds(50, 150, 75, 25);
		
		massageLabel.setBounds(125,250,250,35);
		massageLabel.setFont(new Font(null,Font.ITALIC,25));
		
		useridField.setBounds(125,100,200,25);
		userPasswordField.setBounds(125,150,200,30);
		
		logininButton.setBounds(125,200,100,25);
		logininButton.setFocusable(false);
		logininButton.addActionListener(this);
		
		resetButton.setBounds(225,200,100,25);
		resetButton.setFocusable(false);
		resetButton.addActionListener(this);
		
		
		
		frame.add(massageLabel);
		frame.add(userIDlaJLabel);
		frame.add(userPasswordJLabel);
		frame.add(useridField);
		frame.add(userPasswordField);
		frame.add(logininButton);
		frame.add(resetButton);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420,420);
		frame.setLayout(null);
		frame.setVisible(true);
		
		
		
	}
	private void add(JLabel userIDlaJLabel2) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource()==resetButton)
		{
			useridField.setText(null);
			userPasswordField.setText(null);
			
		}
		
	}

}
