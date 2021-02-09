package Zadatak2;

public class Autobus {

	private String nazivAutobusa;
	private Vozac vozac;
	private Putnik putnik;
	private int cenaKarte;
	
	
	public Autobus(String nazivAutobusa, int cenaKarte) {
		super();
		this.nazivAutobusa = nazivAutobusa;
		this.cenaKarte = cenaKarte;
	}


	public String getNazivAutobusa() {
		return nazivAutobusa;
	}


	public void setNazivAutobusa(String nazivAutobusa) {
		this.nazivAutobusa = nazivAutobusa;
	}


	public Vozac getVozac() {
		return vozac;
	}


	public void setVozac(Vozac vozac) {
		this.vozac = vozac;
	}


	public Putnik getPutnik() {
		return putnik;
	}


	public void setPutnik(Putnik putnik) {
		this.putnik = putnik;
	}


	public int getCenaKarte() {
		return cenaKarte;
	}


	public void setCenaKarte(int cenaKarte) {
		this.cenaKarte = cenaKarte;
	}
	
	
	
	
}
