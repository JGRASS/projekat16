
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
		
		/**
		 * Predstavlja sam teren
		 */
		private String tipTerena;

		/**
		 * Predstavlja datum rezervacije
		 */
		private Date datum;
		
		/**
		 * Predstavlja sat rezervacije
		 */
		private int sat;
		
		/**
		 * Ime korisnika koji je izvrsio rezervaciju
		 */
		private String imeKorisnika;
		
		/**
		 * Broj telefona korisnika
		 */
		private String brojTelefona;
		

	
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
		 * @throws java.lang.RuntimeException ako je uneti String prazan
		 */
		public void setTipTerena(String tipTerena) {
			if(tipTerena.isEmpty() || tipTerena==" ")
				throw new RuntimeException("Pogresno unet tip");
			this.tipTerena = tipTerena;
		}
		
		/**
		 * Vraca datum rezervacije
		 * @return datum 
		 */
		public Date getDatum() {
			return datum;
		}
		
		/**
		 * Postavlja datum rezervacije
		 * @param date 
		 * @throws java.lang.RuntimeException ako je datum pre sadasnjeg.
		 */
		public void setDatum(Date date) {
			this.datum = date;
		}
		
		/**
		 * Vraca sat rezervacije
		 * @return sat
		 */
		public int getSat() {
			return sat;
		}
		
		/**
		 * Postavlja sat rezervacije
		 * @param sat
		 *@throws java.lang.RuntimeException ako je vrednost manja od 8 a veca od 18
		 */
		public void setSat(int sat) {
			if (sat < 8 || sat > 18)
				throw new RuntimeException("Morate uneti vreme izmedju 8 i 18 h");
			this.sat = sat;
		}
		
		/**
		 * Vraca ime korisnika	
		 * @return imeKorisnika
		 */
		public String getImeKorisnika() {
			return imeKorisnika;
		}
		
		/**
		 * Postavlja ime korisnika
		 * @param imeKorisnika
		 * @throws java.lang.RuntimeException  ako je imeKorisnika prazan string
		 */
		public void setImeKorisnika(String imeKorisnika) {
			if (imeKorisnika.equals(" ") || imeKorisnika.isEmpty() || imeKorisnika == null)
				throw new RuntimeException("Morate uneti ime korisnika.");
			this.imeKorisnika = imeKorisnika;
		}
		
		/**
		 * Vraca broj telefona korisnika
		 * @return brojTelefona
		 */
		public String getBrojTelefona() {
			return brojTelefona;
		}
		
		/**
		 * Postavlja broj telefona korisnika
		 * @param brojTelefona
		 * @throws java.lang.RuntimeException ako broj nije unesen
		 */
		public void setBrojTelefona(String brojTelefona) {
			if (brojTelefona.length() < 1 || brojTelefona.isEmpty() || brojTelefona == " ")
				throw new RuntimeException("Morate uneti broj");
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
			if (sat != other.sat)
				return false;
			if (tipTerena == null) {
				if (other.tipTerena != null)
					return false;
			} else if (!tipTerena.equals(other.tipTerena))
				return false;
			return true;
		}
		@Override
		public String toString() {
			return "Teren: " + tipTerena + " Datum: " + datum
					+ " Sat: " + sat + " Ime korisnika: " + imeKorisnika
					+ " Broj telefona: " + brojTelefona;
		}

		 
	
		
		
		
		
		
		
		
		
		
	}

