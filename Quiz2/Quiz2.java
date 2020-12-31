import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Quiz2 {

	private JFrame frame;
	private JTextField textFieldAns;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Quiz2 window = new Quiz2();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Quiz2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 630, 395);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textFieldAns = new JTextField();
		textFieldAns.setBounds(286, 116, 130, 45);
		frame.getContentPane().add(textFieldAns);
		textFieldAns.setColumns(10);
		
		JButton btnNewButton = new JButton("My weight(kg):");
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnNewButton.setBounds(78, 120, 166, 33);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_2 = new JButton("Tell Me");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				double weight;
				double water;
				
				try {
					
					weight = Double.parseDouble(textFieldAns.getText());
					water = weight * 0.033;
					
					JOptionPane.showMessageDialog(null,  "Buddy you should drink" + water + "L of water a day!");
				}catch(Exception e) {
					JOptionPane.showMessageDialog(null,  "Please Enter Valid Number");
				}
					
			}
		});
		btnNewButton_2.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		btnNewButton_2.setBounds(199, 208, 153, 45);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_1_1 = new JButton("How much water should i drink?");
		btnNewButton_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		btnNewButton_1_1.setBounds(78, 46, 348, 38);
		frame.getContentPane().add(btnNewButton_1_1);
		   
		
	}
}
