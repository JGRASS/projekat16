package teniskiTeren;

import java.util.GregorianCalendar;
import java.util.LinkedList;

public class Implementacija {

	private static LinkedList<TeniskiTeren> rezervacije = new LinkedList<>(); //Ovde kreiramo objecte iz terenaKojiPostoje samo im vrednost za rerzervaciju nije null,pa samim tim je zasebna lista
	
	private static LinkedList<TeniskiTeren> tereniKojiPostoje = new LinkedList<TeniskiTeren>(); //Ovde moramo da imamo listu Terena sa ful opisom koji sadrzi taj neki klub
	
	public void rezervisi (String nazivTerena, String tipTerena, GregorianCalendar datum , int sat) {
		TeniskiTeren t = new TeniskiTeren();
		t.setNazivTerena(nazivTerena);
		t.setTipTerena(tipTerena);
		t.setDatum(datum);
		t.setSat(sat);
		
		if (rezervacije.contains(t))
			throw new RuntimeException("Postoji u listi");
		else 
			rezervacije.add(t);
		
	}
	
	public void izbrisiRezervaciju (String nazivTerena, String tipTerena, GregorianCalendar datum , int sat) {
		TeniskiTeren t = new TeniskiTeren();
		t.setNazivTerena(nazivTerena);
		t.setTipTerena(tipTerena);
		t.setDatum(datum);
		t.setSat(sat);
		
		if (!rezervacije.contains(t))
			rezervacije.remove(t);
		else 
			throw new RuntimeException("Rezervacija ne postoji.");
	}
	
	public String vratiTeren(String tip,int sat,GregorianCalendar datum){
		//Trajko uradi ovo
		String nazivST=null;
		LinkedList<TeniskiTeren> slobodniTereni=new LinkedList<>();
		for(int i=0;i<tereniKojiPostoje.size();i++){
			if(tereniKojiPostoje.get(i).getTipTerena().equals(tip)){
				slobodniTereni.addLast(tereniKojiPostoje.get(i));
				slobodniTereni.getLast().setSat(sat);
				slobodniTereni.getLast().setDatum(datum);
			}
		}
		for(int i=0;i<slobodniTereni.size();i++){
			if(!rezervacije.contains(slobodniTereni.get(i)))
				nazivST=slobodniTereni.get(i).getNazivTerena();
		}
		return nazivST;
	}
}