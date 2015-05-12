
	package teniskiTeren;

	import java.util.Date;
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

		private Date datum;
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
		public Date getDatum() {
			return datum;
		}
		public void setDatum(Date date) {
			this.datum = date;
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
			if(other.getDatum().equals(datum) && other.getSat()==sat && other.getNazivTerena().equals(nazivTerena) && other.getTipTerena().equals(tipTerena))
				return true;	
			return false;
		}
		
		
		
		
		
		
		
	}

