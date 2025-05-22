package film;

public class Film {

	String titel = "";
	String genre = "";
	String ova = "";
	int jahr = 0;
	
	public Film(String titel) {
		this.titel = titel;
	}
	 
	public Film(String titel, String genre) {
		this.titel = titel;
		this.genre = genre;
	}
}
