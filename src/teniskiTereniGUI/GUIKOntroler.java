package teniskiTereniGUI;
import java.awt.EventQueue;
import java.util.GregorianCalendar;
import java.util.LinkedList;

import teniskiTeren.Implementacija;
import teniskiTeren.TeniskiTeren;



public class GUIKOntroler {
	

	private static Implementacija sistem ;
	private static PocetniProzorGUI pocetniProzor;
	private static AdminProzorGUI adminProzor;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					sistem = new Implementacija();
					pocetniProzor = new PocetniProzorGUI();
					pocetniProzor.setVisible(true);
					pocetniProzor.setLocationRelativeTo(null);
					adminProzor = new AdminProzorGUI();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public static void prikaziPrijaviSeGUI(){
		PrijaviSeGUI prozor = new PrijaviSeGUI();
		prozor.setLocationRelativeTo(pocetniProzor.getContentPane());
		prozor.setVisible(true);
	}
	public static void prikaziAdminProzorGUI(){
		AdminProzorGUI prozor = new AdminProzorGUI();
		prozor.setVisible(true);
			
	}
	public static void prikaziGlavniProzorGUI(){
		GlavniProzorGUI prozor = new GlavniProzorGUI();
		prozor.setVisible(true);
	}
	public static void prikaziRezervisiGUI(){
		RezervisiGUI prozor = new RezervisiGUI( adminProzor);
		prozor.setVisible(true);
	}
	public static void prikaziDodajTerenProzor(){
		UbaciTerenGUI prozor = new UbaciTerenGUI();
		prozor.setVisible(true);
		
	}
	public static void zatvoriPocetniProzor(){
		pocetniProzor.dispose();
	}
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
