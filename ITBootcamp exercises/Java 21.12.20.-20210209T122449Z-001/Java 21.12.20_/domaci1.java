package domaci;

import java.util.Scanner;

public class domaci1 {

	public static void main(String[] args) {
		//Napisati program koji ucitava duzinu niza, niz i ispisuje niz inverznim redosledom.
		//Primer niza: 32 54 123 18
		//Ispis: 18 123 54 32

		int[] niz = {1, 2, 3, 4, 5, 7 };
		
		System.out.println("Duzina niza je: " + niz.length);
		
		System.out.print("Niz je: ");
		for (int i = 0; i < niz.length; i++) {
			System.out.print(niz[i] + ", ");
		}
		System.out.println();
		System.out.print("Ovo je obrnuti niz: ");
		 for (int i = niz.length-1; i >= 0; i--) {  
	            System.out.print(niz[i] + ", "); 
	        }
		
	}

}
