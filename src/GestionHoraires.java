import horaires.Horaire;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import misc.PatientException;
import Autres.Medicament;

public class GestionHoraires {
  
  private  List<Horaire> listeHoraires = new ArrayList<Horaire>();
  
  public GestionHoraires(Horaire[] listeHoraires) {
    for (int i = 0; i < listeHoraires.length; i++) {
      this.listeHoraires.add(listeHoraires[i]);
      System.out.println(listeHoraires[i].getNo() + " " + listeHoraires[i].getDebutMatin() + " " + listeHoraires[i].getFinMatin());
    }
  }
  
  public void addHoraire(Horaire horaire) {
    if (horaire != null) {
      listeHoraires.add(horaire);
    }
  }
  
  public Horaire removeHoraire(Horaire horaire) throws PatientException {
    int position = -1;
    for (Horaire ho : listeHoraires) {
      position += 1;
      if (ho.getNo() == ho.getNo()) {
        // return un oui non si ça c'est bien passé ou non
        return listeHoraires.remove(position);
      }
    }   
    
    throw new PatientException("Médicament introuvable");
  }
  
  public  float calculerDureeTotale() throws ParseException {
    int resu = 0;
    int diff = 0;
    List<String> heureDebutMatin = new ArrayList<String>();
    List<String> heureFinMatin = new ArrayList<String>();
    
    SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");

    for (Horaire htm : listeHoraires) {
      if (htm == null) {

      }

      else {
        //heureDebutMatin.add(htm.getDebutMatin());
        //heureFinMatin.add(htm.getFinMatin());
        
       Date debut = sdf.parse(htm.getDebutMatin());
       Date fin = sdf.parse(htm.getFinMatin());
       
       diff = (int) (debut.getTime() - fin.getTime());  
       //System.out.println("Debut : " + debut.getTime() + " Fin: " + fin.getTime() + " Diff: " + diff);
       
       
         if(diff < 0) {
           //resu = -diff;
           resu = resu  -diff;
           }
         else{
           //resu =  diff;
           resu = resu + diff;
         }          
      }
      
    }
    float nbHeures = resu / 3600000.0f;
    return  nbHeures;        
  }

}
