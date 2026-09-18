package SkillBuilders;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class SemesterAVG {

	private JFrame frame;
	private JTextField g1;
	private JTextField g2;
	private JTextField g3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SemesterAVG window = new SemesterAVG();
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
	public SemesterAVG() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		g1 = new JTextField();
		g1.setFont(new Font("Vladimir Script", Font.ITALIC, 11));
		g1.setBounds(160, 12, 151, 42);
		panel.add(g1);
		g1.setColumns(10);
		
		g2 = new JTextField();
		g2.setFont(new Font("Vladimir Script", Font.ITALIC, 11));
		g2.setColumns(10);
		g2.setBounds(160, 79, 151, 42);
		panel.add(g2);
		
		g3 = new JTextField();
		g3.setFont(new Font("Vladimir Script", Font.ITALIC, 11));
		g3.setColumns(10);
		g3.setBounds(160, 144, 151, 42);
		panel.add(g3);
		
		JLabel display = new JLabel("");
		display.setBounds(224, 197, 106, 53);
		panel.add(display);
		
		JButton avg = new JButton("Average");
		avg.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e)
			{
				String G1 = g1.getText();
				String G2 = g2.getText();
				String G3 = g3.getText();
				
				double G4 = Double.parseDouble(G1);
				double G5 = Double.parseDouble(G2);
				double G6 = Double.parseDouble(G3);

				double avg = (G4 + G5 + G6)/3;

				DecimalFormat dc = new DecimalFormat("0.0");
				
				display.setText("Average:" + dc.format(avg));
			}
		});
		avg.setBounds(24, 197, 145, 53);
		panel.add(avg);
		
		JLabel gr1 = new JLabel("Enter the first grade:");
		gr1.setBounds(10, 11, 126, 42);
		panel.add(gr1);
		
		JLabel gr2 = new JLabel("Enter the second grade:");
		gr2.setBounds(10, 78, 126, 42);
		panel.add(gr2);
		
		JLabel gr3 = new JLabel("Enter the third grade:");
		gr3.setBounds(10, 141, 126, 42);
		panel.add(gr3);
		
	
	}
}
