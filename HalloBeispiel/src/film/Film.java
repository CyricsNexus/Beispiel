package film;

public class Film {

	String titel = "";
	String genre = "";
	String ova = "";
	
	public Film(String titel) {
		this.titel = titel;
	}
	
	public Film(String titel, String genre) {
		this.titel = titel;
		this.genre = genre;
	}
}
