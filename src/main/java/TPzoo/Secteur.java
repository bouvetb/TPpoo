package TPzoo;

import java.util.ArrayList;
import java.util.List;

public class Secteur {
	private String typeAnimalDansSecteur;
	public List<Animal> animauxDansSecteur;

	public Secteur(String typeAnimalDansSecteur) {
		super();
		this.typeAnimalDansSecteur = typeAnimalDansSecteur;
		animauxDansSecteur = new ArrayList<Animal>();
		
	}
	
	public void ajouterAnimal(Animal a) {
		animauxDansSecteur.add(a);
	}

	public String getTypeAnimalDansSecteur() {
		return typeAnimalDansSecteur;
	}

	public int getNombreAnimauxDansSecteur() {
		return animauxDansSecteur.size();
	}
	
	
	
	
}
