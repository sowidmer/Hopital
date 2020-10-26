package local;

public class RestaurantSalle extends Salle implements InterfaceRestaurant {
    
   private int noResponsable;
   private String responsable;    
   
   
  //Constructeur complet
  public RestaurantSalle(int no, String nom, String genre, int noImmeuble,
      int etage, int nbrFenetre, int nbrTable, int surface, String horaireOuverture, String horaireFermeture) {
    super(no,nom,genre,noImmeuble,etage,nbrFenetre,nbrTable,surface, horaireOuverture, horaireFermeture);    
    
  }
  
  //constructeur reduit
  public RestaurantSalle(int no, String nom, String genre, String horaireOuverture, String horaireFermeture){
    super(no,nom,genre,horaireOuverture, horaireFermeture); 
    
  }
  
  //constructeur reduit avec Salle et horaires d'ouvertures
  public RestaurantSalle(Restaurant resto, String heureOuverture, String heureFermeture){
    this(resto.getNo(), resto.getNom(), resto.getGenre(), heureOuverture, heureFermeture);
  }
  
  public RestaurantSalle(Restaurant resto){
    this(resto.getNo(), resto.getNom(),resto.getGenre(), null, null);
    
  }

  public int getNoResponsable() {
    return noResponsable;
  }
  public void setNoResponsable(int noResponsable){
    this.noResponsable = noResponsable;
  }
  
  public String getResponsable() {
    return responsable;
  }
  
  public void setResponsable(String responsable){
    this.responsable = responsable;
  }
  

}
