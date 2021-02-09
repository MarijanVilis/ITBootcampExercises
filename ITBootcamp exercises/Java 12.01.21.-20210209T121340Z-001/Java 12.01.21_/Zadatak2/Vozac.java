package Zadatak2;

public class Vozac extends Covek {

	private String zanimanje = "Sofer";

	public Vozac(String ime, String prezime) {
		super(ime, prezime);
		this.zanimanje = zanimanje;
	}

	public String getZanimanje() {
		return zanimanje;
	}

	
	
}
