package entite;

public class Personne {
	
	private String nomPersonne;
	private String mdpPersonne;
		
	public Personne(String nomP, String mdpP) {
		
		this.nomPersonne = nomP;
		this.mdpPersonne = mdpP;
		
	}
	
	
	public String getNomPersonne() {
		return nomPersonne;
	}
	
	public void setNomPersonne(String nomP) {
		this.nomPersonne = nomP;
	}
	
	public String getMdpPersonne() {
		return mdpPersonne;
	}

	public void setMdpPersonne(String mdpP) {
		this.mdpPersonne = mdpP;
	}
	
	
	
}
