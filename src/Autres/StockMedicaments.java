package Autres;

import java.util.ArrayList;
import java.util.List;

import misc.PatientException;

public class StockMedicaments {
  
  private  List<Medicament> listeMedicaments = new ArrayList<Medicament>() ;// tableau de medicaments

  public StockMedicaments(Medicament[] listeMedicaments) {
    for (int i=0; i< listeMedicaments.length; i++){
      this.listeMedicaments.add(listeMedicaments[i]);
    } 
  }
//afficher les m�dicaments, donner un m�dicaments
  //constructeur qui prend un
  
  public StockMedicaments(List<Medicament> listeMedicaments) {    
      this.listeMedicaments = listeMedicaments;     
  }
  
  //add m�dicament
  public void addMedicament(Medicament medic){
    listeMedicaments.add(medic);
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
    // return un oui non si �a c'est bien pass� ou non
    throw new PatientException("M�dicament introuvable");
  }
  
  public int niveauStock(){
    return listeMedicaments.size();
    //nombre de m�dicament qui restent dans la liste
    
  }
  
  //remove medicament
}
