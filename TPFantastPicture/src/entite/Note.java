package entite;

public class Note {
			
	private int valeur;
	private ImageA image;
	private Personne personne;
	
	public Note(ImageA image, Personne personne, int val) {
		
		this.image = image;
		this.personne = personne;
		this.valeur = val;
	}
	
}
