package teniskiTeren;


import java.sql.Date;
import java.util.LinkedList;

public class Implementacija {

	private static LinkedList<TeniskiTeren> rezervacije = new LinkedList<>();
	

	
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
	
	public void izbrisiRezervaciju (String tipTerena, java.util.Date datum , int sat) {
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
	public LinkedList<TeniskiTeren> vratiRezervacije(){
		return rezervacije;
	}
	
}