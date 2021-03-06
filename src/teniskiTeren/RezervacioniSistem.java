package teniskiTeren;



import java.util.LinkedList;


import sistemskeoperacije.SODodajTeren;
import sistemskeoperacije.SOIzbrisiRezervaciju;
import sistemskeoperacije.SOIzbrisiTeren;
import sistemskeoperacije.SORezervisi;
import sistemskeoperacije.SOSacuvajUFajl;
import sistemskeoperacije.SOUcitajIzFajla;

public class RezervacioniSistem {

	private  LinkedList<TeniskiTeren> rezervacije = new LinkedList<>();
	private  LinkedList<String> tipoviTerena = new LinkedList<String>();
	

	public RezervacioniSistem () {
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
	public void rezervisi (TeniskiTeren t) {
		
		SORezervisi.rezervisi(t, rezervacije);	
	}
	
	/**
	 * Metoda puni objekat parametrima , pretrazuje metodu i brise takav objekat iz liste
	 * @param tipTerena
	 * @param datum
	 * @param sat
	 * @throws java.lang.RuntimeException ako takav obejkat ne postoji u listi.
	 */
	public void izbrisiRezervaciju (TeniskiTeren t) {
		
		SOIzbrisiRezervaciju.izbrisiRezervaciju(t, rezervacije);
	
	}

	/**
	 * Metoda dodaje novi teren
	 * @param teniskiTeren
	 */
	public void dodajTeren(String teniskiTeren) {
		SODodajTeren.dodajTeren(teniskiTeren, tipoviTerena);
	}
	
	/**
	 * Metoda brise teren
	 * @param teniskiTeren
	 */
	public void izbrisiTeren(String teniskiTeren) {
		SOIzbrisiTeren.izbrisiTeren(teniskiTeren, tipoviTerena);
	}
	
	public void ucitajIzFajla(String putanja) {
		SOUcitajIzFajla.ucitajIzFajla(putanja, rezervacije);
	}

	
	public void sacuvajUFajl(String putanja) {
		SOSacuvajUFajl.sacuvajUFajl(putanja, rezervacije);
	}
	
}
