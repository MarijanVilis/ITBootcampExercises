package Autor;

public class Knjiga {

	private String ISBN;
	private String nazivKnjige;
	private int godinaIzdanja;
	private Autor autor;
	
	

	public Knjiga(String iSBN, String nazivKnjige, int godinaIzdanja, Autor autor) {
		ISBN = iSBN;
		this.nazivKnjige = nazivKnjige;
		this.godinaIzdanja = godinaIzdanja;
		this.autor = autor;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public String getNazivKnjige() {
		return nazivKnjige;
	}

	public void setNazivKnjige(String nazivKnjige) {
		this.nazivKnjige = nazivKnjige;
	}

	public int getGodinaIzdanja() {
		return godinaIzdanja;
	}

	public void setGodinaIzdanja(int godinaIzdanja) {
		this.godinaIzdanja = godinaIzdanja;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}
	public void stampajKnjigu() {
		System.out.println("(" + ISBN + ") ");
		System.out.println("(" + nazivKnjige + " - " + godinaIzdanja + ")");
		System.out.print("Autor: " );  autor.stampaj();
	}
}
