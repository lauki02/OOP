package RotWeissGmbH;
import java.awt.*;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionListener;

import RotWeissGmbH.Serviceauftrag;
//import RotWeissGmbH.GUI_Dashboard.MitarbeiterFensterListener;
//import RotWeissGmbH.GUI_Dashboard.MitarbeiterListeFensterListener;

import java.awt.ScrollPane;
import java.awt.Window;
import java.awt.List;
import javax.swing.JScrollPane;
import javax.swing.JList;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JMenu;
import javax.swing.JButton;
import java.awt.Dimension;
import java.awt.Window.Type;
import java.util.*;

public class Test extends JFrame {

	public JFrame ContentPane;
	private JTextField NeuerAuftrag_Anliegen;
	private JTextField NeuerAuftrag_Kunde;
	private JTextField NeuerAuftrag_Datum;
	private JTextField NeuerAuftrag_Mitarbeiter;
	public ArrayList <Serviceauftrag> auftraege = new ArrayList<Serviceauftrag>();				//ArrayList
	public JList<?> list_1 = new JList();							//JList

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Test frame = new Test();
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
	public Test() {
		setType(Type.UTILITY);
		setTitle("NeueGUI");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 779, 431);
		JPanel contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));getContentPane().setLayout(null);
		//contentPane.add(ScrollPane);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(new JLabel("Aufträge"));
		
																	
		list_1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
			
		
		JScrollPane SAScroll = new JScrollPane(list_1);
		
		SAScroll.add(list_1);
		SAScroll.setPreferredSize(new Dimension(300,300));

		
		
		Button Schließen = new Button("Schließen");											//Schließen
		Schließen.setBounds(10, 363, 125, 21);
		contentPane.add(Schließen);
		Schließen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
			
			
		});
		
		
		
		
		Button Speichern = new Button("Speichern");											// Speichern
		Speichern.setBounds(141, 363, 117, 21);
		contentPane.add(Speichern);
		Speichern.addActionListener(new SpeichernListener());
		
		NeuerAuftrag_Anliegen = new JTextField();											//TextField Anliegen
		NeuerAuftrag_Anliegen.setBounds(432, 95, 238, 19);
		contentPane.add(NeuerAuftrag_Anliegen);
		NeuerAuftrag_Anliegen.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Serviceaufträge");									//Überschrift
		lblNewLabel.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 30));
		lblNewLabel.setBounds(465, 40, 290, 45);
		contentPane.add(lblNewLabel);
		
		NeuerAuftrag_Kunde = new JTextField();												//TextField Kunde
		NeuerAuftrag_Kunde.setBounds(432, 124, 238, 19);
		contentPane.add(NeuerAuftrag_Kunde);
		NeuerAuftrag_Kunde.setColumns(10);
		
		NeuerAuftrag_Datum = new JTextField();												//TextField Datum
		NeuerAuftrag_Datum.setBounds(432, 153, 238, 19);
		contentPane.add(NeuerAuftrag_Datum);
		NeuerAuftrag_Datum.setColumns(10);
		
		JLabel NeuerAuftrag_Name_1 = new JLabel("Anliegen");
		NeuerAuftrag_Name_1.setBounds(677, 96, 88, 16);
		contentPane.add(NeuerAuftrag_Name_1);
		
		JLabel lblNewLabel_2 = new JLabel("Kunde");
		lblNewLabel_2.setBounds(677, 125, 93, 16);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Datum");
		lblNewLabel_3.setBounds(680, 156, 88, 13);
		contentPane.add(lblNewLabel_3);
		
		NeuerAuftrag_Mitarbeiter = new JTextField();
		NeuerAuftrag_Mitarbeiter.setBounds(432, 182, 238, 19);
		contentPane.add(NeuerAuftrag_Mitarbeiter);
		NeuerAuftrag_Mitarbeiter.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Mitarbeiter");
		lblNewLabel_4.setBounds(677, 185, 88, 13);
		contentPane.add(lblNewLabel_4);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 842, 22);
		contentPane.add(menuBar);
		
		JMenu mnNewMenu = new JMenu("Menü");
		menuBar.add(mnNewMenu);
		
		

		JButton btnMitarbeiter = new JButton("Mitarbeiterzugang");							//Menü-Button MitarbeiterZugang
		btnMitarbeiter.setMinimumSize(new Dimension(200, 23));
		btnMitarbeiter.setMaximumSize(new Dimension(200, 21));
		btnMitarbeiter.setToolTipText("");
		mnNewMenu.add(btnMitarbeiter);
		btnMitarbeiter.addActionListener (new MitarbeiterZugangFensterListener ());
		
		JButton btnMitarbeiterListe = new JButton("Mitarbeiterliste");						//Menü-Button MitarbeiterListe
		btnMitarbeiterListe.setMaximumSize(new Dimension(200, 23));
		btnMitarbeiterListe.setMinimumSize(new Dimension(200, 23));
		mnNewMenu.add(btnMitarbeiterListe);
		btnMitarbeiterListe.addActionListener (new MitarbeiterListeFensterListener ());
		
		JButton btnKunden = new JButton("Kunden");											//Menü-Button Kunden
		btnKunden.setMinimumSize(new Dimension(200, 23));
		btnKunden.setMaximumSize(new Dimension(200, 23));
		mnNewMenu.add(btnKunden);
		btnKunden.addActionListener (new KundenFensterListener ());
		
		Button CSV = new Button("CSV");														//CSV-Button
		CSV.setBounds(264, 363, 117, 21);
		contentPane.add(CSV);
		CSV.addActionListener (new CSVListener ());
	}
	
		class MitarbeiterZugangFensterListener implements ActionListener {					//ActionListener MitarbeiterZugang
			public void actionPerformed (ActionEvent event) {
				GUI_Access.main(null);
				//frmGui.setVisible(false);
			
		}
	}
		class MitarbeiterListeFensterListener implements ActionListener {					//ActionListener MitarbeiterListe
			public void actionPerformed (ActionEvent event) {
				GUI_MitarbeiterListe.main(null);
				//frmGui.setVisible(false);
			
		}
	}
		class KundenFensterListener implements ActionListener {								//ActionListener Kunden
			public void actionPerformed (ActionEvent event) {
				GUI_Kunden.main(null);
				//frmGui.setVisible(false);
			
		}
	}
		class CSVListener implements ActionListener {											//ActionListener CSV
			public void actionPerformed (ActionEvent event) {
				JOptionPane.showMessageDialog(null,  "CSV-Druck", "CSV", JOptionPane.ERROR_MESSAGE);
			
		}
	}
		
		
		
		
		//Aktion für den Speichern-Knopf
		class SpeichernListener implements ActionListener {
			public void actionPerformed (ActionEvent event) {
							
				
				//Pruefen ob die eingegebene MitarbeiterNummer eine Zahl ist
				int MitarbeiterNummer;
				try {
					MitarbeiterNummer = Integer.parseInt(NeuerAuftrag_Mitarbeiter.getText());
				} catch (Exception e){
					JOptionPane.showMessageDialog(null,  "Die eingegebene Mitarbeiternummer ist keine Zahl!", "Error", JOptionPane.ERROR_MESSAGE);
					MitarbeiterNummer=0;
				}
				
				//Pruefen ob die eingegebene KundenNummer eine Zahl ist
				int KundenNummer;
				try {
					KundenNummer = Integer.parseInt(NeuerAuftrag_Kunde.getText());
				} catch (Exception e){
					JOptionPane.showMessageDialog(null,  "Die eingegebene Kundennummer ist keine Zahl!", "Error", JOptionPane.ERROR_MESSAGE);
					KundenNummer=0;
				}
				
				//Pruefen ob das eingegebene Datum korrekt ist
				Date Datum = null;
				try {
					SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
					Datum = sdf.parse(NeuerAuftrag_Datum.getText());
				} catch (Exception e){
					JOptionPane.showMessageDialog(null,  "Das eingegebene Datum entspricht nicht dem Format TT.MM.JJJJ!", "Error", JOptionPane.ERROR_MESSAGE);
				
				}
				
	
		
				//Anliegen in einen String verwandeln
				String Anliegen;
				Anliegen = NeuerAuftrag_Mitarbeiter.getText();
				
				
				if (KundenNummer!=0 && Anliegen != null && Datum != null) {
				
					if (NeuerAuftrag_Mitarbeiter==null) {
						Serviceauftrag neu = new Serviceauftrag (KundenNummer, Anliegen, Datum);						//Anlegen eines neuen Serviceauftrags für int, String, Calendar	
						auftraege.add(neu);																				//Speicher in der ArrayList
					}
					else {
						Serviceauftrag neu = new Serviceauftrag (KundenNummer, Anliegen, Datum, MitarbeiterNummer); 	//Anlegen eines neuen Serviceauftrags für int, String, Calendar, int
						auftraege.add(neu);																				//Speicher in der ArrayList
					}
				}
				
				
				
			
		//updaten();
				System.out.println(auftraege);
				
			}
		}
		
		public void updaten () {
			list_1.setListData(auftraege.toArray());
	}
		
}

