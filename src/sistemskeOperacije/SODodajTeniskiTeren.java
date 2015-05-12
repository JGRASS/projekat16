package sistemskeOperacije;

import java.util.LinkedList;

import teniskiTeren.*;


public class SODodajTeniskiTeren {
	
	public static void dodajTeniskiTeren(String naziv, String tipTerena,boolean dalijezatvoren,LinkedList<TeniskiTeren> tereni){
		if(naziv.isEmpty() || tipTerena.isEmpty())
			throw new RuntimeException("Lose unete vrednosti");
		TeniskiTeren teren = new TeniskiTeren();
		teren.setTipTerena(tipTerena);
		teren.setNazivTerena(naziv);
		
		if(tereni.contains(teren))
			throw new RuntimeException("Postoji uveliko taj teren");
		tereni.add(teren);
		
	}

}
