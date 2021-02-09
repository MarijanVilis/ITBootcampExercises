package domaci2;

import java.util.Scanner;

public class zadatak4 {

	public static void main(String[] args) {
		// Napisati funkciju koja racuna aritmeticku sredinu niza

		Scanner scn = new Scanner(System.in);
		
        System.out.println("Ucitaj broj clanova niza: ");
        int n = scn.nextInt();
 
        int niz[] = new int[n];
        System.out.println("Ucitaj clanove niza:");
        for (int i = 0; i < niz.length; i++) {
            niz[i] = scn.nextInt(); 
        }
        double broj=0;
        double suma=0;
        for(int i=0; i < niz.length;i++){
            suma=suma+niz[i];
            broj=broj+1;
        }
        double aritmetickaSredina;
        aritmetickaSredina=suma/broj;
        System.out.println("Aritmeticka Sredina niza = "+aritmetickaSredina); 
		
		
	}

}
