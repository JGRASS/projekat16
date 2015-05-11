package teniskiTereniGUI;
import java.util.GregorianCalendar;
import java.util.LinkedList;

import TeniskiTeren.Implementacija;
import TeniskiTeren.TeniskiTeren;



public class GUIKOntroler {
	

	private static Implementacija sistem = new Implementacija();
	
	public static void prikaziPrijaviSeGUI(){}
	public static void prikaziAdminProzorGUI(){}
	public static void prikaziRezervisiGUI(){}
	public static void prikaziPocetniProzor(){}
	public static void obrisiRezervaciju(TeniskiTeren teren){
		String nazivTerena = teren.getNazivTerena();
		String tipTerena = teren.getTipTerena();
		GregorianCalendar datum = teren.getDatum();
		int sat = teren.getSat();
		
		sistem.izbrisiRezervaciju(nazivTerena, tipTerena, datum, sat);
	
	}
	
	public static void dodajRezervaciju(TeniskiTeren teren) {
		String nazivTerena = teren.getNazivTerena();
		String tipTerena = teren.getTipTerena();
		GregorianCalendar datum = teren.getDatum();
		int sat = teren.getSat();
		
		sistem.rezervisi(nazivTerena, tipTerena, datum, sat);
	}
	public static String vratiListuTerena(String tip){
		return sistem.vratiTerene(tip);
		
	}
}
