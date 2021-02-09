package domaci;

import java.util.Scanner;

public class domaci1 {

	public static void main(String[] args) {
		//Napisite program gde korisnik unosi broj godina i broj velicine obuce. 
		//Ako su uneseni brojevi parni treba ih sabrati, ako je barem jedan unet broj neparan 
		//onda ih pomnoziti. Resenje prikazati na kraju.


		Scanner skener = new Scanner(System.in);

		int brojGodina;
		int velicinaObuce;
		int rezultat = 0;
		
		System.out.println("Unesite broj godina: ");
		brojGodina = skener.nextInt();
		
		System.out.println("Unesite velicinu obuce: ");
		velicinaObuce = skener.nextInt();
		
		if (brojGodina % 2==0 && velicinaObuce % 2==0) {
			rezultat = brojGodina + velicinaObuce;
			
		} else {
			rezultat = brojGodina * velicinaObuce;

		}
		System.out.println("Resenje je: " + rezultat);
		
		
		
	}

}
