package Racun;

public class RacunKlasa {
	//Napisati klasu Racun koja ima 2 polja.
	//Prvo polje 'brRacuna' tipa String predstavlja broj racuna.
	//brRacuna moze da se dohvati, ali ne i postavi
	//Drugo polje 'stanje' tipa double i predstavlja stanje na racunu
	//Stanje ima pocetnu vrednost 0 i moze da se dohvati
	//Napisati metode za dodavanje i uzimanje
	//novca za drugo polje.

	//dohvati=get
	//postavi=set

	
	private String brRacuna;
	public double stanje;
	
	public String getBrRacuna() {
		return this.brRacuna;
	}
	public double getStanje() {
		return this.stanje;
	}
	
	public RacunKlasa(String brRacuna) {
		this.brRacuna = brRacuna;
		this.stanje = 0;
	}
	public void dodavanje(double kolicinaNovca) {
		this.stanje = stanje + kolicinaNovca;
	}
	public void oduzimanje(double kolicinaNovca) {
		this.stanje = stanje - kolicinaNovca;
	}
	public void stampanjeStanja() {
		System.out.println("Vas racun je: " + getBrRacuna() + " a stanje na racunu je: " + getStanje());
	}

}
