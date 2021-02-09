package Zadatak2;

public class Putnik extends Covek{
	
	private double novac;

	public Putnik(String ime, String prezime, double novac) {
		super(ime, prezime);
		this.novac = novac;
	}

	public double getNovac() {
		return novac;
	}

	public void setNovac(double novac) {
		this.novac = novac;
	}
	public void dodajNovac(double kolicina) {
		this.novac = kolicina + novac;
	}
	public void oduzmiNovac(double kolicina) {
		this.novac = novac - kolicina;
	}
	
}
