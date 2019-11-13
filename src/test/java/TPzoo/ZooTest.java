package TPzoo;

import static org.junit.Assert.*;

import org.junit.Test;

public class ZooTest {
	Zoo zoo;

	@Test
	public void testNouveauVisiteur() {
		zoo = new Zoo();
		for(int i = 0 ; i<15;i++) {
			try {
				zoo.nouveauVisiteur();
			} catch (LimiteVisiteurException e) {
				// TODO Auto-generated catch block
				fail("nombres de visiteurs trop grand");
			}
		}
	}

	@Test
	public void testNouvelAnimal() {
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
	}

}
