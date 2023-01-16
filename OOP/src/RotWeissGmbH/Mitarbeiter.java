package RotWeissGmbH;

public class Mitarbeiter extends Person{
	int MitarbeiterNummer;
	
	//Konstruktor
		void Mitarbeiter (String parameter1, String parameter2) {
			setName (parameter1);
			setAdresse (parameter2);
			//MitarbeiterNummer muss automatisch erzeugt werden
		}
}
