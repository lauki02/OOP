package RotWeissGmbH;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.border.EmptyBorder;
import java.io.IOException;
import java.text.SimpleDateFormat;


public class Test extends JFrame {

	public JFrame ContentPane;
	private JTextField NeuerAuftrag_Anliegen;
	private JTextField NeuerAuftrag_Kunde;
	private JTextField NeuerAuftrag_Datum;
	private JTextField NeuerAuftrag_Mitarbeiter;
	private JTextField NeuerAuftrag_Kosten;
	public 	ArrayList <Serviceauftrag> auftraege;
	public ArrayList <String> SaStrings;
	public 	JList list_1;
	//public String [] Sa_Strings = new String [SaStrings.size()];
	
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
		SaStrings = new ArrayList<String>();
		auftraege = new ArrayList<Serviceauftrag>();
		list_1 = new JList ();
		setType(Type.UTILITY);
		setTitle("NeueGUI");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 779, 431);
		JPanel contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().setLayout(null);

		
		
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
																			
		
		
		list_1.setBounds(10, 30, 400, 300); 
		contentPane.add(list_1);
		list_1.setVisibleRowCount(10); 
		list_1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list_1.addListSelectionListener(new SelectionListener());
		
		
	
		Button btnSchließen = new Button("Schließen");											//Schließen
		btnSchließen.setBounds(10, 363, 125, 21);
		contentPane.add(btnSchließen);
		btnSchließen.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {System.exit(0);}});
		
			
		
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
		
		JLabel lblAnliegen = new JLabel("Anliegen");
		lblAnliegen.setBounds(677, 96, 88, 16);
		contentPane.add(lblAnliegen);
		
		JLabel lblKunde = new JLabel("Kunde");
		lblKunde.setBounds(677, 125, 93, 16);
		contentPane.add(lblKunde);
		
		JLabel lblDatum = new JLabel("Datum");
		lblDatum.setBounds(677, 155, 88, 16);
		contentPane.add(lblDatum);
		
		NeuerAuftrag_Mitarbeiter = new JTextField();
		NeuerAuftrag_Mitarbeiter.setBounds(432, 182, 238, 19);
		contentPane.add(NeuerAuftrag_Mitarbeiter);
		NeuerAuftrag_Mitarbeiter.setColumns(10);
		
		JLabel lblMitarbeiter = new JLabel("Mitarbeiter");
		lblMitarbeiter.setBounds(677, 185, 88, 13);
		contentPane.add(lblMitarbeiter);
		
		NeuerAuftrag_Kosten = new JTextField();
		NeuerAuftrag_Kosten.setBounds(432, 210, 238, 19);
		contentPane.add(NeuerAuftrag_Kosten);
		NeuerAuftrag_Kosten.setColumns(10);
		
		JLabel lblKosten = new JLabel ("Kosten");
		lblKosten.setBounds(677, 210, 88, 16);
		contentPane.add(lblKosten);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 842, 22);
		contentPane.add(menuBar);
		
		JMenu mnNewMenu = new JMenu("Menü");
		menuBar.add(mnNewMenu);
		
		Button btnDelete = new Button("Delete");
		btnDelete.setBounds(400, 363, 110, 21);
		contentPane.add(btnDelete);
		btnDelete.addActionListener(new DeleteListener());

		/*JButton btnMitarbeiter = new JButton("Mitarbeiterzugang");							//Menü-Button MitarbeiterZugang
		btnMitarbeiter.setMinimumSize(new Dimension(200, 23));
		btnMitarbeiter.setMaximumSize(new Dimension(200, 21));
		btnMitarbeiter.setToolTipText("");
		mnNewMenu.add(btnMitarbeiter);
		btnMitarbeiter.addActionListener (new MitarbeiterZugangFensterListener ()); 
		*/
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
		
		Button btnCSV = new Button("CSV");														//CSV-Button
		btnCSV.setBounds(264, 363, 117, 21);
		contentPane.add(btnCSV);
		btnCSV.addActionListener (new CSVListener ());
		
		
		Button btnLaden = new Button("Laden");														//CSV-Button
		btnLaden.setBounds(540, 363, 117, 21);
		contentPane.add(btnLaden);
		btnLaden.addActionListener (new LadenListener ());
		
		
		
		
		
	}
	
	/*	class MitarbeiterZugangFensterListener implements ActionListener {					//ActionListener MitarbeiterZugang
			public void actionPerformed (ActionEvent event) {
				GUI_Access.main(null);
				//frmGui.setVisible(false);
			
		}
	}*/
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
				//JOptionPane.showMessageDialog(null,  "CSV-Druck", "CSV", JOptionPane.ERROR_MESSAGE);
				
				try {
					CSV_Writer_New.makeCSVdata(auftraege);
					
				} catch (IOException e) {
					JOptionPane.showMessageDialog(null,  "CSV-Druck", "Error", JOptionPane.ERROR_MESSAGE);
				}
				
		}
	}
		
		
		
		class LadenListener implements ActionListener {											//ActionListener Laden
			public void actionPerformed (ActionEvent event) {
				//JOptionPane.showMessageDialog(null,  "CSV-Druck", "CSV", JOptionPane.ERROR_MESSAGE);
				
				try {
					CSV_Reader_New.readCSVdata();
					
				} catch (IOException e) {
					JOptionPane.showMessageDialog(null,  "CSV-Lesen", "Error", JOptionPane.ERROR_MESSAGE);
				}
				goto updaten();
				//auftraege.addAll(auftraege.toArray());
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
				
				//Pruefen ob die eingegebenen Kosten ein double ist
				double Kosten;
				try {
					Kosten = Double.parseDouble(NeuerAuftrag_Kosten.getText());
				} catch (Exception e){
					JOptionPane.showMessageDialog(null,  "Die eingegebenen Kosten sind keine zugelassene Zahl!", "Error", JOptionPane.ERROR_MESSAGE);
					Kosten=0;
				}
				
			
				//Anliegen in einen String verwandeln
				String Anliegen;
				Anliegen = NeuerAuftrag_Anliegen.getText();
				
				//Anlegen eisen neuen Kundenauftrags
				int bearbeiten=list_1.getSelectedIndex();
				if (bearbeiten !=0) {
				if (KundenNummer!=0 && Anliegen != null && Datum != null) {
				
					if (NeuerAuftrag_Mitarbeiter==null && NeuerAuftrag_Kosten==null) {
						Serviceauftrag neu = new Serviceauftrag (KundenNummer, Anliegen, Datum);						//Anlegen eines neuen Serviceauftrags für int, String, Calendar	
						auftraege.add(neu);																				//Speicher in der ArrayList
					}
					else if (NeuerAuftrag_Kosten==null){
						Serviceauftrag neu = new Serviceauftrag (KundenNummer, Anliegen, Datum, MitarbeiterNummer); 	//Anlegen eines neuen Serviceauftrags für int, String, Calendar, int
						auftraege.add(neu);																				//Speicher in der ArrayList
					}
					else {
						Serviceauftrag neu = new Serviceauftrag (KundenNummer, Anliegen, Datum, MitarbeiterNummer, Kosten);
						auftraege.add(neu);
					}
					
					NeuerAuftrag_Anliegen.setText(null);
					NeuerAuftrag_Kunde.setText(null);
					NeuerAuftrag_Datum.setText(null);
					NeuerAuftrag_Mitarbeiter.setText(null);
					NeuerAuftrag_Kosten.setText(null);
				}
				}
				else {
					auftraege.get(bearbeiten).setSachbearbeiter(MitarbeiterNummer);
					auftraege.get(bearbeiten).setKundenNummer(KundenNummer);
					auftraege.get(bearbeiten).setAufgabeDatum(Datum);
					auftraege.get(bearbeiten).setAnliegen(Anliegen);
					auftraege.get(bearbeiten).setGesamtKosten(Kosten);
					
					NeuerAuftrag_Anliegen.setText(null);
					NeuerAuftrag_Kunde.setText(null);
					NeuerAuftrag_Datum.setText(null);
					NeuerAuftrag_Mitarbeiter.setText(null);
					NeuerAuftrag_Kosten.setText(null);
				}
				updaten();
			}
		}
		
		public void updaten () {
			ArrayList <String> SaStrings = new ArrayList <String> ();
			String SaNummer;
			String SaAnliegen;
			String SaKunde;
			Date Datum;
			String SaDatum;
			String SaMitarbeiter;
			String SaKosten;
			String Serviceauftrag;
			SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
			for (int i=0; i<auftraege.size(); i++) {
				SaNummer=Integer.toString(auftraege.get(i).getAuftragsNummer());
				SaAnliegen=auftraege.get(i).getAnliegen();
				SaKunde=Integer.toString(auftraege.get(i).getKundenNummer());
				Datum=auftraege.get(i).getAufgabeDatum();
				SaDatum=sdf.format(Datum);
				SaMitarbeiter=Integer.toString(auftraege.get(i).getSachbearbeiter());
				SaKosten=Double.toString(auftraege.get(i).getGesamtKosten());
				Serviceauftrag=SaNummer+" | "+SaAnliegen+" | "+ "KuNr.: "+SaKunde+" | "+SaDatum+" | "+"MaNr.: "+SaMitarbeiter+" | "+"Kosten: "+SaKosten;
				SaStrings.add(Serviceauftrag);
			}
			
			list_1.setListData(SaStrings.toArray());
			String [] Sa_Strings = new String [SaStrings.size()];
			SaStrings.toArray(Sa_Strings);
			
		}
		
		
		class SelectionListener implements ListSelectionListener {
			public void valueChanged (ListSelectionEvent event) {
				int bearbeiten = list_1.getSelectedIndex();
				String SaAnliegen;
				String SaKunde;
				Date Datum;
				String SaDatum;
				String SaMitarbeiter;
				String SaKosten;
				String Serviceauftrag;
				SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
				
				SaAnliegen=auftraege.get(bearbeiten).getAnliegen();
				SaKunde=Integer.toString(auftraege.get(bearbeiten).getKundenNummer());
				Datum=auftraege.get(bearbeiten).getAufgabeDatum();
				SaDatum=sdf.format(Datum);
				SaMitarbeiter=Integer.toString(auftraege.get(bearbeiten).getSachbearbeiter());
				SaKosten=Double.toString(auftraege.get(bearbeiten).getGesamtKosten());
				NeuerAuftrag_Anliegen.setText(SaAnliegen);
				NeuerAuftrag_Kunde.setText(SaKunde);
				NeuerAuftrag_Datum.setText(SaDatum);
				NeuerAuftrag_Mitarbeiter.setText(SaMitarbeiter);
				NeuerAuftrag_Kosten.setText(SaKosten);
				
			}
		}
		
		
		class DeleteListener implements ActionListener {
			public void actionPerformed (ActionEvent event) {
				int delete = list_1.getSelectedIndex();
				auftraege.remove(delete);
				updaten();
				
			}
		}
}

