package RotWeissGmbH;

import java.util.*;

public class GesamtKosten {
	private double BerechnungsKosten;
	private double AlleKosten;
	
	public double getAlleKosten() {
		summiereKosten();
		return AlleKosten;
	}


	// Variables Array, in das alle einzelnen Kosten gelegt werden
	public ArrayList <EinzelKosten> kostenListe = new ArrayList <> ();
	
	//Addiere alle Einzelkosten des Arrays
	 double summiereKosten() {
		int i = 0;
		int n = kostenListe.size();
		
		while (i <= n) {
			BerechnungsKosten = BerechnungsKosten + kostenListe.get(i).getEinzelKosten();
			i++;
		}
		AlleKosten = BerechnungsKosten;
		return AlleKosten;
	}
	

}