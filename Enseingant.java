package est;

public class Enseingant extends Estisient {
	public String sectionEns;

	public Enseingant(String nom, int annee, String labo, double salaire, String sectionEns) {
		super(nom, annee, labo, salaire);
		this.sectionEns = sectionEns;
	}

	@Override
	public String toString() {
		return "Enseignant:\n"+super.toString()+"\nsectionEns : " + sectionEns;
	}
	
}
