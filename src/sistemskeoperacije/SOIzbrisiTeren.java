package sistemskeoperacije;

import java.util.LinkedList;

public class SOIzbrisiTeren {

	public static void izbrisiTeren(String teniskiTeren, LinkedList<String> tipoviTerena) {
		if (!tipoviTerena.contains(teniskiTeren))
			throw new RuntimeException("Teren ne postoji. ");
		tipoviTerena.remove(teniskiTeren);
	}
}
