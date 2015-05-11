package sistemskeoperacije;
import java.util.LinkedList;

import TeniskiTeren.*;
import TeniskiClub.*;
public class SOIzbrisiTeniskiTeren {
	
	public static void izbrisiTenskiTeren(String naziv, String tipTerena,boolean dalijezatvoren,LinkedList<TeniskiTeren> tereni){
		TeniskiTeren teren = new TeniskiTeren();
		teren.setDaLiJeZatvoren(dalijezatvoren);
		teren.setNazivTerena(naziv);
		teren.setTipTerena(tipTerena);
		if(!tereni.contains(teren))
			throw new RuntimeException("Ne postoji u bazi ovaj teren");
		tereni.remove(teren);
	}

}
