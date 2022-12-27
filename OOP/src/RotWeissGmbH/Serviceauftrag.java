package RotWeissGmbH;

import java.util.Calendar;

public class Serviceauftrag {
	// Attribute des Serviceauftrags definieren
		private int auftragsNummer;
		private int kundenNummer;
		private String anliegen;
		private Calendar aufgabeDatum;
		private boolean status;
		private int sachbearbeiter;

	// Setter und Getter fuer Attribute des Serviceauftrags definieren
		public int getAuftragsNummer() {
			return auftragsNummer;
		}
		
		public void setAuftragsNummer(int auftragsNummer) {
			this.auftragsNummer = auftragsNummer;
		}
		
		public int getKundenNummer() {
			return kundenNummer;
		}

		public void setKundenNummer(int kundenNummer) {
			this.kundenNummer = kundenNummer;
		}
		
		public String getAnliegen() {
			return anliegen;
		}

		public void setAnliegen(String anliegen) {
			this.anliegen = anliegen;
		}

		public Calendar getAufgabeDatum() {
			return aufgabeDatum;
		}
	
		public void setAufgabeDatum(Calendar aufgabeDatum) {
			this.aufgabeDatum = aufgabeDatum;
		}

		public boolean isStatus() {
			return status;
		}

		public void setStatus(boolean status) {
			this.status = status;
		}

		public int getSachbearbeiter() {
			return sachbearbeiter;
		}

		public void setSachbearbeiter(int sachbearbeiter) {
			this.sachbearbeiter = sachbearbeiter;
		}

	//Konstruktoren
		public Serviceauftrag (int parameter1, String parameter2, Calendar parameter3, int parameter4) {
			//Auftragsnummer erzeugen
			//übergebene Parameter zuteilen
				setKundenNummer(parameter1);
				setAnliegen (parameter2);
				setAufgabeDatum (parameter3);
				setSachbearbeiter (parameter4);	
		}
		public Serviceauftrag (int parameter1, String parameter2, Calendar parameter3) {
			//Auftragsnummer erzeugen
			//übergebene Parameter zuteilen
				setKundenNummer(parameter1);
				setAnliegen (parameter2);
				setAufgabeDatum (parameter3);
		}
}

		
