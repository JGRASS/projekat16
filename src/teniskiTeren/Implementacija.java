package teniskiTeren;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.LinkedList;

public class Implementacija {

	private static LinkedList<TeniskiTeren> rezervacije = new LinkedList<>(); //Ovde kreiramo objecte iz terenaKojiPostoje samo im vrednost za rerzervaciju nije null,pa samim tim je zasebna lista
	
	private static LinkedList<TeniskiTeren> tereniKojiPostoje = new LinkedList<TeniskiTeren>(); //Ovde moramo da imamo listu Terena sa ful opisom koji sadrzi taj neki klub
	
	public void rezervisi (String nazivTerena, String tipTerena, Date datum , int sat) {
		TeniskiTeren t = new TeniskiTeren();
		t.setNazivTerena(nazivTerena);
		t.setTipTerena(tipTerena);
		t.setDatum(datum);
		t.setSat(sat);
		
		if (rezervacije.contains(t))
			throw new RuntimeException("Postoji u listi");
		else 
			rezervacije.add(t);
		
	}
	
	public void izbrisiRezervaciju (String nazivTerena, String tipTerena, Date datum , int sat) {
		TeniskiTeren t = new TeniskiTeren();
		t.setNazivTerena(nazivTerena);
		t.setTipTerena(tipTerena);
		t.setDatum(datum);
		t.setSat(sat);
		
		if (!rezervacije.contains(t))
			rezervacije.remove(t);
		else 
			throw new RuntimeException("Rezervacija ne postoji.");
	}
	
	public String vratiTeren(String tip,int sat,Date datum){
		//Trajko uradi ovo
		String nazivST=null;
		LinkedList<TeniskiTeren> slobodniTereni=new LinkedList<>();
		for(int i=0;i<tereniKojiPostoje.size();i++){
			if(tereniKojiPostoje.get(i).getTipTerena().equals(tip)){
				slobodniTereni.addLast(tereniKojiPostoje.get(i));
				slobodniTereni.getLast().setSat(sat);
				slobodniTereni.getLast().setDatum(datum);
			}
		}
		for(int i=0;i<slobodniTereni.size();i++){
			if(!rezervacije.contains(slobodniTereni.get(i)))
				nazivST=slobodniTereni.get(i).getNazivTerena();
		}
		return nazivST;
	}
	
	public void sacuvaj(){
		
		try {
			ObjectOutputStream out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("rezervacije.out")));
			ObjectOutputStream out2 = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("tereniKojiPostoje.out")));
			
			for(int i=0;i<rezervacije.size();i++){
				out.writeObject(rezervacije.get(i));
			}
			out.close();
			for(int i=0;i<tereniKojiPostoje.size();i++){
				out2.writeObject(tereniKojiPostoje.get(i));
			}
			out2.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Greska pri sacuvanju podataka");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Greska pri sacuvanju podataka");
		}
		
	}
	public void load(){
		
			try {
				ObjectInputStream in = new ObjectInputStream(new BufferedInputStream(new FileInputStream("rezervacije.out")));
				LinkedList<TeniskiTeren> r = new LinkedList<>();
				r.clear();
				try{
					while(true){
						TeniskiTeren o  = (TeniskiTeren)  (in.readObject());
						r.add(o);
					}
				}catch (EOFException e){
					in.close();
					rezervacije.clear();
					rezervacije=r;

				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("Greska pri ucitavnju");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("Greska pri ucitavnju");

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("Greska pri ucitavnju");

			}
			try {
				ObjectInputStream in2 = new ObjectInputStream(new BufferedInputStream(new FileInputStream("tereniKojiPostoje.out")));
				LinkedList<TeniskiTeren> t = new LinkedList<>();
				t.clear();
				try{
					while(true){
						TeniskiTeren a  = (TeniskiTeren)  (in2.readObject());
						t.add(a);
					}
				}catch (EOFException e){
					in2.close();
					tereniKojiPostoje.clear();
					tereniKojiPostoje=t;
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("Greska pri ucitavnju");

			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("Greska pri ucitavnju");

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("Greska pri ucitavnju");

			}
			
			
	}
	
}