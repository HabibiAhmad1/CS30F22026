package SkillBuilders;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JComboBox;
import javax.swing.JInternalFrame;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;


public class MetricConversion {

	private JFrame frmMetricConversion;
	private JTextField textField;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MetricConversion window = new MetricConversion();
					window.frmMetricConversion.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MetricConversion() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMetricConversion = new JFrame();
		frmMetricConversion.setTitle("Metric Conversion");
		frmMetricConversion.setBounds(100, 100, 450, 300);
		frmMetricConversion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMetricConversion.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Select Conversion:");
		lblNewLabel.setBounds(10, 11, 94, 28);
		frmMetricConversion.getContentPane().add(lblNewLabel);
		
		JLabel dsiplay = new JLabel("New label");
		dsiplay.setBounds(10, 50, 235, 41);
		frmMetricConversion.getContentPane().add(dsiplay);
		
		JComboBox conv = new JComboBox();
		conv.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {

		        String selected = (String) conv.getSelectedItem();

		        if(conv.getSelectedItem().equals("Inches to Centimeters"))
		        {
		        	dsiplay.setText("inch --> centimeters is selected");
		        }
		        else if (conv.getSelectedItem().equals("Feet to Meters"))
		        {
		        	dsiplay.setText("feet --> meters is selected");
		        }
		        else if (conv.getSelectedItem().equals("Gallons to Litres"))
		        {
		        	dsiplay.setText("gallons --> litres is selected");
		        }
		        else if (conv.getSelectedItem().equals("Pounds to Kilograms"))
		        {
		        	dsiplay.setText("pounds --> kilograms is selected");
		        }
		        
		    }
		});
		conv.setModel(new DefaultComboBoxModel(new String[] {"Click here", "Inches to Centimeters", "Feet to Meters", "Gallons to Litres", "Pounds to Kilograms"}));
		conv.setBounds(114, 14, 151, 22);
		frmMetricConversion.getContentPane().add(conv);
		
		textField = new JTextField();
		textField.setBounds(231, 60, 180, 49);
		frmMetricConversion.getContentPane().add(textField);
		textField.setColumns(10);
		
		
	}
}
