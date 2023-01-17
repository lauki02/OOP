package RotWeissGmbH;

//Test Robo

public class Kunde extends Person{
	private int KundenNummer;
	public int getKundenNummer() {
		return KundenNummer;
	}
	public void setKundenNummer(int kundenNummer) {
		KundenNummer = kundenNummer;
	}
	
	//Konstruktor
		void Kunde (String parameter1, String parameter2) {
			setName (parameter1);
			setAdresse (parameter2);
			//KundenNummer muss automatisch erzeugt werden
		}
}
