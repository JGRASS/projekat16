package sistemskeoperacije;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedList;

import teniskiTeren.TeniskiTeren;

public class SOSacuvajUFajl {
	public static void sacuvajUFajl(String putanja, LinkedList<TeniskiTeren> rezervacije) {
		try{
			ObjectOutputStream out = new ObjectOutputStream(
					new BufferedOutputStream(new FileOutputStream(putanja)));
			
			out.writeObject(rezervacije);
			
			out.close();
		}catch(Exception e){
			throw new RuntimeException(e);
		}
	}
}

