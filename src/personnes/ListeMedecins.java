package personnes;

import java.util.ArrayList;
import java.util.List;


import misc.PatientException;

public class ListeMedecins {
	
	private static List<Medecin> listeMedecins = new ArrayList<Medecin>();
	
	
	public ListeMedecins(List<Medecin> listeMedecins) {
			this.listeMedecins = listeMedecins;
	}
	
	public ListeMedecins(Medecin[] listeMedecins) {
		for (Medecin medecin : listeMedecins) {
			this.listeMedecins.add(medecin);
			System.out.println(medecin.getNom()+ " " + medecin.getPrenom() + " a été ajouté à la liste de medecins");
		}
	}
	
	public void addMedecin(Medecin medecin) {
		if (medecin == null) {}
		else {
			listeMedecins.add(medecin);
		}
	}
	
	public  Medecin removeMedecin(Medecin medecin) throws PatientException{
		int position = -1;
		for(Medecin med : listeMedecins){
			position  +=1;
			if(med.getNo() == medecin.getNo()){
				return listeMedecins.remove(position);        
			}
		}
		throw new PatientException("Medecin introuvable");
	}
	
	public int nombreMedecinsListe() {
		return listeMedecins.size();
	}
	
	public static List<String> listerNomMedecins(){
		List<String> nomMedecins = new ArrayList<String>();     
    
		for (Medecin med : listeMedecins){
			if(med == null) {}
			else {
				nomMedecins.add(med.getNom());
			}
		}
		return nomMedecins;
	}



}
