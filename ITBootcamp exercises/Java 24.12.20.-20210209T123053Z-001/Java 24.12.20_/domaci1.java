package domaci;

import java.util.Scanner;

public class domaci1 {

	public static void main(String[] args) {
//Napisati funkciju koja za parametre prima tri broja num1, num2 i num3 i proverava da li je zbir num1 i num2 jednak num3.
//Primer:
//Ako se unese num1 = 2, num2 = 4, i num3 = 99 vraca false
//Ako se unese num1 = 2, num2 = 4, i num3 = 6 vraca true

		Scanner scn = new Scanner (System.in);
		
		int a;
		int b;
		int c;
		
		System.out.println("Unesite prvi broj: ");
		a = scn.nextInt();
		
		System.out.println("Unesite drugi broj: ");
		b = scn.nextInt();
		
		System.out.println("Unesite treci broj: ");
		c = scn.nextInt();
		
		System.out.println(funkcija(a, b, c));
		
		
	}
	public static boolean funkcija(int a, int b, int c) {
		if (c == a+b) {
			return true;
		} 
		else {
			return false;
		}
	}
}
