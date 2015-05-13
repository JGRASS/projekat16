package teniskiTeren;


import java.sql.Date;
import java.util.LinkedList;

public class Implementacija {

	private static LinkedList<TeniskiTeren> rezervacije = new LinkedList<>();
	

	/**
	 * Metoda koja puni objekat i ubacuje ga u listu rezervacije.
	 * @param tipTerena
	 * @param datum
	 * @param sat
	 * @throws java.lang.RuntimeException ako rezervacija vec postoji u listi rezervacije
	 */
	public void rezervisi (String tipTerena, java.util.Date datum , int sat) {
		TeniskiTeren t = new TeniskiTeren();
		t.setTipTerena(tipTerena);
		t.setDatum(datum);
		t.setSat(sat);
		
		for (int i = 0; i < rezervacije.size(); i++) {
			if (t.getTipTerena().equals(rezervacije.get(i).getTipTerena()) && t.getDatum().equals(rezervacije.get(i).getDatum()) && t.getSat() == rezervacije.get(i).getSat())
				throw new RuntimeException("Rezervacija vec postoji");
			else {
				rezervacije.add(t);
			}
		}
		
		
	}
	
	/**
	 * Metoda puni objekat parametrima , pretrazuje metodu i brise takav objekat iz liste
	 * @param tipTerena
	 * @param datum
	 * @param sat
	 * @throws java.lang.RuntimeException ako takav obejkat ne postoji u listi.
	 */
	public void izbrisiRezervaciju (String tipTerena, java.util.Date datum , int sat) {
		TeniskiTeren t = new TeniskiTeren();
		t.setTipTerena(tipTerena);
		t.setDatum(datum);
		t.setSat(sat);
		
		for (int i = 0; i < rezervacije.size(); i++) {
			if (t.getTipTerena().equals(rezervacije.get(i).getTipTerena()) && t.getDatum().equals(rezervacije.get(i).getDatum()) && t.getSat() == rezervacije.get(i).getSat())
				throw new RuntimeException("Rezervacija ne postoji");
			else {
				rezervacije.remove(t);
			}
		}
	
	}
	
}