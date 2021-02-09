package domaci2;

import java.util.Scanner;

public class zadatak3 {

	public static void main(String[] args) {
		// Napisati program gde korisnik unese broj, a program mu vrati odgovor da li je unet broj prost ili ne

		Scanner scn= new Scanner(System.in);
		
		int privremena;
		boolean daLiJeProstBroj=true;
		
		
		System.out.println("Unesite broj:");
		int num=scn.nextInt();
		 
		for(int i=2;i<=num/2;i++){
	           privremena=num%i;
	           
		   if(privremena==0){
		      daLiJeProstBroj=false;
		      break;
		   }
		}
		
		if(daLiJeProstBroj)
		   System.out.println(num + " je prost broj.");
		else
		   System.out.println(num + " nije prost broj.");
		
		
		
		
	}

}
