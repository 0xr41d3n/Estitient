package est;

public class Estisient extends Personne {
	public String labo;
	public double salaire;
	public Estisient(String nom, int annee, String labo, double salaire) {
		super(nom, annee);
		this.labo = labo;
		this.salaire = salaire;
	}
	@Override
	public String toString() {
		return super.toString() + "\nLabo : " + labo + "\nSalaire : " + salaire;
	}
	
	
	
	
	
}
