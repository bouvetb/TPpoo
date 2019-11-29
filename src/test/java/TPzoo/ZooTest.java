package TPzoo;

import static org.junit.Assert.*;



import java.util.Comparator;

import org.junit.Test;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class ZooTest {
	Zoo zoo;
	private static final Logger logger = LogManager.getLogger(ZooTest.class);
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
		logger.info("nouvel animal "+ c);
		logger.trace("nouvel animal "+ c);
		logger.debug("nouvel animal "+ c);
		logger.warn("nouvel animal "+ c);
		logger.error("nouvel animal "+ c);
		logger.fatal("nouvel animal "+ c);
		assertEquals("Pluto",zoo.secteurAnimaux.get(1).animauxDansSecteur.get(0).getNomAnimal());
	}
	@Test
	public void testComparaisonSecteur() {
		zoo = new Zoo();
		Chien c = new Chien("Pluto");
		Chien c2 = new Chien("Pluton");
		Chat ch = new Chat("Garfield");
		Secteur schat = new Secteur("Chat");
		Secteur schien = new Secteur("Chien");
		zoo.ajouterSecteur(schat);
		zoo.ajouterSecteur(schien);
		zoo.nouvelAnimal(ch);
		zoo.nouvelAnimal(c2);
		zoo.nouvelAnimal(c);
		Comparator comp = new SecteurComparateur();
		assertEquals(1,comp.compare(schien,schat));
		
	}

}
