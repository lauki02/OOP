package RotWeissGmbH;

import java.io.*;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.JList;
import javax.swing.JOptionPane; 

public class CSV_Reader_New {

	 ArrayList<Serviceauftrag>auftraege= new ArrayList<Serviceauftrag>();
	 JList list_1 = new JList();
	 ArrayList <Mitarbeiter> mitarbeiterListe = new ArrayList <Mitarbeiter> ();
	 JList list_2 = new JList();
	 ArrayList <Kunde> kundenListe= new ArrayList <Kunde>();
	 JList list_3= new JList ();
	
	
	
	
	

	 
	 public static void readCSVdata() throws IOException{
		 ArrayList<Serviceauftrag>auftraege= new ArrayList<Serviceauftrag>();
	 
		 try {
			 FileReader reader = new FileReader ("Serviceauftraege.csv");
			 String line;
			 BufferedReader xb = new BufferedReader(reader);
			 int auftragsNummer;
			 int kundenNummer;
			 String anliegen;
			 Date aufgabeDatum;
			 boolean status;
			 int sachbearbeiter;
			 double gesamtKosten;
	            while ((line = xb.readLine()) != null) {
	                String[] loadAuftrag = line.split(",");
	                
	                
	                auftragsNummer= Integer.parseInt(loadAuftrag[0]);
	                anliegen=loadAuftrag[1];
	                sachbearbeiter=Integer.parseInt(loadAuftrag[3]);
	                gesamtKosten=Integer.parseInt(loadAuftrag[5]);
	                kundenNummer=Integer.parseInt(loadAuftrag[4]);
	                /*try {
	                aufgabeDatum=DateFormat.parse(loadAuftrag[2]);
	                } catch(Exception e) {
	                	JOptionPane.showMessageDialog(null,  "Beim Einlesen der Daten ist ein Fehler aufgetreten.", "Error", JOptionPane.ERROR_MESSAGE);
	                }*/
	                aufgabeDatum=null;
	                
	                Serviceauftrag s = new Serviceauftrag(kundenNummer, anliegen, aufgabeDatum, sachbearbeiter, gesamtKosten);
	                	auftraege.add(s);
	               
	            }
	            xb.close();
	            reader.close();
			 
			
			
		 } catch(IOException e) {
			e.printStackTrace();
					}
		 
		 

	 
	 }
	 
}
