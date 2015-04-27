package Kalendar;

import java.util.GregorianCalendar;

public class Kalendar {
	
	private GregorianCalendar time= new GregorianCalendar();
	private int sat;
	private String dan;
	
	
	public GregorianCalendar getTime() {
		return time;
	}

	
	public int getSat() {
		return sat;
	}
	public void setSat(int sat) {
		if(sat!=1 || sat!=2 || sat!=3 || sat!=4 || sat!=5 || sat!=6 || sat!=7 || sat!=8 || sat!=9 || sat!=10 || sat!=11 || sat!=12 || sat!=13 ||
				sat!=14 || sat!=15 || sat!=16 || sat!=17 || sat!=18 || sat!=19 || sat!=20 || sat!=21 || sat!=22 || sat!=23 || sat!=24)
			throw new RuntimeException("Van satnice unet broj");
		this.sat = sat;
	}
	public String getDan() {
		return dan;
	}
	public void setDan(String dan) {
		this.dan = dan;
	}
	
	
	

}
