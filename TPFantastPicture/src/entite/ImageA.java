package entite;

public class ImageA {
	
	private String nomImage;
	private String urlImage;
	
	public ImageA(String nomI, String urlI) {
		
		this.nomImage =nomI;
		this.urlImage =urlI;
		
	}

	public String getNomImage() {
		return nomImage;
	}
	
	public void setNomImage(String nomI) {
		this.nomImage = nomI;
	}
	
	public String getUrlImage() {
		return urlImage;
	}

	public void setUrlImage(String urlI) {
		this.urlImage = urlI;
	}
	
	
	
}
