package RotWeissGmbH;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import RotWeissGmbH.GUI_Dashboard.DruckFensterListener;

import java.awt.Rectangle;
import java.awt.Window;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Window.Type;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI_Menue extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_5;
	private JButton btnZurück_NeuerAuftrag;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI_Menue frame = new GUI_Menue();
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
	public GUI_Menue() {

		
		setType(Type.UTILITY);
		setTitle("Neuer Auftrag:");
		setBounds(new Rectangle(0, 0, 400, 400));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel(); getContentPane().setLayout(null); 
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane); getContentPane().setLayout(null); 
 
 textField = new JTextField();
 textField.setBounds(10, 47, 76, 19);
 contentPane.add(textField);
 textField.setColumns(10);
 
 textField_2 = new JTextField();
 textField_2.setBounds(222, 47, 76, 19);
 contentPane.add(textField_2);
 textField_2.setColumns(10);
 
 textField_3 = new JTextField();
 textField_3.setBounds(330, 47, 76, 19);
 contentPane.add(textField_3);
 textField_3.setColumns(10);
 
 JButton btnNewButton = new JButton("Anlegen");
 btnNewButton.setBounds(330, 232, 96, 21);
 contentPane.add(btnNewButton);
 
 JLabel lblNewLabel = new JLabel("Kunde");
 lblNewLabel.setBounds(10, 10, 76, 13);
 contentPane.add(lblNewLabel);
 
 JLabel lblNewLabel_2 = new JLabel("Anliegen");
 lblNewLabel_2.setBounds(222, 10, 76, 13);
 contentPane.add(lblNewLabel_2);
 
 JLabel lblNewLabel_3 = new JLabel("Mitarbeiter");
 lblNewLabel_3.setBounds(330, 10, 76, 13);
 contentPane.add(lblNewLabel_3);
 
 textField_5 = new JTextField();
 textField_5.setBounds(116, 47, 76, 19);
 contentPane.add(textField_5);
 textField_5.setColumns(10);
 
 JLabel lblNewLabel_5 = new JLabel("Datum");
 lblNewLabel_5.setBounds(116, 10, 76, 13);
 contentPane.add(lblNewLabel_5);
 
 btnZurück_NeuerAuftrag = new JButton("Zurück");
 btnZurück_NeuerAuftrag.setBounds(10, 231, 89, 23);
 contentPane.add(btnZurück_NeuerAuftrag);
 btnZurück_NeuerAuftrag.addActionListener (new Zurück_NeuerAuftragListener ());
	}
	
	class Zurück_NeuerAuftragListener implements ActionListener {                            // Zurück-Button
		@SuppressWarnings("null")
		public void actionPerformed (ActionEvent event) {
			GUI_Dashboard.main(null);
			System.exit(0);
			
		}
	}
	
	
}
