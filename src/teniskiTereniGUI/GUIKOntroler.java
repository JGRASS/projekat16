package teniskiTereniGUI;
import java.awt.EventQueue;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.LinkedList;

import javax.swing.JOptionPane;

import teniskiTeren.Implementacija;
import teniskiTeren.TeniskiTeren;



public class GUIKOntroler {
	

	private static Implementacija sistem ;
	private static PocetniProzorGUI pocetniProzor;
	private static AdminProzorGUI adminProzor;
	private static GlavniProzorGUI glavniProzor;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					sistem = new Implementacija();
					pocetniProzor = new PocetniProzorGUI();
					pocetniProzor.setVisible(true);
					pocetniProzor.setLocationRelativeTo(null);
					adminProzor = new AdminProzorGUI();
					glavniProzor = new GlavniProzorGUI();
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
		Date datum = teren.getDatum();
		int sat = teren.getSat();
		
		sistem.izbrisiRezervaciju(nazivTerena, tipTerena, datum, sat);
	
	}
	
	public static void dodajRezervaciju(TeniskiTeren teren) {
		String nazivTerena = teren.getNazivTerena();
		String tipTerena = teren.getTipTerena();
		Date datum = teren.getDatum();
		int sat = teren.getSat();
		
		sistem.rezervisi(nazivTerena, tipTerena, datum, sat);
	}
	public static String vratiListuTerena(String tip,int sat,Date datum){
		return sistem.vratiTeren(tip,sat,datum);
		
	}
	public static void ugasiAplikacijuGlavniProzor() {
		int opcija = JOptionPane.showConfirmDialog(glavniProzor.getContentPane(),
				"Da li zelite da izadjete iz aplikacije", "Izlazak",
				JOptionPane.YES_NO_OPTION);

		if (opcija == JOptionPane.YES_OPTION)
			System.exit(0);
		
			
			
	}
	public static void ugasiAplikacijuAdminProzor() {
		int opcija = JOptionPane.showConfirmDialog(adminProzor.getContentPane(),
				"Da li zaista zelite da izadjete iz aplikacije", "Izlazak",
				JOptionPane.YES_NO_OPTION);

		if (opcija == JOptionPane.YES_OPTION)
			System.exit(0);
	}
	public static void prikaziAboutProzorAdmin(){
		JOptionPane.showMessageDialog(adminProzor.getContentPane(),
				"Autori: Saša Lukic, Nikola Trajkovic, Aleksa Topalovic, Verzija 1.0", "O programu Rezervacija terena",
				JOptionPane.INFORMATION_MESSAGE);
	}
	public static void prikaziAboutProzorGlavniProzor(){
		JOptionPane.showMessageDialog(glavniProzor.getContentPane(),
				"Autori: Saša Lukic, Nikola Trajkovic, Aleksa Topalovic, Verzija 1.0", "O programu Rezervacija terena",
				JOptionPane.INFORMATION_MESSAGE);
	}
}
