package RotWeissGmbH;

import java.util.ArrayList;
import java.util.Date;

public class Serviceauftrag {
	// Attribut zur Zählung der Objekte
	private static int number = 1;

	// Attribute des Serviceauftrags definieren
	private int auftragsNummer;
	private int kundenNummer;
	private String anliegen;
	private Date aufgabeDatum;
	private boolean status;
	private int sachbearbeiter;
	private double gesamtKosten;

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

	public Date getAufgabeDatum() {
		return aufgabeDatum;
	}

	public void setAufgabeDatum(Date aufgabeDatum) {
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

	public static int getNumber() {
		return number;
	}

	public static void setNumber(int number) {
		Serviceauftrag.number = number;
	}
	
	public double getGesamtKosten() {
		return gesamtKosten;
	}

	public void setGesamtKosten(double gesamtKosten) {
		this.gesamtKosten = gesamtKosten;
	}

	// Konstruktoren
	public Serviceauftrag(int parameter1, String parameter2, Date parameter3, int parameter4, double parameter5) {
		// Auftragsnummer setzen
		setAuftragsNummer(number);
		// übergebene Parameter zuteilen
		setKundenNummer(parameter1);
		setAnliegen(parameter2);
		setAufgabeDatum(parameter3);
		setSachbearbeiter(parameter4);
		setGesamtKosten(parameter5);
		//Auftragsnummer fuer den naehsten Auftrag erzeugen
		number++;
	}
	
	
	public Serviceauftrag(int parameter1, String parameter2, Date parameter3, int parameter4) {
		// Auftragsnummer setzen
		setAuftragsNummer(number);
		// übergebene Parameter zuteilen
		setKundenNummer(parameter1);
		setAnliegen(parameter2);
		setAufgabeDatum(parameter3);
		setSachbearbeiter(parameter4);
		//Auftragsnummer fuer den naehsten Auftrag erzeugen
		number++;
	}

	public Serviceauftrag(int parameter1, String parameter2, Date parameter3) {
		//Auftragsnummer setzen
		setAuftragsNummer(number);
		// übergebene Parameter zuteilen
		setKundenNummer(parameter1);
		setAnliegen(parameter2);
		setAufgabeDatum(parameter3);
		//Auftragsnummer fuer den naehsten Auftrag erzeugen
		number++;
	}

	/*public static void add(ArrayList<Serviceauftrag> auftraege) {
		
		
	}*/

	

}
