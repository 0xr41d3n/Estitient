package est;

public class Secrétaires extends Estisient {

	public Secrétaires(String nom, int annee, String labo, double salaire) {
		super(nom, annee, labo, salaire);
		}

	@Override
	public String toString() {
		return "Secretaire: \n"+super.toString();
	}
	
}
