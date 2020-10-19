package Autres;

import misc.PatientException;
import misc.TableauException;

public class Medicament  {

  private int no;
  private String nom;
  private String composition;
  private String formeGalenique;
  private String effetSecondaire;
  private String[] listeMedicament = {"Aspirine", "Paracetamol", "Dafalgan", "Panadol","Alcacyl"};

  public Medicament(int no, String nom, String composition, String formeGalenique, String effetSecondaire)  {
    this.no = no;
    this.nom = nom;
    this.composition = composition;
    this.formeGalenique = formeGalenique;
    this.effetSecondaire = effetSecondaire;   
  }
  
  public void afficherMedicament(int noMedic) throws TableauException{
    System.out.println(listeMedicament.length + " = nombre de médicaments dans la liste");
    
    if ((noMedic > listeMedicament.length)) {
      throw new TableauException("Pas de medicament");
    }
    else{
      System.out.println("le medicament est: " + listeMedicament[noMedic]);
    }
  }  
  
  public void listerMedicaments(){
    
      for(int i=0; i< listeMedicament.length; i++) { 
        System.out.println(listeMedicament[i]) ;
      }     
  }
  

  public int getNo() {
    return no;
  }

  public void setNo(int no) {
    this.no = no;
  }

  public String getNom() {
    return nom;
  }

  public void setNom(String nom) {
    this.nom = nom;
  }

  public String getComposition() {
    return composition;
  }

  public void setComposition(String composition) {
    this.composition = composition;
  }

  public String getFormeGalenique() {
    return formeGalenique;
  }

  public void setFormeGalenique(String formeGalenique) {
    this.formeGalenique = formeGalenique;
  }

  public String getEffetSecondaire() {
    return effetSecondaire;
  }

  public void setEffetSecondaire(String effetSecondaire) {
    this.effetSecondaire = effetSecondaire;
  }

}

