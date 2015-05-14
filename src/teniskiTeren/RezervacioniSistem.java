package teniskiTeren;


import java.util.LinkedList;
import java.util.List;

public class RezervacioniSistem {

	private  LinkedList<TeniskiTeren> rezervacije = new LinkedList<>();
	private  LinkedList<String> tipoviTerena = new LinkedList<String>();
	
	public RezervacioniSistem() {
		tipoviTerena.add("sljaka");
		tipoviTerena.add("beton");
		tipoviTerena.add("trava");
	}
	

	public LinkedList<TeniskiTeren> getRezervacije() {
		return rezervacije;
	}


	public void setRezervacije(LinkedList<TeniskiTeren> rezervacije) {
		this.rezervacije = rezervacije;
	}


	public LinkedList<String> getTipoviTerena() {
		return tipoviTerena;
	}


	public void setTipoviTerena(LinkedList<String> tipoviTerena) {
		this.tipoviTerena = tipoviTerena;
	}


	/**
	 * Metoda koja puni objekat i ubacuje ga u listu rezervacije.
	 * @param tipTerena
	 * @param datum
	 * @param sat
	 * @throws java.lang.RuntimeException ako rezervacija vec postoji u listi rezervacije
	 */
	public void rezervisi (String tipTerena, java.util.Date datum , int sat , String imeKorisnika, String brojTelefona) {
		TeniskiTeren t = new TeniskiTeren();
		t.setTipTerena(tipTerena);
		t.setDatum(datum);
		t.setSat(sat);
		t.setImeKorisnika(imeKorisnika);
		t.setBrojTelefona(brojTelefona);
		
		for (int i = 0; i < rezervacije.size(); i++) {
			if (t.getTipTerena().equals(rezervacije.get(i).getTipTerena()) && t.getDatum().equals(rezervacije.get(i).getDatum()) && t.getSat() == rezervacije.get(i).getSat())
				throw new RuntimeException("Rezervacija vec postoji");
			}
	
		rezervacije.add(t);		
	}
	
	/**
	 * Metoda puni objekat parametrima , pretrazuje metodu i brise takav objekat iz liste
	 * @param tipTerena
	 * @param datum
	 * @param sat
	 * @throws java.lang.RuntimeException ako takav obejkat ne postoji u listi.
	 */
	public void izbrisiRezervaciju (TeniskiTeren t) {
		
		
		for (int i = 0; i < rezervacije.size(); i++) {
			if (t.getTipTerena().equals(rezervacije.get(i).getTipTerena()) && t.getDatum().equals(rezervacije.get(i).getDatum()) && t.getSat() == rezervacije.get(i).getSat())
				throw new RuntimeException("Rezervacija ne postoji");
		}
		
		rezervacije.remove(t);
	
	}

	/**
	 * Metoda dodaje novi teren
	 * @param teniskiTeren
	 */
	public void dodajTeren(String teniskiTeren) {
		
		if (tipoviTerena.contains(teniskiTeren))
				throw new RuntimeException("Teren vec postoji.");
		
		tipoviTerena.add(teniskiTeren);
	}
	
	public void izbrisiTeren(String teniskiTeren) {
		if (!tipoviTerena.contains(teniskiTeren))
			throw new RuntimeException("Teren ne postoji. ");
		tipoviTerena.remove(teniskiTeren);
	}
	
}
