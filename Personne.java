package est;

public class Personne {
	private String nom;
	private int annee;
	
	public Personne(String nom,int 	annee) {
		this.annee=annee;
		this.nom=nom;
	}

	@Override
	public String toString() {
		return "Nom : " + nom + "\nAnnee : " + annee;
	}

	public int getAnnee() {
		return annee;
	}
	

}
