import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JLabel;

public class classDemo {

	private JFrame frame;
	private JTextField FN;
	private JTextField LN;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					classDemo window = new classDemo();
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
	public classDemo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 644, 301);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		FN = new JTextField();
		FN.setFont(new Font("Vladimir Script", Font.ITALIC, 11));
		FN.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e)
			{
				if(FN.getText().equals("Enter your first name"))
				{
					FN.setText(""); 
				}
				
			
			}
		});
		FN.setText("Enter your first name");
		FN.setBounds(25, 25, 118, 35);
		panel.add(FN);
		FN.setColumns(10);
		
		LN = new JTextField();
		LN.setFont(new Font("Vladimir Script", Font.ITALIC, 11));
		LN.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e)
			{
				if(LN.getText().equals("Enter your last name"))
				{
					LN.setText(""); 
				}
				
			}
		});
		LN.setText("Enter your last name");
		LN.setColumns(10);
		LN.setBounds(286, 25, 118, 35);
		panel.add(LN);
		
		
		
		JLabel Display = new JLabel("");
		Display.setFont(new Font("Vladimir Script", Font.ITALIC, 11));
		Display.setBounds(399, 216, 219, 35);
		panel.add(Display);
		
		JButton Submit = new JButton("Submit");
		Submit.setFont(new Font("Vladimir Script", Font.ITALIC, 11));
		Submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				String firstN = FN.getText();
				String lastN = LN.getText();
				
				Display.setText(firstN
						+ " " + lastN ); 
				
//s
			}
		});
		Submit.setBounds(25, 97, 219, 52);
		panel.add(Submit);
		
		
	}
}
