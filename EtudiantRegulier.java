package est;

public class EtudiantRegulier extends Etudient {
	public double moyenne;

	
	public EtudiantRegulier(String nom, int annee, String section, double moyenne) {
		super(nom, annee, section);
		this.moyenne = moyenne;
	}


	@Override
	public String toString() {
		return "Etudiant regulier:\n"+super.toString()+"\nmoyenne : " + moyenne ;
	}
	
}
