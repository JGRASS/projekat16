package sistemskeoperacije;

import java.util.LinkedList;

public class SODodajTeren {

public static void dodajTeren(String teniskiTeren, LinkedList<String> tipoviTerena) {
		
		if (tipoviTerena.contains(teniskiTeren))
				throw new RuntimeException("Teren vec postoji.");
		
		tipoviTerena.add(teniskiTeren);
	}
}
