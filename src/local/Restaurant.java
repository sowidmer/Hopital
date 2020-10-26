package local;

public class Restaurant extends Local implements InterfaceRestaurant {

  private int noResponsable;
  private String responsable;
  
  //Constructeur complet
  public Restaurant(int no, String nom, String genre, int noImmeuble,
      int etage, int nbrFenetre, int nbrTable, int surface, int noResponsable,
      String responsable) {
    super(no, nom, genre, noImmeuble, etage, nbrFenetre, nbrTable, surface);
    
  }
  
  //constructeur réduit
  public Restaurant(int no, String nom, String genre){
    super(no, nom, genre);
  }

  public int getNoResponsable() {
    return noResponsable;
  }

  public void setNoResponsable(int noResponsable) {
    this.noResponsable = noResponsable;
  }

  public String getResponsable() {
    return responsable;
  }

  public void setResponsable(String responsable) {
    this.responsable = responsable;
  }

}
