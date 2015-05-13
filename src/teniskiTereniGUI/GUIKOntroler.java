package teniskiTereniGUI;
import java.awt.EventQueue;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.LinkedList;

import javax.swing.JOptionPane;

import teniskiTeren.Implementacija;
import teniskiTeren.TeniskiTeren;


/**
 * Predstavlja kontroler celokupnog grafickog intefejsa
 * @author Sasa
 *
 */
public class GUIKOntroler {
	

	/**
	 * instanca Implementacija klase
	 */
	private static Implementacija sistem ;
	
	/**
	 * instanca PocetniProzorGUI klase
	 */
	private static PocetniProzorGUI pocetniProzor;
	
	/**
	 * instanca AdminProzorGUI klase
	 */
	private static AdminProzorGUI adminProzor;
	
	/**
	 * instanca GlavniProzorGUI klase
	 */
	private static GlavniProzorGUI glavniProzor;
	
	/**
	 * instanca RezervisiGUI klase
	 */
	private static RezervisiGUI rezervisiProzor;
	
	
	/**
	 * Pokrece prozore grafickog interfejsa
	 * @param args
	 */
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
	
	/**
	 * prikazuje PrijaviSeGUI prozor
	 */
	public static void prikaziPrijaviSeGUI(){
		PrijaviSeGUI prozor = new PrijaviSeGUI();
		prozor.setLocationRelativeTo(pocetniProzor.getContentPane());
		prozor.setVisible(true);
	}
	
	/**
	 * prikazuje AdminProzorGUI prozor
	 */
	public static void prikaziAdminProzorGUI(){
		AdminProzorGUI prozor = new AdminProzorGUI();
		prozor.setVisible(true);
			
	}
	
	/**
	 * prikazuje GlavniProzorGUI prozor
	 */
	public static void prikaziGlavniProzorGUI(){
		GlavniProzorGUI prozor = new GlavniProzorGUI();
		prozor.setVisible(true);
	}
	
	/**
	 * prikazuje RezervisiGUI prozor
	 */
	public static void prikaziRezervisiGUI(){
		RezervisiGUI prozor = new RezervisiGUI( adminProzor);
		prozor.setVisible(true);
	}
	
	/**
	 * prikazuje UbaciTerenGUI prozor
	 */
	public static void prikaziDodajTerenProzor(){
		UbaciTerenGUI prozor = new UbaciTerenGUI();
		prozor.setVisible(true);
		
	}
	
	/**
	 * zatvara pocetni prozor
	 */
	public static void zatvoriPocetniProzor(){
		pocetniProzor.dispose();
	}
	
	/**
	 * Poziva metodu koja brise rezervaciju
	 * @param teren
	 */
	public static void obrisiRezervaciju(TeniskiTeren teren){
		String tipTerena = teren.getTipTerena();
		Date datum = teren.getDatum();
		int sat = teren.getSat();
		
		sistem.izbrisiRezervaciju(tipTerena, datum, sat);
	
	}
	
	/**
	 * poziva metodu koja dodaje rezervaciju
	 * @param teren
	 */
	public static void dodajRezervaciju(TeniskiTeren teren) {
		String tipTerena = teren.getTipTerena();
		Date datum = teren.getDatum();
		int sat = teren.getSat();
		
		sistem.rezervisi(tipTerena, datum, sat);
	}
	
	/**
	 * zatvara GlavniProzorGUI
	 */
	public static void ugasiAplikacijuGlavniProzor() {
		int opcija = JOptionPane.showConfirmDialog(glavniProzor.getContentPane(),
				"Da li zelite da izadjete iz aplikacije", "Izlazak",
				JOptionPane.YES_NO_OPTION);

		if (opcija == JOptionPane.YES_OPTION)
			System.exit(0);
	}
	
	/**
	 * zatvara AdminProzorGUI prozor
	 */
	public static void ugasiAplikacijuAdminProzor() {
		int opcija = JOptionPane.showConfirmDialog(adminProzor.getContentPane(),
				"Da li zaista zelite da izadjete iz aplikacije", "Izlazak",
				JOptionPane.YES_NO_OPTION);

		if (opcija == JOptionPane.YES_OPTION)
			System.exit(0);
	}
	
	/**
	 * prikazuje AboutProzor u AdminProzorGUI 
	 */
	public static void prikaziAboutProzorAdmin(){
		JOptionPane.showMessageDialog(adminProzor.getContentPane(),
				"Autori: Saša Lukic, Nikola Trajkovic, Aleksa Topalovic, Verzija 1.0", "O programu Rezervacija terena",
				JOptionPane.INFORMATION_MESSAGE);
	}
	
	/**
	 * prikazuje AboutProzor u GlavniProzorGUI 
	 */
	public static void prikaziAboutProzorGlavniProzor(){
		JOptionPane.showMessageDialog(glavniProzor.getContentPane(),
				"Autori: Saša Lukic, Nikola Trajkovic, Aleksa Topalovic, Verzija 1.0", "O programu Rezervacija terena",
				JOptionPane.INFORMATION_MESSAGE);
	}

	/**
	 * ubacuje novi teren u combobox RezervisiGUI prozora
	 * @param teren
	 */
	@SuppressWarnings("unchecked")
	public static void dodajTeren(String teren) {
		rezervisiProzor.getTip().addItem(teren);
		
	}
}
