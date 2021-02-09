package domaci;

import java.util.Scanner;

public class domaci2 {

	public static void main(String[] args) {
		// Napisati program koji unosi i sabira brojeve dokle god nije unesen negativan broj
		//  i ispisuje njihov zbir (zbir pozitivnih brojeva)
		// primer: ako korisnik unese 1 2 5 3 -1,  program treba da ispise 11
		Scanner skener = new Scanner(System.in);
		
		int a;
		int suma = 0;
		
		System.out.println("Broj: ");
		a = skener.nextInt();
		
		while (a > 0) {
			suma = suma + a;
			a = skener.nextInt();
		}
		System.out.println("Suma svih pozitivnih brojeva je: " + suma);
	}
		
		
		
		
		
	}


