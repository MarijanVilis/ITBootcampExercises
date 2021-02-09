package Autor;

public class Main {

	public static void main(String[] args) {
		
		Autor a1 = new Autor("Ronald", "Tolkin");
		Autor a2 = new Autor("Piter", "Bret");
		
		Knjiga k1 = new Knjiga("235226", "Lord of the Rings", 1931, a1);
		Knjiga k2 = new Knjiga("23567734", "Utroba Zemlje", 1999, a2);
		Knjiga k3 = new Knjiga("2526378723", "Silmarilion", 1932, a1);
				
		a1.stampaj();
		System.out.println(" ");
		a2.stampaj();
		System.out.println(" ");
		k1.stampajKnjigu();
		System.out.println(" ");
		k2.stampajKnjigu();
		System.out.println(" ");
		k3.stampajKnjigu();
	}

}
