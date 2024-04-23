package est;

import java.util.ArrayList;

public class Main {
	private static ArrayList<Personne> est;
	public static void main(String[] args) {
		est = new ArrayList<>();
		est.add(new EtudiantRegulier("Mohammed Nouri", 2013, "SSC", 16.0));
		est.add(new EtudiantRegulier("Chaimae Mhisar", 2011, "SSC", 2.5));
		est.add(new EtudiantEchange("Bjorn Borgue", 2012, "Informatique", "KTH"));
		est.add(new Enseingant("Abdllah Moslih", 1998, "LMEP", 30000, "Physique"));
		est.add(new Secrétaires("Najat Tahiri", 2005, "LMT", 5000));
		
		System.out.println("parmi les " + est.size()+" ESTients, " + nombre()+ " sont des etudiants.");
		System.out.println("Ils sont a l'est depuis en moyenne " + moyenne() + " ans");
		System.out.println("Liste des Estients:");
		for(Personne p : est) {
			System.out.println(p);
		}
		
	}
	
	
	
	private static int nombre() {
		int c=0;
		for(Personne p : est) {
			if(p instanceof Etudient)
				c++;
		}
		return c;
	}
	
	private static double moyenne() {
		double somme=0;
		for(Personne p : est) {
			somme += (2015 - p.getAnnee());
		}
		return somme/est.size();
	}
}
