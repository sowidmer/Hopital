package personnes;

import java.util.ArrayList;
import java.util.List;

import misc.PatientException;

public class ListeInfirmiers {
	
	private static List<Infirmier> listeInfirmiers = new ArrayList<Infirmier>();
	
	public ListeInfirmiers(List<Infirmier> listeInfirmier) {
			this.listeInfirmiers = listeInfirmiers;
	}
	
	public ListeInfirmiers(Infirmier[] listeInfirmier) {
		for (Infirmier infirmier : listeInfirmier) {
			this.listeInfirmiers.add(infirmier);
			System.out.println(infirmier.getNom()+ " " + infirmier.getPrenom() + " a été ajouté à la liste d'infirmiers");
		}
	}
	
	public void addInfirmier(Infirmier infirmier) {
		if (infirmier == null) {}
		else {
			listeInfirmiers.add(infirmier);
		}
	}
	
	public  Infirmier removeInfirmier(Infirmier infirmier) throws PatientException{
		int position = -1;
		for(Infirmier inf : listeInfirmiers){
			position  +=1;
			if(inf.getNo() == infirmier.getNo()){
				return listeInfirmiers.remove(position);        
			}
		}
		throw new PatientException("Infirmier introuvable");
	}
	
	public int nombreInfirmierListe() {
		return listeInfirmiers.size();
	}
	
	public static List<String> listerNomInfirmiers(){
		List<String> nomInfirmiers = new ArrayList<String>();     
    
		for (Infirmier inf : listeInfirmiers){
			if(inf == null) {}
			else {
				nomInfirmiers.add(inf.getNom());
			}
		}
		return nomInfirmiers;
	}

}
