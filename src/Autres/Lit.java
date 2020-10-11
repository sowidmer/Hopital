package Autres;

public class Lit {

  private int no;
  private boolean medicalise;
  private boolean barriere;
  private boolean enfant;

  public Lit(int no, boolean medicalise, boolean barriere, boolean enfant) {
    this.no = no;
    this.medicalise = medicalise;
    this.barriere = barriere;
    this.enfant = enfant;
  }

  public int getNo() {
    return no;
  }

  public void setNo(int no) {
    this.no = no;
  }

  public boolean isMedicalise() {
    return medicalise;
  }

  public void setMedicalise(boolean medicalise) {
    this.medicalise = medicalise;
  }

  public boolean isBarriere() {
    return barriere;
  }

  public void setBarrierre(boolean barriere) {
    this.barriere = barriere;
  }

  public boolean isEnfant() {
    return enfant;
  }

  public void setEnfant(boolean enfant) {
    this.enfant = enfant;
  }

}
