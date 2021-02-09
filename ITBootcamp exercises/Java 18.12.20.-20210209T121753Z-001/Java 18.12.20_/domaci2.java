package domaci;


import java.util.Scanner;

public class domaci2 {

	public static void main(String[] args) {
		
		// Napisati program gde korisnik unese datum rodjenja 
		//i program vrati koji je to horoskopski znak
		// jarac (22.12 - 20.01)
		// vodolija (21.01 -19.02)
		//ribe (20.02.- 20.03)
		//ovan (21.03 - 19.04)
		//bik (20.04 - 20.05)
		//blizanac (21.05 - 21.06)
		//rak (22.06 - 23.07)
		//lav (24.07 - 23.08)
		//devica (24.08 - 22.09)
		//vaga (23.09 - 22.10)
		//skorpija (23.10 - 22.11)
		//strelac (23.11 - 20.12)
		
		Scanner scn = new Scanner(System.in);
		
		int mesec;
		int dan;
		String znak = "";
		
		System.out.println("Unesite mesec: ");
		mesec = scn.nextInt();
		
		System.out.println("Unesite dan: ");
		dan = scn.nextInt();
		
		
		if (mesec == 1) {
			if (dan <= 20 )
				znak = "Jarac";
			else 
				znak = "Vodolija";
		} 
		else if (mesec == 2) {
			if (dan <= 19 )
				znak = "Vodolija";
			else 
				znak = "Riba";
		}
		else if (mesec == 3) {
			if (dan <= 20 )
				znak = "Riba";
			else 
				znak = "Ovan";
		}
		else if (mesec == 4) {
			if (dan <= 19 )
				znak = "Ovan";
			else 
				znak = "Bik";
		}
		else if (mesec == 5) {
			if (dan <= 20 )
				znak = "Bik";
			else 
				znak = "Blizanac";
		}
		else if (mesec == 6) {
			if (dan <= 21 )
				znak = "Blizanac";
			else 
				znak = "Rak";
		}
		else if (mesec == 7) {
			if (dan <= 23 )
				znak = "Rak";
			else 
				znak = "Lav";
		}
		else if (mesec == 8) {
			if (dan <= 23 )
				znak = "Lav";
			else 
				znak = "Devica";
		}
		else if (mesec == 9) {
			if (dan <= 22 )
				znak = "Devica";
			else 
				znak = "Vaga";
		}
		else if (mesec == 10) {
			if (dan <= 22 )
				znak = "Vaga";
			else 
				znak = "Skorpija";
		}
		else if (mesec == 11) {
			if (dan <= 22 )
				znak = "Skorpija";
			else 
				znak = "Strelac";
		}
		else if (mesec == 12) {
			if (dan <= 20 )
				znak = "Strelac";
			else 
				znak = "Jarac";
		}
		System.out.println("Vas horoskopski znak je:" + znak);
		
	}
		
		
	}


