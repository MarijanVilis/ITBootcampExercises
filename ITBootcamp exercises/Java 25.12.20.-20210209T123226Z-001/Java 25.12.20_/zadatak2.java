package domaci2;

public class zadatak2 {

	public static void main(String[] args) {
		// Napisati program koji prikazuje sve proste brojeve od 0 do 100

		boolean prost = true;
		 
        for (int x = 0; x <= 100; x++) {
            prost = true;           
            for (int i = 2; i < x && prost == true; i++)  
                if (x % i == 0)                          
                    prost = false;
            if (prost == true)                          
                System.out.print(" " + x);
        }
		
		
		
		
		
		
	}

}
