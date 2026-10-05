package SkillBuilders;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class RollDie {
	private JFrame frame;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RollDie window = new RollDie();
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
	public RollDie() {
		initialize();
	}
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		ImageIcon die1 = new ImageIcon("../Chapter10/src/SkillBuilders/die1.gif");
		ImageIcon die2 = new ImageIcon("../Chapter10/src/SkillBuilders/die2.gif");
		ImageIcon die3 = new ImageIcon("../Chapter10/src/SkillBuilders/die3.gif");
		ImageIcon die4 = new ImageIcon("../Chapter10/src/SkillBuilders/die4.gif");
		ImageIcon die5 = new ImageIcon("../Chapter10/src/SkillBuilders/die5.gif");
		ImageIcon die6 = new ImageIcon("../Chapter10/src/SkillBuilders/die6.gif");
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 302);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel dieface = new JLabel("");
		dieface.setBounds(73, 96, 100, 100);
		panel.add(dieface);
		
		JLabel dieface2 = new JLabel("");
		dieface2.setBounds(247, 96, 100, 100);
		panel.add(dieface2);
		
		JButton btnNewButton = new JButton("Rolldie");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
int newRoll, newRoll2;
				
				newRoll = (int)(6 * Math.random() + 1);
				
				if(newRoll == 1)
				{
					dieface.setIcon(die1);
				}
				if(newRoll == 2)
				{
					dieface.setIcon(die2);
				}
				if(newRoll == 3)
				{
					dieface.setIcon(die3);
				}
				if(newRoll == 4)
				{
					dieface.setIcon(die4);
				}
				if(newRoll == 5)
				{
					dieface.setIcon(die6);
				}
				if(newRoll == 6)
				{
					dieface.setIcon(die6);
				}
				
				int newRoll21 = (int)(6 * Math.random() + 1);
				
				if(newRoll21 == 1)
				{
					dieface2.setIcon(die1);
				}
				if(newRoll21 == 2)
				{
					dieface2.setIcon(die2);
				}
				if(newRoll21 == 3)
				{
					dieface2.setIcon(die3);
				}
				if(newRoll21 == 4)
				{
					dieface2.setIcon(die4);
				}
				if(newRoll21 == 5)
				{
					dieface2.setIcon(die6);
				}
				if(newRoll21 == 6)
				{
					dieface2.setIcon(die6);
				}	
				
				
				
				
				
			
			}
			
		
		});
		btnNewButton.setBounds(118, 11, 207, 74);
		panel.add(btnNewButton);
		
		JButton Roll = new JButton("Roll Die");
		Roll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				int newRoll, newRoll2;
				
				newRoll = (int)(6 * Math.random() + 1);
				
				if(newRoll == 1)
				{
					dieface.setIcon(die1);
				}
				if(newRoll == 2)
				{
					dieface.setIcon(die2);
				}
				
			}
		});
	
	}
}

