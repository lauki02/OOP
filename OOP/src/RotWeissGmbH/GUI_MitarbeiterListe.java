package RotWeissGmbH;

import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.ListSelectionModel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import RotWeissGmbH.GUI_Menue.Zurück_NeuerAuftragListener;

import java.awt.Window.Type;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import java.awt.Rectangle;
import java.awt.Window;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GUI_MitarbeiterListe extends JFrame {

	private JPanel contentPane;
	private JTextField NeuerMitarbeiter_Nummer;
	private JTextField NeuerMitarbeiter_Name;
	private ArrayList <Mitarbeiter> mitarbeiterListe;
	private JList  list_2;

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
		JButton btnBack_MitarbeiterListe = new JButton("Back");
		btnBack_MitarbeiterListe.setBounds(10, 361, 89, 23);
		contentPane.add(btnBack_MitarbeiterListe);
		 btnBack_MitarbeiterListe.addActionListener (new Back_MitarbeiterListeListener ());
		 
		 	 
	list_2 = new JList();																			//Liste
	list_2.setBounds(10, 10, 416, 341); 
	contentPane.add(list_2);
	list_2.setVisibleRowCount(10); 
	list_2.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
	list_2.addListSelectionListener(new SelectionListener());
	
	mitarbeiterListe= new ArrayList <Mitarbeiter> ();
	
	JLabel lblNewLabel = new JLabel("Mitarbeiternummer:");
	lblNewLabel.setBounds(436, 11, 132, 23);
	contentPane.add(lblNewLabel);
	
	NeuerMitarbeiter_Nummer = new JTextField();
	NeuerMitarbeiter_Nummer.setBounds(436, 44, 132, 19);
	contentPane.add(NeuerMitarbeiter_Nummer);
	NeuerMitarbeiter_Nummer.setColumns(10);
	
	JLabel lblNewLabel_1 = new JLabel("Mitarbeitername:");
	lblNewLabel_1.setBounds(436, 73, 132, 23);
	contentPane.add(lblNewLabel_1);
	
	NeuerMitarbeiter_Name = new JTextField();
	NeuerMitarbeiter_Name.setBounds(436, 106, 132, 19);
	contentPane.add(NeuerMitarbeiter_Name);
	NeuerMitarbeiter_Name.setColumns(10);
	
	JButton btnDelete = new JButton("Delete");
	btnDelete.setBounds(436, 330, 96, 21);
	contentPane.add(btnDelete);
	btnDelete.addActionListener(new DeleteListener());
	
	JButton btnSpeichern = new JButton("Speichern");
	btnSpeichern.setBounds(542, 329, 96, 23);
	contentPane.add(btnSpeichern);
	btnSpeichern.addActionListener(new SpeichernListener());
	
	
	
	}
	
	class Back_MitarbeiterListeListener implements ActionListener {                              	 	// Back-Button auf Test
		public void actionPerformed (ActionEvent event) {
			Test.main(null);
			
		}
	}
	
	
	//Aktion fuer den Speichernknopf
	class SpeichernListener implements ActionListener {
		public void actionPerformed (ActionEvent event) {
			
			
			//Pruefen ob die eingegebene MitarebiterNummer eine Zahl ist
			int MitarbeiterNummer=100;
			try {
				MitarbeiterNummer = Integer.parseInt (NeuerMitarbeiter_Nummer.getText());
			}
			catch (Exception e){
				JOptionPane.showMessageDialog(null,  "Die eingegebene Mitarbeiternummer ist keine Zahl!", "Error", JOptionPane.ERROR_MESSAGE);
				
			}
			
			//Namen in String umwandeln
			String Name;
			Name = NeuerMitarbeiter_Name.getText();
			
			
			if (MitarbeiterNummer!=0 && Name != null) {
				//Mitarbeiter anlegen
				Mitarbeiter neu = new Mitarbeiter (MitarbeiterNummer, Name);
				mitarbeiterListe.add(neu);
				MaAnzeige();
				
				NeuerMitarbeiter_Name.setText(null);
				NeuerMitarbeiter_Nummer.setText(null);
			}
		}
	}
	
	//Aktion fuer den Deleteknopf
	class DeleteListener implements ActionListener {
		public void actionPerformed (ActionEvent event) {
			int delete = list_2.getSelectedIndex();
			mitarbeiterListe.remove(delete);
			MaAnzeige();
			
		}
	}
	
	class SelectionListener implements ListSelectionListener {
		public void valueChanged (ListSelectionEvent event) {
			int bearbeiten = list_2.getSelectedIndex();
			int MaNummer;
			String MitarbeiterNr;
			String Name;
			MaNummer = mitarbeiterListe.get(bearbeiten).getMitarbeiterNummer();
			Name = mitarbeiterListe.get(bearbeiten).getName();
			MitarbeiterNr = Integer.toString(MaNummer);
			NeuerMitarbeiter_Name.setText(Name);
			NeuerMitarbeiter_Nummer.setText(MitarbeiterNr);
		}
	}
	
	public void updateMA () {
		list_2.setListData(mitarbeiterListe.toArray());
	}
	
	public void MaAnzeige() {
		ArrayList <String> MaStrings = new ArrayList <String>();
		String MaNummer;
		String Name;
		String Mitarbeiter;
		for (int i=0; i<mitarbeiterListe.size(); i++) {
			MaNummer = Integer.toString(mitarbeiterListe.get(i).getMitarbeiterNummer());
			Name = mitarbeiterListe.get(i).getName();
			Mitarbeiter = MaNummer+" | "+Name;
			MaStrings.add(Mitarbeiter);
		}
		list_2.setListData(MaStrings.toArray());	
	}
}
