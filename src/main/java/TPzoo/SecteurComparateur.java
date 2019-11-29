package TPzoo;

import java.util.Comparator;

public class SecteurComparateur implements Comparator<Secteur>{

	@Override
	public int compare(Secteur o1, Secteur o2) {
		int res=0;
		if(o1.getNombreAnimauxDansSecteur() >o2.getNombreAnimauxDansSecteur()) {
			res=1;
		}else if(o2.getNombreAnimauxDansSecteur() > o1.getNombreAnimauxDansSecteur()){
			res=-1;
			
		}
		return res;
	}

}
