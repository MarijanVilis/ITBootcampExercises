package domaci;

import java.util.Scanner;

public class domaci1 {

	public static void main(String[] args) {
		// ispisati da li je trougao jednakostranicni, jednakokraki ili raznostranicni

		Scanner skener = new Scanner(System.in);

		int a;
		int b;
		int c;

		System.out.println("Broj: ");
		a = skener.nextInt();

		System.out.println("Broj: ");
		b = skener.nextInt();

		System.out.println("Broj: ");
		c = skener.nextInt();

		if (a == b && b == c) {
			System.out.println("Trougao je jednakostranican");
		} else if (a == b || b == c) {
			System.out.println("Trougao je jednakokraki");
		} else if (a > b && b > c) {
			System.out.println("Trougao je raznostranicni");
		} else if (a < b && b < c) {
			System.out.println("Trougao je raznostranicni");
		} else {
			System.out.println("Unesite odgovarajuce vrednosti");
		}

	}

}
