package RotWeissGmbH;

import java.io.*;
import java.util.ArrayList;





public class CSVWriter {

	public static void main (String[]args) throws IOException {
	
		File CSV_Serviceauftraege = new File ("Serviceauftraege.csv"); 
		//CSV_Serviceauftraege.createNewFile();
		//CSV_Serviceauftraege.getAbsolutePath();
		public ArrayList <Serviceauftrag> auftraege = new ArrayList<Serviceauftrag>()
		//void listInDatei(auftraege, new File("/desktop/list.txt")); 
		CSV_Serviceauftraege = auftraege; 
		
		
		try {
			
			FileWriter Writer = new FileWriter("c:\\\\test\\\\monitor.csv");
			Writer.export(auftraege);
			Writer.close();
			 private static void listInDatei(List list, File datei) {
			        PrintWriter printWriter = null;
			        try {
			            printWriter = new PrintWriter(new FileWriter(datei));
			            Iterator iter = list.iterator();
			            while(iter.hasNext() ) {
			                Object o = iter.next();
			                printWriter.println(o); 
		
		} catch (IOException e) {
			
			e.printStackTrace();
		
		}
	
	
	
	
	
	
	
	
	}
}
