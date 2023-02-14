package RotWeissGmbH;



import java.io.File;
import java.io.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JList;








public class CSV_Writer_New {
	 public ArrayList<Serviceauftrag>auftraege= new ArrayList<Serviceauftrag>();
	 public JList list_1 = new JList();
	 
	 
	
	public static void makeCSVdata(JList list_1) throws IOException {
		

			try {
					FileWriter writer = new FileWriter("C:\\Users\\corta\\git\\OOP_2\\OOP_3\\OOP");
					File CSV_Serviceauftraege = new File ("Serviceauftraege.csv");
					
					/*for (Serviceauftrag x : auftraege) {
	                	StringBuilder xa = new StringBuilder();
	                	xa.append(x.auftragsNummer);
	                	xa.append(",");
	                	xa.append(x.kundenNummer);
	                	xa.append(",");
	                	xa.append(x.anliegen);
	                	xa.append(",");
	                	xa.append(x.aufgabeDatum);
	                	xa.append(",");
	                	xa.append(x.sachbearbeiter); */
						//writer.write(sb.toString());
			writer.flush();
			writer.close();
			//} 
			} catch (IOException e) {
		  		 e.printStackTrace();
		  		}
	
		  		
	}		  		
}
			
		  
	 
			  
	  
	  