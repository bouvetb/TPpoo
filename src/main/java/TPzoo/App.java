package TPzoo;

public class App {
	private static Zoo zoo;
	public static void main(String[] args) {
		zoo = new Zoo();
		Chien c = new Chien("Pluto");
		Chat ch = new Chat("Garfield");
		Secteur schat = new Secteur("Chat");
		Secteur schien = new Secteur("Chien");
		zoo.ajouterSecteur(schat);
		zoo.ajouterSecteur(schien);
		zoo.nouvelAnimal(ch);
		zoo.nouvelAnimal(c);
		for(int i = 0 ; i<17;i++) {
			try {
				zoo.nouveauVisiteur();
			} catch (LimiteVisiteurException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
			
	}

}
