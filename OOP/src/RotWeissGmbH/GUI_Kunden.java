package RotWeissGmbH;

import java.awt.EventQueue;
import java.awt.Window;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.ListSelectionModel;
import javax.swing.border.EmptyBorder;

//import RotWeissGmbH.GUI_MitarbeiterListe.Zurück_MitarbeiterListeListener;

import java.awt.Window.Type;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GUI_Kunden extends JFrame {

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
					GUI_Kunden frame = new GUI_Kunden();
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
	public GUI_Kunden() {
		setType(Type.UTILITY);
		setTitle("Kunden");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 779, 431);
		contentPane = new JPanel();getContentPane().setLayout(null);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);getContentPane().setLayout(null);
		JButton btnBack_Kunden = new JButton("Back");
		btnBack_Kunden.setBounds(10, 361, 89, 23);
		contentPane.add(btnBack_Kunden);
		btnBack_Kunden.addActionListener (new Back_KundenListener ());
		
		JList list_3 = new JList();																			//Liste
		list_3.setBounds(10, 10, 416, 341); 
		contentPane.add(list_3);
		list_3.setVisibleRowCount(10); 
		list_3.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		JLabel lblNewLabel = new JLabel("Kundennummer:");
		lblNewLabel.setBounds(436, 11, 132, 23);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(436, 44, 132, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Kundenname:");
		lblNewLabel_1.setBounds(436, 73, 132, 23);
		contentPane.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(436, 106, 132, 19);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("Delete");
		btnNewButton.setBounds(436, 330, 96, 21);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Speichern");
		btnNewButton_1.setBounds(542, 329, 96, 23);
		contentPane.add(btnNewButton_1);
		
		
		
	}
	
	class Back_KundenListener implements ActionListener {                         					  // Back-Button auf Test
		//@SuppressWarnings("null")
		public void actionPerformed (ActionEvent event) {
			Test.main(null);
			//Window frmGui = null;
			//frmGui.setVisible(false);
		}
	}
}
