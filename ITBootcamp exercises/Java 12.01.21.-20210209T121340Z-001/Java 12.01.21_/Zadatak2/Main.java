package Zadatak2;

import java.util.concurrent.SynchronousQueue;

public class Main {

	public static void main(String[] args) {
		
		Covek c1 = new Covek("Marijan", "Vilis");
		c1.stampanjeCoveka();
		
		Putnik p1 = new Putnik("Bojan", "Nestorov", 200);
		System.out.println("Ime: " + p1.getIme() + " prezime: " + p1.getPrezime() + " ima novca: " + p1.getNovac());
		
		p1.dodajNovac(30);
		System.out.println("Ime: " + p1.getIme() + " prezime: " + p1.getPrezime() + " ima novca: " + p1.getNovac());
		
		p1.oduzmiNovac(20);
		System.out.println("Ime: " + p1.getIme() + " prezime: " + p1.getPrezime() + " ima novca: " + p1.getNovac());
		
		Vozac v1 = new Vozac("Stefan", "Stanojevic");
		System.out.println("Ime: " + v1.getIme() + " prezime: " + v1.getPrezime() + " zanimanje: " + v1.getZanimanje());
		
		Autobus a1 = new Autobus("Sirmium", 40);
		System.out.println("Autobus: " + a1.getNazivAutobusa() + " cena karte: " + a1.getCenaKarte() + 
				" ima putnika: " + p1.getIme() + " " + p1.getPrezime() + " i vozaca: " + v1.getIme() + " " + v1.getPrezime() );
		
		//nisam znao/razumeo kako dodati/oduzeti putnika i vozaca :(
		
	}

}
