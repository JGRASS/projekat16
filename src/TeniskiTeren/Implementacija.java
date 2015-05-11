package TeniskiTeren;

import java.util.GregorianCalendar;
import java.util.LinkedList;

public class Implementacija {

	private static LinkedList<TeniskiTeren> rezervacije = new LinkedList<>();
	
	public void rezervisi (String nazivTerena, String tipTerena, GregorianCalendar datum , int sat) {
		TeniskiTeren t = new TeniskiTeren();
		t.setNazivTerena(nazivTerena);
		t.setTipTerena(tipTerena);
		t.setDatum(datum);
		t.setSat(sat);
		
		if (rezervacije.contains(t))
			throw new RuntimeException("Postoji u listi");
		else 
			rezervacije.add(t);
		
	}
	
	public void izbrisiRezervaciju (String nazivTerena, String tipTerena, GregorianCalendar datum , int sat) {
		TeniskiTeren t = new TeniskiTeren();
		t.setNazivTerena(nazivTerena);
		t.setTipTerena(tipTerena);
		t.setDatum(datum);
		t.setSat(sat);
		
		if (!rezervacije.contains(t))
			rezervacije.remove(t);
		else 
			throw new RuntimeException("Rezervacija ne postoji.");
	}
	
	public String vratiTerene(String tip){
		//Trajko uradi ovo
		return null;
	}
}
