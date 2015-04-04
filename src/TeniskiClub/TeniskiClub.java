package TeniskiClub;

public class TeniskiClub {
	
	private String nazivTeniskogCluba,brojTelefonaTeniskogCluba; //broj telefona pisemo u formi 063/111-88...
	private long idTeniskogCluba; //kao neki indetifikator njihov poput JMBG-a u licnoj karti,tehnicki ovo je maticnibroj firme
	
	public String getNazivTeniskogCluba() {
		return nazivTeniskogCluba;
	}
	public void setNazivTeniskogCluba(String nazivTeniskogCluba) {
		if(nazivTeniskogCluba.isEmpty() || nazivTeniskogCluba==" ")
			throw new RuntimeException("Morati uneti neki karater kao naziv cluba");
		this.nazivTeniskogCluba = nazivTeniskogCluba;
	}
	public String getBrojTelefonaTeniskogCluba() {
		return brojTelefonaTeniskogCluba;
	}
	public void setBrojTelefonaTeniskogCluba(String brojTelefonaTeniskogCluba) {
		if(brojTelefonaTeniskogCluba.isEmpty() || nazivTeniskogCluba==" " || brojTelefonaTeniskogCluba.length()<7) 
			//racunam da postoje oni brojevi tipa 063/4270 za teniske terene
			throw new RuntimeException("Uneti broj telefona nije ispravan! ");
		this.brojTelefonaTeniskogCluba = brojTelefonaTeniskogCluba;
	}
	public long getIdTeniskogCluba() {
		return idTeniskogCluba;
	}
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
	
	
	
	

}
