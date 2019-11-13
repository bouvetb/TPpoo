import static org.junit.Assert.*;

import org.junit.Test;

import TPzoo.Chat;
import TPzoo.Chien;
import TPzoo.LimiteVisiteurException;
import TPzoo.Secteur;
import TPzoo.Zoo;

public class test {

	@Test
	public void test() {
		Zoo zoo;	
		zoo = new Zoo();
		Chien c = new Chien("Pluto");
		Chat ch = new Chat("Garfield");
		Secteur schat = new Secteur("Chat");
		Secteur schien = new Secteur("Chien");
		zoo.ajouterSecteur(schat);
		zoo.ajouterSecteur(schien);
		zoo.nouvelAnimal(ch);
		zoo.nouvelAnimal(c);
		assertEquals("Pluto",zoo.secteurAnimaux.get(1).animauxDansSecteur.get(0).getNomAnimal());
		for(int i = 0 ; i<17;i++) {
			try {
				zoo.nouveauVisiteur();
			} catch (LimiteVisiteurException e) {
				// TODO Auto-generated catch block
				fail("nombres de visiteurs trop grand");
			}
		}
	}

}
