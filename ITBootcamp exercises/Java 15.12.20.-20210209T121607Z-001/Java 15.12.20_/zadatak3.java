package domaci;

public class zadatak3 {

	public static void main(String[] args) {
		//Napisati program koji ce prebrojati koliko je brojeva 
		//od 9 do 250 (ukljucujuci i njih) deljivih brojem 3.

		int start = 9;
		int stop = 250;
		int suma = 0;
		
		
		for (int i = start; i <= stop; i++) {
			if (i % 3 == 0) {
				suma++;
			}
			
		}
		System.out.println("Brojevi deljivi sa 3: "+ suma);

		
		
		
		
		
		
	}

}
