package Autres;

import java.util.ArrayList;
import java.util.List;

import misc.PatientException;

public class StockMedicaments {
  
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

}
