package TeniskiTeren;

import java.util.GregorianCalendar;
import java.util.LinkedList;




/**
 * Predstavlja 1 Teniski Teren
 * @author Nikola
 *
 */
public class TeniskiTeren {
	
	private String nazivTerena; //predstavlja naziv ili jednostavno broj terena (Teren br.1)
	private String tipTerena; //predstavlja koja je podloga (sljaka,beton itd)

	private GregorianCalendar datum;
	private int sat;
	private String imeKorisnika;
	private String brojTelefona;
	

	/**
	 * Vraca naziv Teniskog terena
	 * @return
	 */
	public String getNazivTerena() {
		return nazivTerena;
	}
	/**
	 * Postavlja naziv Teniskog terena
	 * @param nazivTerena
	 */
	public void setNazivTerena(String nazivTerena) {
		if(nazivTerena.isEmpty() || nazivTerena==" ")
			throw new RuntimeException("Pogresno unet naziv");
		this.nazivTerena = nazivTerena;
	}
	/**
	 * Vraca tip Teniskog terena
	 * @return
	 */
	public String getTipTerena() {
		return tipTerena;
	}
	/**
	 * Postavlja koji je tip Teniskog terena
	 * @param tipTerena
	 */
	public void setTipTerena(String tipTerena) {
		if(tipTerena.isEmpty() || tipTerena==" ")
			throw new RuntimeException("Pogresno unet tip");
		this.tipTerena = tipTerena;
	}
	public GregorianCalendar getDatum() {
		return datum;
	}
	public void setDatum(GregorianCalendar datum) {
		this.datum = datum;
	}
	public int getSat() {
		return sat;
	}
	public void setSat(int sat) {
		this.sat = sat;
	}
	public String getImeKorisnika() {
		return imeKorisnika;
	}
	public void setImeKorisnika(String imeKorisnika) {
		this.imeKorisnika = imeKorisnika;
	}
	public String getBrojTelefona() {
		return brojTelefona;
	}
	public void setBrojTelefona(String brojTelefona) {
		this.brojTelefona = brojTelefona;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((brojTelefona == null) ? 0 : brojTelefona.hashCode());
		result = prime * result + ((datum == null) ? 0 : datum.hashCode());
		result = prime * result
				+ ((imeKorisnika == null) ? 0 : imeKorisnika.hashCode());
		result = prime * result
				+ ((nazivTerena == null) ? 0 : nazivTerena.hashCode());
		result = prime * result + sat;
		result = prime * result
				+ ((tipTerena == null) ? 0 : tipTerena.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TeniskiTeren other = (TeniskiTeren) obj;
		if (brojTelefona == null) {
			if (other.brojTelefona != null)
				return false;
		} else if (!brojTelefona.equals(other.brojTelefona))
			return false;
		if (datum == null) {
			if (other.datum != null)
				return false;
		} else if (!datum.equals(other.datum))
			return false;
		if (imeKorisnika == null) {
			if (other.imeKorisnika != null)
				return false;
		} else if (!imeKorisnika.equals(other.imeKorisnika))
			return false;
		if (nazivTerena == null) {
			if (other.nazivTerena != null)
				return false;
		} else if (!nazivTerena.equals(other.nazivTerena))
			return false;
		if (sat != other.sat)
			return false;
		if (tipTerena == null) {
			if (other.tipTerena != null)
				return false;
		} else if (!tipTerena.equals(other.tipTerena))
			return false;
		return true;
	}
	
	
	
	
	
	
	
}
