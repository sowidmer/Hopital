package Autres;

import java.util.ArrayList;
import java.util.List;

import misc.PatientException;

public class StockMedicaments {
<<<<<<< HEAD

  private static List<Medicament> listeMedicaments = new ArrayList<Medicament>();// liste de medicaments

  public StockMedicaments(Medicament[] listeMedicaments) {
    for (int i = 0; i < listeMedicaments.length; i++) {
      this.listeMedicaments.add(listeMedicaments[i]);
      System.out.println(listeMedicaments[i].getNo() + " " + listeMedicaments[i].getNom());
    }
  }

  /*public StockMedicaments(List<Medicament> listeMedicaments) {
    this.listeMedicaments = listeMedicaments;
  }*/

  // add médicament
  public void addMedicament(Medicament medic) {
    if (medic != null) {
      listeMedicaments.add(medic);
    }
  }

  public Medicament removeMedicament(Medicament medic) throws PatientException {
    int position = -1;
    for (Medicament med : listeMedicaments) {
      position += 1;
      if (med.getNo() == medic.getNo()) {
        // return un oui non si ça c'est bien passé ou non
        return listeMedicaments.remove(position);
      }
    }   
    
    throw new PatientException("Médicament introuvable");
  }

  public int niveauStock() {
    return listeMedicaments.size();
    // nombre de médicament qui restent dans la liste
  }

  public static String listerNomMedicament() {
    List<String> nomMedicaments = new ArrayList<String>();
    List<Integer> noMedicaments = new ArrayList<Integer>();

    for (Medicament med : listeMedicaments) {
      if (med == null) {

      }

      else {
        nomMedicaments.add(med.getNom());
        noMedicaments.add(med.getNo());
        
      }
    }
    return  noMedicaments + " " + nomMedicaments;
    //return  nomMedicaments;
  }
  
=======
	
	private static  List<Medicament> listeMedicaments = new ArrayList<Medicament>() ;// tableau de medicaments

	public StockMedicaments(Medicament[] listeMedicaments) {
		for (int i=0; i< listeMedicaments.length; i++){
			this.listeMedicaments.add(listeMedicaments[i]);
			System.out.println(listeMedicaments[i].getNom());
		} 
	}
//afficher les médicaments, donner un médicaments
  
	public StockMedicaments(List<Medicament> listeMedicaments) {    
		this.listeMedicaments = listeMedicaments;     
	}
  
  //add médicament
	public void addMedicament(Medicament medic){
		if (medic != null){
			listeMedicaments.add(medic);
		}
	}
  
	public  Medicament removeMedicament(Medicament medic) throws PatientException{
		int position = -1;
		for(Medicament med : listeMedicaments){
			position  +=1;
			if(med.getNo() == medic.getNo()){
				return listeMedicaments.remove(position);        
			}
		}
    //return listeMedicaments.remove(medic);
    // return un oui non si ça c'est bien passé ou non
		throw new PatientException("Médicament introuvable");
	}
  
	public int niveauStock(){
		return listeMedicaments.size();
    //nombre de médicament qui restent dans la liste    
	}
  
	public static List<String> listerNomMedicament(){
		List<String> nomMedicaments = new ArrayList<String>();     
    
		for (Medicament med : listeMedicaments){
			if(med == null){
        
			}
    
			else {
				nomMedicaments.add(med.getNom());
			}
		}
		return nomMedicaments;
	}

>>>>>>> 0a6b96852a4603819ca3a919a117f11988edbc09
}
