package domaci;


import java.util.Scanner;

public class domaci2 {

	public static void main(String[] args) {
		
//Napisati funkciju koja vraca sumu dva niza, zatim od niza sa vecom sumom 
//oduzme sumu drugog niza i vrati da li je veci niz i dalje veci
//Primer:
//Ako se unese prvi niz 1,2,3 (suma je 6) i drugi niz 10,20,30 (suma 60) 
//onda 60 - 6 = drugi niz je i dalje veci, vraca true.

		Scanner scn = new Scanner(System.in);
		
		int[] niz1 = {10,20,31};
		int[] niz2 = {10,20,30};
		
		System.out.println(sumaNizova(niz1, niz2));
		
		
		
	}
	public static boolean sumaNizova(int[] niz1, int[] niz2) {
		int suma1 = 0;
		int suma2 = 0;
		for (int i = 0; i < niz1.length; i++) {
			suma1 = suma1 + niz1[i];
		}System.out.println("Suma prvog niza je: " + suma1);
		for (int i = 0; i < niz2.length; i++) {
			suma2 = suma2 + niz2[i];
		}System.out.println("Suma drugog niza je: " + suma2);
		if (suma1 > suma2) {
			suma1 = suma1 - suma2;
			if (suma1 > suma2) {
				return true;
			}else {
				return false;
			}
			
		} else {
			suma2 = suma2 - suma1;
			if (suma2 > suma1) {
				return true;
			}else {
			return false;
			}
		}
		
	}
	}


