package RotWeissGmbH;

import java.io.File;
import java.io.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JList;


public class CSV_Writer_New {
	/*ArrayList<Serviceauftrag>auftraege= new ArrayList<Serviceauftrag>();
	 JList list_1 = new JList();
	 ArrayList <Mitarbeiter> mitarbeiterListe = new ArrayList <Mitarbeiter> ();
	 JList list_2 = new JList();
	 ArrayList <Kunde> kundenListe= new ArrayList <Kunde>();
	 JList list_3= new JList ();
	 ArrayList <String> SaStrings = new ArrayList <String> ();
	 String [] Sa_Strings = new String [SaStrings.size()];
	 */
	
	 
	 
	 
	//Output Serviceauftraege
	public static void makeCSVdata(ArrayList<Serviceauftrag>auftraege) throws IOException {
		FileWriter writer = new FileWriter(new File ("Serviceauftraege.csv"));
		try {
			
			for (Serviceauftrag x : auftraege) {
				StringBuilder xa = new StringBuilder();
				xa.append(x.getAuftragsNummer());
				xa.append(",");
				xa.append(x.getAnliegen());
				xa.append(",");
				xa.append(x.getAufgabeDatum());
				xa.append(",");
				xa.append(x.getSachbearbeiter());
				xa.append(",");
				xa.append(x.getKundenNummer());
				xa.append(",");
				xa.append(x.getGesamtKosten());
				
				xa.append(System.lineSeparator());
				               
				writer.write(xa.toString());
				writer.flush();
			}
			}catch (IOException e) {
				e.printStackTrace();
			}
		writer.close();
	}	
	
	
	//Output Mitarbeiter
	public static void makeCSVdata2(ArrayList <Mitarbeiter> mitarbeiterListe) throws IOException {
				
		FileWriter writer = new FileWriter(new File ("Mitarbeiter.csv"));
		try {
			for (Mitarbeiter x : mitarbeiterListe) {
				StringBuilder xa = new StringBuilder ();
				xa.append(x.getMitarbeiterNummer());
				xa.append(",");
				xa.append(x.getName());
				
				xa.append(System.lineSeparator());
				
				writer.write(xa.toString());
				writer.flush();	
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		writer.close();
	}
		
	
	
	//Output Kunden
	public static void makeCSVdata3(ArrayList <Kunde> kundenListe) throws IOException {
		FileWriter writer = new FileWriter(new File ("Kunden.csv"));
		try {for (Kunde x : kundenListe) {
			StringBuilder xa = new StringBuilder ();
			xa.append(x.getKundenNummer());
			xa.append(",");
			xa.append(x.getName());
			
			xa.append(System.lineSeparator());
			
			writer.write(xa.toString());
			writer.flush();	
		}
	} catch (IOException e) {
		e.printStackTrace();
	}
	writer.close();		
	}		  		
}
			
		  
	 
			  
	  
	  