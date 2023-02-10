package RotWeissGmbH;

import java.awt.EventQueue;
import java.awt.Window;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.ListSelectionModel;
import javax.swing.border.EmptyBorder;

import RotWeissGmbH.GUI_MitarbeiterListe.DeleteListener;
import RotWeissGmbH.GUI_MitarbeiterListe.SpeichernListener;

//import RotWeissGmbH.GUI_MitarbeiterListe.Zurück_MitarbeiterListeListener;

import java.awt.Window.Type;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GUI_Kunden extends JFrame {

	private JPanel contentPane;
	private JTextField NeuerKunde_Nummer;
	private JTextField NeuerKunde_Name;
	private ArrayList <Kunde> kundenListe;
	private JList list_3;
	

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
		
		list_3 = new JList();																			//Liste
		list_3.setBounds(10, 10, 416, 341); 
		contentPane.add(list_3);
		list_3.setVisibleRowCount(10); 
		list_3.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		JLabel lblNewLabel = new JLabel("Kundennummer:");
		lblNewLabel.setBounds(436, 11, 132, 23);
		contentPane.add(lblNewLabel);
		
		NeuerKunde_Nummer = new JTextField();
		NeuerKunde_Nummer.setBounds(436, 44, 132, 19);
		contentPane.add(NeuerKunde_Nummer);
		NeuerKunde_Nummer.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Kundenname:");
		lblNewLabel_1.setBounds(436, 73, 132, 23);
		contentPane.add(lblNewLabel_1);
		
		NeuerKunde_Name = new JTextField();
		NeuerKunde_Name.setBounds(436, 106, 132, 19);
		contentPane.add(NeuerKunde_Name);
		NeuerKunde_Name.setColumns(10);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setBounds(436, 330, 96, 21);
		contentPane.add(btnDelete);
		btnDelete.addActionListener(new DeleteListener());
		
		JButton btnSpeichern = new JButton("Speichern");
		btnSpeichern.setBounds(542, 329, 96, 23);
		contentPane.add(btnSpeichern);
		btnSpeichern.addActionListener(new SpeichernListener());
		
		
		
	}
	
	class Back_KundenListener implements ActionListener {                         					  // Back-Button auf Test
		public void actionPerformed (ActionEvent event) {
			Test.main(null);
			
		}
	}
	
	//Aktion fuer den Speichernknopf
	class SpeichernListener implements ActionListener {
		public void actionPerformed (ActionEvent event) {
			
			
			//Pruefen ob die eingegebene MitarebiterNummer eine Zahl ist
			int KundenNummer=100;
			try {
				KundenNummer = Integer.parseInt (NeuerKunde_Nummer.getText());
			}
			catch (Exception e){
				JOptionPane.showMessageDialog(null,  "Die eingegebene Kundennummer ist keine Zahl!", "Error", JOptionPane.ERROR_MESSAGE);
				
			}
			
			//Namen in String umwandeln
			String Name;
			Name = NeuerKunde_Name.getText();
			
			
			if (KundenNummer!=0 && Name != null) {
				//Mitarbeiter anlegen
				Kunde neu = new Kunde (KundenNummer, Name);
				kundenListe.add(neu);
				KuAnzeige();
				
				NeuerKunde_Name.setText(null);
				NeuerKunde_Nummer.setText(null);
			}
		}
	}
	
	//Aktion fuer den Deleteknopf
	class DeleteListener implements ActionListener {
		public void actionPerformed (ActionEvent event) {
			int delete = list_3.getSelectedIndex();
			kundenListe.remove(delete);
			KuAnzeige();
				
		}
	}
		
	public void KuAnzeige() {
		ArrayList <String> KuStrings = new ArrayList <String>();
		String KuNummer;
		String Name;
		String Kunde;
		for (int i=0; i<kundenListe.size(); i++) {
			KuNummer = Integer.toString(kundenListe.get(i).getKundenNummer());
			Name = kundenListe.get(i).getName();
			Kunde = KuNummer+" | "+Name;
			KuStrings.add(Kunde);
		}
		list_3.setListData(KuStrings.toArray());	
	}
}
