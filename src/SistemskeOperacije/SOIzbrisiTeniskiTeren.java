package SistemskeOperacije;


import TeniskiTeren.*;
import java.util.LinkedList;
public class SOIzbrisiTeniskiTeren {
	
	public static void izbrisiTenskiTeren(String naziv, String tipTerena,boolean dalijezatvoren,LinkedList<TeniskiTeren> tereni){
		TeniskiTeren teren = new TeniskiTeren();
		
		teren.setNazivTerena(naziv);
		teren.setTipTerena(tipTerena);
		if(!tereni.contains(teren))
			throw new RuntimeException("Ne postoji u bazi ovaj teren");
		tereni.remove(teren);
	}

}
