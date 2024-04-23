package est;

public class EtudiantEchange extends Etudient {
	
	private String uni;
	public EtudiantEchange(String nom, int annee, String section, String uni) {
		super(nom, annee, section);
		this.uni = uni;
	}



	@Override
	public String toString() {
		return "Etudiant d'echange:\n"+super.toString()+"\nUni d'origine : " + uni;
	}
	
	

}
