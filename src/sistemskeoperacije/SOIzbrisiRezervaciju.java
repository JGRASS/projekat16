package sistemskeoperacije;

import java.util.LinkedList;

import teniskiTeren.TeniskiTeren;

public class SOIzbrisiRezervaciju {

	

public static void izbrisiRezervaciju (TeniskiTeren t, LinkedList<TeniskiTeren> rezervacije) {
		
		for (int i = 0; i < rezervacije.size(); i++) {
			if (t.getTipTerena().equals(rezervacije.get(i).getTipTerena()) && t.getDatum().equals(rezervacije.get(i).getDatum()) && t.getSat() == rezervacije.get(i).getSat())
				throw new RuntimeException("Rezervacija ne postoji");
		}
		
		rezervacije.remove(t);
	
	}
}
