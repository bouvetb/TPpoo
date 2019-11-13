package TPzoo;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
	private int visiteurs;
	public List<Secteur> secteurAnimaux;
	
	public Zoo() {
		super();
		visiteurs =0;
		secteurAnimaux = new ArrayList<Secteur>();
	}

	public void nouveauVisiteur() throws LimiteVisiteurException {
		visiteurs++;
		if(visiteurs > this.getLimiteVisiteurs()) {
			throw new LimiteVisiteurException();
		}
	}

	public int getLimiteVisiteurs() {
		return 15;
	}
	
	public void nouvelAnimal(Animal a) {
		for(int i=0;i<secteurAnimaux.size();i++) {
			if(secteurAnimaux.get(i).getTypeAnimalDansSecteur().equals(a.getTypeAnimal())) {
				secteurAnimaux.get(i).ajouterAnimal(a);
			}
		}
	}
	public int nombreAnimaux() {
		int res=0;
		for(int i=0;i<secteurAnimaux.size();i++) {
			res+=secteurAnimaux.get(i).getNombreAnimauxDansSecteur();
		}
		return res;
		
	}
	
	public void ajouterSecteur(Secteur s) {
		secteurAnimaux.add(s);
	}
	
	
	
}
