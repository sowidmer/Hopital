package Autres;

import java.util.ArrayList;

public class Service {

  private int no;
  private String genre;
  private int noImmeuble;
  private int etage;
  private ArrayList<String> ServicesListe;

  public Service(int no, String genre, int noImmeuble, int etage) {
    this.no = no;
    this.genre = genre;
    this.noImmeuble = noImmeuble;
    this.etage = etage;
    
  }
  
  public void AddElementListe(){
    ServicesListe = new ArrayList();
    ServicesListe.add("Neurologie");
    ServicesListe.add("Oncologie");
    ServicesListe.add("Pneumologie");
    ServicesListe.add("Diabetologie");
    ServicesListe.add("Allergologie");
    
    for(int i=0; i< ServicesListe.size(); i++) { 
      System.out.println(ServicesListe.get(i)) ;
     }
    
  }

  public int getNo() {
    return no;
  }

  public void setNo(int no) {
    this.no = no;
  }

  public String getGenre() {
    return genre;
  }

  public void setGenre(String genre) {
    this.genre = genre;
  }

  public int getNoImmeuble() {
    return noImmeuble;
  }

  public void setNoImmeuble(int noImmeuble) {
    this.noImmeuble = noImmeuble;
  }

  public int getEtage() {
    return etage;
  }

  public void setEtage(int etage) {
    this.etage = etage;
  }

}
