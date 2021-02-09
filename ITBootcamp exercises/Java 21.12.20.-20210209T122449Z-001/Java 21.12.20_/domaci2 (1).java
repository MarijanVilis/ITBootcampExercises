package domaci;


import java.util.Scanner;

public class domaci2 {

	public static void main(String[] args) {
		
		//Napisati program koji proverava da li je napisan niz rastuci.
		//Primer1 niza: 3 54 123 18
		//Ispis: Niz nije rastuci.
		//Primer2 niza: 71 422 1001 5054
		//Ispis: Niz je rastuci
		
		Scanner scn = new Scanner(System.in);
		
		int n;
		
		System.out.println("Unesite koliko zelite brojeva u nizu: ");
		n = scn.nextInt();
		
		int niz[] = new int[n];
		for(int i = 0; i < n; i++)
        {
			System.out.println("Unesite element " + (i+1) + ":");
            niz[i] = scn.nextInt();
        }
		
		boolean neRastuci = isSorted(niz);
		
		System.out.print("Niz je: ");
		for (int j = 0; j < niz.length; j++) {
			System.out.print(niz[j] + " ");
		}
		if (neRastuci == false) {
			System.out.println(" = Niz nije rastuci");
		}else{
			System.out.println(" = Niz je rastuci");
		}
		
		
	}
	public static boolean isSorted(int[] data){
	    for(int i = 1; i < data.length; i++){
	        if(data[i-1] > data[i]){
	            return false;
	        }
	    }
	    return true;
	}
		
	}


