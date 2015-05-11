package TeniskiClub;
import TeniskiTeren.*;

import java.util.LinkedList;

import sistemskeoperacije.SODodajTeniskiTeren;
import sistemskeoperacije.SOIzbrisiTeniskiTeren;
import sistemskeoperacije.SOIzbrisiTeniskiTerenObject;

/**
 * Klasa koja predstavlja jedan Teniski Klub
 * @author Nikola
 *
 */
public class TeniskiClub {
	
	private String nazivTeniskogCluba,brojTelefonaTeniskogCluba; //broj telefona pisemo u formi 063/111-88...
	private long idTeniskogCluba; //kao neki indetifikator njihov poput JMBG-a u licnoj karti,tehnicki ovo je maticnibroj firme
	/**
	 * Vraca naziv Teniskog kluba
	 * @return
	 */
	private LinkedList<TeniskiTeren> tereni= new LinkedList<TeniskiTeren>();
	
	public String getNazivTeniskogCluba() {
		return nazivTeniskogCluba;
	}
	/**
	 * Postavlja naziv Tesnikog kluba
	 * @param nazivTeniskogCluba
	 */
	public void setNazivTeniskogCluba(String nazivTeniskogCluba) {
		if(nazivTeniskogCluba.isEmpty() || nazivTeniskogCluba==" ")
			throw new RuntimeException("Morati uneti neki karater kao naziv cluba");
		this.nazivTeniskogCluba = nazivTeniskogCluba;
	}
	/**
	 * Vraca broj telefona Teniskog kluba
	 * @return
	 */
	public String getBrojTelefonaTeniskogCluba() {
		return brojTelefonaTeniskogCluba;
	}
	/**
	 * Postavlja broj telefona Teniskog kluba
	 * @param brojTelefonaTeniskogCluba
	 */
	public void setBrojTelefonaTeniskogCluba(String brojTelefonaTeniskogCluba) {
		if(brojTelefonaTeniskogCluba.isEmpty() || nazivTeniskogCluba==" " || brojTelefonaTeniskogCluba.length()<7) 
			//racunam da postoje oni brojevi tipa 063/4270 za teniske terene
			throw new RuntimeException("Uneti broj telefona nije ispravan! ");
		this.brojTelefonaTeniskogCluba = brojTelefonaTeniskogCluba;
	}
	/**
	 * Vraca ID Teniskog kluba(maticni broj firme)
	 * @return
	 */
	public long getIdTeniskogCluba() {
		return idTeniskogCluba;
	}
	/**
	 * Postavlja ID Teniskog kluba(maticni broj firme)
	 * @param idTeniskogCluba
	 */
	public void setIdTeniskogCluba(long idTeniskogCluba) {
		if(idTeniskogCluba==0)
			throw new RuntimeException("Maticni broj(id) TeniskogClub-a(firme) nije dobro unet!");
		this.idTeniskogCluba = idTeniskogCluba;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(!(obj instanceof TeniskiClub))
			return false;
		TeniskiClub tenclu = (TeniskiClub) obj;
		if(tenclu.getIdTeniskogCluba()==this.idTeniskogCluba)
			return true;
		return false;
		// poredimo samo njihov idTeniskogCluba tj maticni broj firme
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Naziv cluba["+nazivTeniskogCluba+"] br.telefona["+brojTelefonaTeniskogCluba+"] Maticni broj(id)["+idTeniskogCluba+"]";
	}
	
	/**
	 * Dodaje novi Tenski teren u listu vezana za jedan club
	 * @param naziv
	 * @param tipTerena
	 * @param dalijezatvoren
	 * @param tereni
	 */
	public void dodajTeniskiTeren(String naziv, String tipTerena,boolean dalijezatvoren,LinkedList<TeniskiTeren> tereni){
		SODodajTeniskiTeren.dodajTeniskiTeren(naziv, tipTerena, dalijezatvoren, tereni);
	}
	/**
	 * brise Teniski teren
	 * @param naziv
	 * @param tipTerena
	 * @param dalijezatvoren
	 * @param tereni
	 */
	public void izbrisiTenskiTeren(String naziv, String tipTerena,boolean dalijezatvoren,LinkedList<TeniskiTeren> tereni){
		SOIzbrisiTeniskiTeren.izbrisiTenskiTeren(naziv, tipTerena, dalijezatvoren, tereni);
	}
	/**
	 * Alternativni metod brisanja iz liste ako imamo pointer ka Teniskom terenu
	 * @param teren
	 * @param tereni
	 */
	public void izbrisiTeniskiTerenObject(TeniskiTeren teren,LinkedList<TeniskiTeren> tereni){
		SOIzbrisiTeniskiTerenObject.izbrisiTeniskiTerenObject(teren, tereni);
	}

}
