package apachePOI;

public class Racun {
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
	
	public Racun(String brRacuna) {
		this.brRacuna = brRacuna;
		this.stanje = 0;
	}
	public double dodavanje(double kolicinaNovca) {
		this.stanje = stanje + kolicinaNovca;
		return stanje;
	}
	public double oduzimanje(double kolicinaNovca) {
		this.stanje = stanje - kolicinaNovca;
		return stanje;
	}
	public void stampanjeStanja() {
		System.out.println("Vas racun je: " + getBrRacuna() + " a stanje na racunu je: " + getStanje());
	}

}