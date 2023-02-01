package RotWeissGmbH;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.ListSelectionModel;
import javax.swing.border.EmptyBorder;

import RotWeissGmbH.GUI_Menue.Zurück_NeuerAuftragListener;

import java.awt.Window.Type;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import java.awt.Rectangle;
import java.awt.Window;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GUI_MitarbeiterListe extends JFrame {

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
					GUI_MitarbeiterListe frame = new GUI_MitarbeiterListe();
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
	public GUI_MitarbeiterListe() {
		setType(Type.UTILITY);
		setTitle("Mitarbeiter Liste");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 779, 431);
		contentPane = new JPanel();getContentPane().setLayout(null);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);getContentPane().setLayout(null);
		JButton btnZurück_MitarbeiterListe = new JButton("Zurück");
		btnZurück_MitarbeiterListe.setBounds(10, 361, 89, 23);
		contentPane.add(btnZurück_MitarbeiterListe);
		 btnZurück_MitarbeiterListe.addActionListener (new Zurück_MitarbeiterListeListener ());
		 
		 	 
	JList list_2 = new JList();																			//Liste
	list_2.setBounds(10, 10, 416, 341); 
	contentPane.add(list_2);
	list_2.setVisibleRowCount(10); 
	list_2.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
	
	JLabel lblNewLabel = new JLabel("Mitarbeiternummer:");
	lblNewLabel.setBounds(436, 11, 132, 23);
	contentPane.add(lblNewLabel);
	
	textField = new JTextField();
	textField.setBounds(436, 44, 132, 19);
	contentPane.add(textField);
	textField.setColumns(10);
	
	JLabel lblNewLabel_1 = new JLabel("Mitarbeitername:");
	lblNewLabel_1.setBounds(436, 73, 132, 23);
	contentPane.add(lblNewLabel_1);
	
	textField_1 = new JTextField();
	textField_1.setBounds(436, 106, 132, 19);
	contentPane.add(textField_1);
	textField_1.setColumns(10);
	
	JButton btnNewButton = new JButton("Löschen");
	btnNewButton.setBounds(436, 330, 96, 21);
	contentPane.add(btnNewButton);
	
	
	
	}
	
	class Zurück_MitarbeiterListeListener implements ActionListener {                              	 	// Zurück-Button auf Test
		public void actionPerformed (ActionEvent event) {
			Test.main(null);
			//Window frmGui = null;
			//frmGui.setVisible(false);
		}
	}
}
