package horaires;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public final class HorairePause extends Horaire {

  public HorairePause(int no, int noEmploye, String dateJour, String dateDebut, String dateFin,
      String debutMatin, String finMatin, String debutApresMidi,
      String finApresMidi) {
    super(no, noEmploye, dateJour, dateDebut, dateFin, debutMatin, finMatin, debutApresMidi,
        finApresMidi);
  }

  public HorairePause(int no, int noEmploye,  String dateDebut, String dateFin, String debutMatin, String finMatin) {
    super(no, noEmploye,  dateDebut, dateFin, debutMatin, finMatin);  
  }
  
  public void controleHoraire(String horaireDebut, String HoraireFin) throws ParseException {
     System.out.println("DDDdd");
    SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
    
    Date debut = sdf.parse(getDebutMatin());
    Date fin = sdf.parse(getFinMatin());
    
    int diff = (int) (debut.getTime() - fin.getTime());
        
    if( diff < 0){
      System.out.println("!!Erreur!! - l'heure de fin et avant l'heure de début");
    }
    
  }
}