package Racun;

public class RacunMain {

	public static void main(String[] args) {
		//Napisati klasu Racun koja ima 2 polja.
		//Prvo polje 'brRacuna' tipa String predstavlja broj racuna.
		//brRacuna moze da se dohvati, ali ne i postavi
		//Drugo polje 'stanje' tipa double i predstavlja stanje na racunu
		//Stanje ima pocetnu vrednost 0 i moze da se dohvati
		//Napisati metode za dodavanje i uzimanje
		//novca za drugo polje.

		//dohvati=get
		//postavi=set
		
		RacunKlasa stanje01 = new RacunKlasa("111");
		stanje01.stampanjeStanja();
		
		stanje01.dodavanje(100);
		stanje01.stampanjeStanja();
		
		stanje01.oduzimanje(50);
		stanje01.stampanjeStanja();
	}

}
