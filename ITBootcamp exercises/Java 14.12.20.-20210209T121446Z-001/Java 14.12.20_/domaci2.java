package domaci;

import java.util.Scanner;

public class domaci2 {

	public static void main(String[] args) {
	
		Scanner skener = new Scanner(System.in);
		
		int a;
		
		System.out.println("Broj: ");
		a = skener.nextInt();
		
		if (a % 2 == 0) {
			System.out.println("Uneti broj je paran");
		}
		else {
			System.out.println("Uneti broj je neparan");
		}
		
		
		
		
	}

}
