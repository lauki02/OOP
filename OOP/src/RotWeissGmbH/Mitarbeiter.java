package RotWeissGmbH;

public class Mitarbeiter extends Person{
	private int MitarbeiterNummer;
	
	
	//Konstruktor
		Mitarbeiter (int parameter2, String parameter1) {
			setMitarbeiterNummer(parameter2);
			setName (parameter1);
			
			
		}


		public int getMitarbeiterNummer() {
			return MitarbeiterNummer;
		}


		public void setMitarbeiterNummer(int mitarbeiterNummer) {
			MitarbeiterNummer = mitarbeiterNummer;
		}
}
