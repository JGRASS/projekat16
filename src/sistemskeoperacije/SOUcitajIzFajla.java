package sistemskeoperacije;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.LinkedList;

import teniskiTeren.TeniskiTeren;

public class SOUcitajIzFajla {
	
	public static void ucitajIzFajla(String putanja, LinkedList<TeniskiTeren> rezervacije) {
		try{
			ObjectInputStream in = new ObjectInputStream(
					new BufferedInputStream(new FileInputStream(putanja)));
			
			rezervacije = (LinkedList<TeniskiTeren>)(in.readObject());
			
			in.close();
		}catch(Exception e){
			throw new RuntimeException(e);
		}
	}
}
