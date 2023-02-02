package RotWeissGmbH;

import java.io.*;
import java.util.ArrayList;





public class CSVWriter {

	public static void main (String[]args) throws IOException {
	
		File CSV_Serviceauftraege = new File ("Serviceauftraege.csv"); 
		//CSV_Serviceauftraege.createNewFile();
		//CSV_Serviceauftraege.getAbsolutePath();
		
		//ArrayList <Serviceauftrag> auftraege = CSVDatei();
		
		
		try {
			
			FileWriter Writer = new FileWriter("c:\\\\test\\\\monitor.csv");
			//Writer.writeAll();
			Writer.write("Kundennummer;Auftragsnummer;Datum;Mitarbeiter;Kosten");
			Writer.close();
			
		
		} catch (IOException e) {
			
			//e.printStackTrace();
		
		}
	
	
	
	
	
	
	
	
	}
}
