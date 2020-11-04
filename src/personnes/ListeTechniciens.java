package personnes;

import java.util.ArrayList;
import java.util.List;

import misc.PatientException;

public class ListeTechniciens {
	
private static List<Technicien> listeTechniciens = new ArrayList<Technicien>();
	
	public ListeTechniciens(List<Technicien> listeTechniciens) {
			this.listeTechniciens = listeTechniciens;
	}
	
	public ListeTechniciens(Technicien[] listeTechniciens) {
		for (Technicien technicien : listeTechniciens) {
			this.listeTechniciens.add(technicien);
			System.out.println(technicien.getNom()+ " " + technicien.getPrenom() + " a été ajouté à la liste de Techniciens");
		}
	}
	
	public void addTechnicien(Technicien technicien) {
		if (technicien == null) {}
		else {
			listeTechniciens.add(technicien);
		}
	}
	
	public  Technicien removeTechnicien(Technicien technicien) throws PatientException{
		int position = -1;
		for(Technicien tech : listeTechniciens){
			position  +=1;
			if(tech.getNo() == technicien.getNo()){
				return listeTechniciens.remove(position);        
			}
		}
		throw new PatientException("Technicien introuvable");
	}
	
	public int nombreTechniciensListe() {
		return listeTechniciens.size();
	}
	
	public static List<String> listerNomTechniciens(){
		List<String> nomTechniciens = new ArrayList<String>();     
    
		for (Technicien tech : listeTechniciens){
			if(tech == null) {}
			else {
				nomTechniciens.add(tech.getNom());
			}
		}
		return nomTechniciens;
	}

}
