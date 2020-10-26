package horaires;

public abstract class Horaire {

  private int no;
  private int noEmploye;
  private String dateJour;
  private String dateDebut;
  private String dateFin;
  private String debutMatin;
  private String finMatin;
  private String debutApresMidi;
  private String finApresMidi;

  public Horaire(int no, int noEmploye, String dateJour, String dateDebut, String dateFin, String debutMatin,
      String finMatin, String debutApresMidi, String finApresMidi) {
    this.no = no;
    this.noEmploye = noEmploye;
    this.dateJour = dateJour;
    this.dateDebut = dateDebut;
    this.dateFin = dateFin;    
    this.debutMatin = debutMatin;
    this.finMatin = finMatin;
    this.debutApresMidi = debutApresMidi;
    this.finApresMidi = finApresMidi;
  }

  public Horaire(int no, int noEmploye, String dateDebut, String dateFin, String debutMatin, String finMatin) {  
    this.no = no;
    this.noEmploye = noEmploye;
    this.dateDebut = dateDebut;
    this.dateFin = dateFin;    
    this.debutMatin = debutMatin;
  }

  public int getNo() {
    return no;
  }

  public void setNo(int no) {
    this.no = no;
  }

  public int getNoEmploye() {
    return noEmploye;
  }

  public void setNoEmploye(int noEmploye) {
    this.noEmploye = noEmploye;
  }

  public String getDateJour() {
    return dateJour;
  }

  public void setDateJour(String dateJour) {
    this.dateJour = dateJour;
  }
  
  public String getDateDebut() {
    return dateDebut;
  }

  public void setDateDebut(String dateJour) {
    this.dateDebut = dateDebut;
  }
  
  public String getDateFin() {
    return dateFin;
  }

  public void setDateFin(String dateJour) {
    this.dateFin = dateFin;
  }

  public String getDebutMatin() {
    return debutMatin;
  }

  public void setDebutMatin(String debutMatin) {
    this.debutMatin = debutMatin;
  }

  public String getFinMatin() {
    return finMatin;
  }

  public void setFinMatin(String finMatin) {
    this.finMatin = finMatin;
  }

  public String getDebutApresMidi() {
    return debutApresMidi;
  }

  public void setDebutApresMidi(String debutApresMidi) {
    this.debutApresMidi = debutApresMidi;
  }

  public String getFinApresMidi() {
    return finApresMidi;
  }

  public void setFinApresMidi(String finApresMidi) {
    this.finApresMidi = finApresMidi;
  }

}
