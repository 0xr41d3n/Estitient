package est;

public class Etudient extends Personne {
	public String section;
	public Etudient(String nom, int annee, String section) {
		super(nom, annee);
		this.section = section;
	}

	@Override
	public String toString() {
		return super.toString()+"\nsection : " + section;
	}
	
	
}
