package sistemskeoperacije;

import java.util.Date;
import java.util.LinkedList;

import teniskiTeren.TeniskiTeren;

public class SORezervisi {

	
public static void rezervisi (TeniskiTeren t, LinkedList<TeniskiTeren> rezervacije) {
		
		String tipTerena = t.getTipTerena();
		Date datum = t.getDatum();
		int sat = t.getSat();
	
		for (int i = 0; i < rezervacije.size(); i++) {
			TeniskiTeren teren  = rezervacije.get(i);
			if (teren.getTipTerena().equals(tipTerena) && teren.getDatum().equals(datum) && teren.getSat() == sat)
				throw new RuntimeException("Rezervacija vec postoji");
		}
	
		rezervacije.add(t);		
	}


}
