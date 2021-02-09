package domaci;

import java.util.Scanner;

public class domaci1 {

	public static void main(String[] args) {
		//Napisati program koji racuna sumu parnih brojeva i proizvod neparnih brojeva 
		//od 0 do n - za resavanje ovog zadatka koristiti samo jednu petlju 
		//(ne jednu vrstu petlje, vec samo jednu petlju).


		Scanner skener = new Scanner(System.in);

		int a;
		int suma = 0;
		int proizvod = 1;

		System.out.println("Broj: ");
		a = skener.nextInt();

		for (int i = 0; i <= a; i++) {
			if (i % 2 == 0) {
				suma = suma + i;
			}
			else {
				proizvod = proizvod * i;
			}
		}
		System.out.println("Suma parnih je: "+ suma + "\nProizvod neparnih je: "+ proizvod);

	}

}
