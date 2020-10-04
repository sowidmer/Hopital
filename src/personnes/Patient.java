package personnes;

import local.Chambre;
import local.Local;
import Soins.Operation;
import misc.*;


public class Patient extends Personne {
  
  private Chambre chambre;
  private Local local;
  private Operation operation;
  
public Patient(){
    
  }
  
  public void operer(String patient){
    if (patient.equals("Sonja Widmer"))  {
        System.out.println("Elle se fait operer le 14.10.2020");
        }
  else{
    System.out.println("Pas d'opération prévue");
    }
  }
  
  
  
  public Patient(String prenom, String nom) throws PatientException{
    //this();
    
    if(nom.equals("Wiedmer")) {
      throw new PatientException("Nom mal orthographié");
    }
    if(nom.trim().length()>1){
      this.nom = nom;
      this.prenom = prenom;
    }
    
  }
  
  
  
  public Chambre getChambre() {
    return chambre;
  }
  public void setChambre(Chambre chambre) {
    this.chambre = chambre;
  }
  public Local getLocal() {
    return local;
  }
  public void setLocal(Local local) {
    this.local = local;
  }
  public Operation getOperation() {
    return operation;
  }
  public void setOperation(Operation operation) {
    this.operation = operation;
  }

  
}
