package SistemskeOperacije;

import java.util.LinkedList;

import teniskiTeren.TeniskiTeren;

public class SOIzbrisiTeniskiTerenObject {
	
	public static void izbrisiTeniskiTerenObject(TeniskiTeren teren,LinkedList<TeniskiTeren> tereni){
		if(!tereni.contains(teren))
			throw new RuntimeException("Nema terena u bazi");
		tereni.add(teren);
	}

}
