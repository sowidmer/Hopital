package personnes;

import java.util.ArrayList;
import java.util.List;

import misc.PatientException;

public class ListeAdministratifs {
	
private static List<Administratif> listeAdministratifs = new ArrayList<Administratif>();
	
	public ListeAdministratifs(List<Administratif> listeAdministratifs) {
			this.listeAdministratifs = listeAdministratifs;
	}
	
	public ListeAdministratifs(Administratif[] listeAdministratifs) {
		for (Administratif administratif : listeAdministratifs) {
			this.listeAdministratifs.add(administratif);
			System.out.println(administratif.getNom()+ " " + administratif.getPrenom() + " a été ajouté à la liste des Administratifs.");
		}
	}
	
	public void addAdministratifs(Administratif administratif) {
		if (administratif == null) {}
		else {
			listeAdministratifs.add(administratif);
		}
	}
	
	public  Administratif removeAdministratif(Administratif administratif) throws PatientException{
		int position = -1;
		for(Administratif admin : listeAdministratifs){
			position  +=1;
			if(admin.getNo() == administratif.getNo()){
				return listeAdministratifs.remove(position);        
			}
		}
		throw new PatientException("Administratif introuvable");
	}
	
	public int nombreAdministratifsListe() {
		return listeAdministratifs.size();
	}
	
	public static List<String> listerNomAdministratifs(){
		List<String> nomAdministratifs = new ArrayList<String>();     
    
		for (Administratif admin : listeAdministratifs){
			if(admin == null) {}
			else {
				nomAdministratifs.add(admin.getNom());
			}
		}
		return nomAdministratifs;
	}

}
