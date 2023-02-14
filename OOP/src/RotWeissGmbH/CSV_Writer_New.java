package RotWeissGmbH;



import java.io.File;
import java.io.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JList;








public class CSV_Writer_New {
	 ArrayList<Serviceauftrag>auftraege= new ArrayList<Serviceauftrag>();
	 JList list_1 = new JList();
	 ArrayList <Mitarbeiter> mitarbeiterListe = new ArrayList <Mitarbeiter> ();
	 JList list_2 = new JList();
	 ArrayList <Kunde> kundenListe= new ArrayList <Kunde>();
	 JList list_3= new JList ();
	 
	
	 
	 
	 
	//Output Serviceauftraege
	public static void makeCSVdata(JList list_1) throws IOException {
		

				try {
							FileWriter writer = new FileWriter("C:\\Users\\corta\\git\\OOP_2\\OOP_3\\OOP");
							File CSV_Serviceauftraege = new File ("Serviceauftraege.csv");
					
					
							writer.flush();
							writer.close();
			
							} catch (IOException e) {
									e.printStackTrace();
									}
	}
	
	
	
	
	
	
	
	
	
	//Output Mitarbeiter
	public static void makeCSVdata2(JList list_2) throws IOException {
				

				try {
							FileWriter writer = new FileWriter("C:\\Users\\corta\\git\\OOP_2\\OOP_3\\OOP");
							File CSV_Mitarbeiter = new File ("Mitarbeiter.csv");
						
						
							writer.flush();
							writer.close();
				
							} catch (IOException e) {
									e.printStackTrace();
									}
	}
		
	
	
	
	
	
	
	//Output Kunden
	public static void makeCSVdata3(JList list_3) throws IOException {
							

				try {
						FileWriter writer = new FileWriter("C:\\Users\\corta\\git\\OOP_2\\OOP_3\\OOP");
						File CSV_Kunden = new File ("Kunden.csv");
									
									
						writer.flush();
						writer.close();
							
						} catch (IOException e) {
						  		 e.printStackTrace();
						  		}
							 
							
								
	}		  		
}
			
		  
	 
			  
	  
	  