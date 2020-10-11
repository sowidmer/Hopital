package Autres;

public class Medicament {

  private int no;
  private String nom;
  private String composition;
  private String formeGalenique;
  private String effetSecondaire;

  public Medicament(int no, String nom, String composition,
      String formeGalenique, String effetSecondaire) {
    this.no = no;
    this.nom = nom;
    this.composition = composition;
    this.formeGalenique = formeGalenique;
    this.effetSecondaire = effetSecondaire;
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
