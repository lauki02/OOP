package RotWeissGmbH;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Window.Type;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class GUI_Access extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI_Access frame = new GUI_Access();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GUI_Access() {
		setType(Type.UTILITY);
		setTitle("Mitarbeiterzugang");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel(); getContentPane().setLayout(null); 
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane); getContentPane().setLayout(null); 
 
 JLabel lblNewLabel = new JLabel("Neue Kosteneingabe:");
 lblNewLabel.setBounds(139, 10, 134, 13);
 contentPane.add(lblNewLabel);
 
 textField = new JTextField();
 textField.setBounds(139, 34, 96, 19);
 contentPane.add(textField);
 textField.setColumns(10);
 
 JLabel lblNewLabel_1 = new JLabel("Datzugehöriger Auftrag:");
 lblNewLabel_1.setBounds(139, 78, 160, 13);
 contentPane.add(lblNewLabel_1);
 
 textField_1 = new JTextField();
 textField_1.setBounds(139, 101, 96, 19);
 contentPane.add(textField_1);
 textField_1.setColumns(10);
 
 JButton btnNewButton = new JButton("Speichern");
 btnNewButton.setBounds(341, 232, 85, 21);
 contentPane.add(btnNewButton);
	}
}
