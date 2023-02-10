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
		Kunde (int parameter1, String parameter2) {
			setKundenNummer (parameter1);
			setName (parameter2);
			
		}
}
