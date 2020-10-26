package local;


public class Salle extends Local {
  
  private String horaireOuverture;
  private String horaireFermeture;

  //Constructeur complet
  public Salle(int no, String nom, String genre, int noImmeuble, int etage,
      int nbrFenetre, int nbrTable, int surface, String horaireOuverture, String horaireFermeture) {
    super(no, nom, genre, noImmeuble, etage, nbrFenetre, nbrTable, surface);
    this.horaireFermeture = horaireFermeture;
    this.horaireOuverture = horaireOuverture;
    
  } 
  
  //constructeur reduit
  public Salle(int no, String nom,String genre,String horaireOuverture, String horaireFermeture){
    super(no,nom,genre);
    this.horaireOuverture = horaireOuverture;
    this.horaireFermeture = horaireFermeture;
  }
  
  public String getHoraireOuverture() {
    return horaireOuverture;
  }

  public void setHoraireOuverture(String horaireOuverture) {
    this.horaireOuverture = horaireOuverture;
  }

  public String getHoraireFermeture() {
    return horaireFermeture;
  }

  public void setHoraireFermeture(String horaireFermeture) {
    this.horaireFermeture = horaireFermeture;
  }
}
