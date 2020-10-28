package Autres;

import misc.PatientException;
import misc.TableauException;

public class Medicament extends Exception  {

  private int no;
  private String nom;
  private String composition;
  private String formeGalenique;
  private String effetSecondaire;  
  
  private String[] listeMedicament = {"Aspirine", "Paracetamol", "Dafalgan", "Panadol","Alcacyl"};// tableau de medicaments
  
  public Medicament(int no, String nom){
    this.no = no;
    this.nom = nom; 
  }

  //constructeur
  public Medicament(int no, String nom, String composition, String formeGalenique, String effetSecondaire)  {
    this(no,nom);
    this.nom = nom;
    this.composition = composition;
    this.formeGalenique = formeGalenique;
    this.effetSecondaire = effetSecondaire;   
  }
  
  // m�thode qui affiche un m�dicament pr�cis � une position demand�e avec un exception personnalis�e TableauException - appel depuis le main
  public void afficherMedicament(int noMedic) throws TableauException{
    System.out.println(listeMedicament.length + " = nombre de m�dicaments dans la liste");
    
    if ((noMedic > listeMedicament.length)) {
      throw new TableauException("Pas de medicament");
    }
    else{
      System.out.println("le medicament est: " + listeMedicament[noMedic]);
    }
  }  
  
//m�thode qui affiche un m�dicament pr�cis � une position demand�e avec un exception g�n�rale + try catch - appel depuis le main
  public void afficherMedicament1(int noMedic) throws TableauException{
    
    try{
      
      System.out.println("le medicament est: " + listeMedicament[noMedic]);
      
    }
    catch(IndexOutOfBoundsException te1){
      
      System.out.println("Une exception a �t� lev�e") ;
      throw new TableauException("Pas de medicament");      
    }
  }
  
  
  // m�thode qui liste les m�dicaments pas besoin d'exception - appel depuis le main
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

