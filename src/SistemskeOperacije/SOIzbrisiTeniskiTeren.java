package SistemskeOperacije;
import java.util.LinkedList;

import teniskiTeren.*;
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
