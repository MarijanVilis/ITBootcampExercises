package domaci;


import java.util.Scanner;

public class domaci2 {

	public static void main(String[] args) {
		
		//Napisati program koji proverava da li je napisan niz rastuci.
		//Primer1 niza: 3 54 123 18
		//Ispis: Niz nije rastuci.
		//Primer2 niza: 71 422 1001 5054
		//Ispis: Niz je rastuci
		
		int[] niz1 = {3,54, 123,18};
		int[] niz2 = {1,2,3,4,5};
		boolean neRastuci = isSorted(niz1);
		boolean rastuci = isSorted(niz2);
		
		System.out.println("Prvi niz je: ");
		for (int j = 0; j < niz1.length; j++) {
			System.out.print(niz1[j] + " ");
		}
		if (neRastuci == false) {
			System.out.println(" = Niz nije rastuci");
		}else{
			System.out.println(" = Niz je rastuci");
		}
		
		System.out.println("Drugi niz je: ");
		for (int i = 0; i < niz2.length; i++) {
			System.out.print(niz2[i] + " ");
		}
		if (rastuci == true) {
			System.out.println(" = Niz je rastuci");
		}else {
			System.out.println(" = Niz nije rastuci");
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


