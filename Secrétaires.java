package est;

public class Secr�taires extends Estisient {

	public Secr�taires(String nom, int annee, String labo, double salaire) {
		super(nom, annee, labo, salaire);
		}

	@Override
	public String toString() {
		return "Secretaire: \n"+super.toString();
	}
	
}
