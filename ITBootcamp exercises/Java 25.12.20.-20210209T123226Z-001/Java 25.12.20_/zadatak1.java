package domaci2;

import java.util.Scanner;

public class zadatak1 {

	public static void main(String[] args) {
		// Napisati program gde korisnik unese ime, prezime i pol,
		//a program mu vrati "Dobrodosao u IT" ili "Dobrodosla u IT" zavisno koji pol unese

		Scanner scn = new Scanner(System.in);
		
		String ime;
		String prezime;
		String pol;
		//int m = 
		System.out.println("Unesite vase ime: ");
		ime = scn.next();
		
		System.out.println("Unesite vase prezime: ");
		prezime = scn.next();
		
		System.out.println("Unesite vas pol (m, z): ");
		pol = scn.next();
		
		switch (pol) {
		case "m":
			System.out.println(ime + " " + prezime + " dobrodosao u IT");
			break;
		case "z":
			System.out.println(ime + " " + prezime + " dobrodosla u IT");
			break;
		default:
			System.out.println("Morate uneti m ili z slovo!");
			break;
		}
		
		
		
		
		
	}

}
