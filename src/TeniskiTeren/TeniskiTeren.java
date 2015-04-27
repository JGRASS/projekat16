package TeniskiTeren;
/**
 * Predstavlja 1 Teniski Teren
 * @author Nikola
 *
 */
public class TeniskiTeren {
	
	private String nazivTerena; //predstavlja naziv ili jednostavno broj terena (Teren br.1)
	private String tipTerena; //predstavlja koja je podloga (sljaka,beton itd)
	private boolean daLiJeZatvoren; //da li je u zatvorenom prostoru
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
	/**
	 * Vraca da li je na zatovrenom ili otvorenom Teniski teren
	 * @return
	 */
	public boolean isDaLiJeZatvoren() {
		return daLiJeZatvoren;
	}
	/**
	 * Postavlja da li je na zatovrenom ili otvorenom Teniski teren
	 * @param daLiJeZatvoren
	 */
	public void setDaLiJeZatvoren(boolean daLiJeZatvoren) {
		this.daLiJeZatvoren = daLiJeZatvoren;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(!(obj instanceof TeniskiTeren))
			return false;
		TeniskiTeren tt =(TeniskiTeren) obj;
		if(tt.getNazivTerena().equals(this.nazivTerena) && tt.getTipTerena().equals(this.tipTerena) && tt.isDaLiJeZatvoren()==this.daLiJeZatvoren)
			return true; //proveriti da li treba sa "this"
		return false;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Naziv Teniskog terena: "+this.nazivTerena+"\t tip: "+this.tipTerena+"\t zatvoren:"+isDaLiJeZatvoren();
	}
	
}
