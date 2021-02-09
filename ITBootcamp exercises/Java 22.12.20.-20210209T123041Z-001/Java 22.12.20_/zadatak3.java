package domaci;

import java.util.Scanner;

public class zadatak3 {

	public static void main(String[] args) {
		//Napraviti kalkulator povrsina kvadrata, pravougaonika i kruga. 
		//Povrsina se bira tako sto se unese kao tekst odgovarajuca figura. 
		//Ukoliko se unese 'izadji', program treba da se zavrsi. 
		//Program treba da se ponavlja dokle god se ne unese izadji.

		
		double broj1;
		double broj2;
		double broj3;
		String option;
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Unesite zeljeni geometrijski oblik: ");
		option = scn.next();
		
		if (option == "Kvadrat") {
			System.out.println("Unesite broj: ");
			broj1 = scn.nextDouble();
		}else if (option == "Pravougaonik"); {
			System.out.println("Unesite prvi broj: ");
			broj1 = scn.nextDouble();
			System.out.println("Unesite drugi broj: ");
			broj2 = scn.nextDouble();
		}  
		if(option == "Krug");{
			System.out.println("Unesite poluprecnik: ");
			broj3 = scn.nextDouble();
		}
		
		 double rezultat = povrsine(broj1, broj2, broj3, option);
		
		
		
	}
	
	public static double povrsine(double a, double b, double r, String opcije) {
		
		switch (opcije) {
		case "Kvadrat":{
			System.out.println("Povrsina kvadrata je: a * a");
			return a * a;
		}
		case "Pravougaonik":{
			System.out.println("Povrsina pravougaonika je: a * b");
			return a * b;
		}
		case "Krug":{
			System.out.println("Povrsina kruga je: r^2 * pi ");
			return r * r * 3.14;
		}
		case "Izadji":{
			System.out.println("Kraj programa");
			break;
		}
		default:
			System.out.println("Morate uneti odgovarajuci geometrijski oblik: Kvadrat ili  Pravougaonik ili Krug.");
			break;
			
		}
		
	}
	
		
}
