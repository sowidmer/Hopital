import javax.swing.text.html.HTML;

import horaires.HoraireTravail;
import personnes.Patient;
import local.Chambre;
import Autres.Medicament;
import Soins.Operation;
import misc.*;

public class mainHopital {
  
  public static void main(String[] args) throws Exception {   
    
    // Medicaments
    
    Medicament medic = new Medicament(1,"a","a","injection","Nausées");
    medic.afficherMedicament(3);
    //medic.afficherMedicament(12);
    medic.listerMedicaments();
   
        
   //nouveau patient
    Patient patient1 = new Patient(171021,"Martin","Arthur","Rue de la Madeleine 4","14.02.2004","076 323 24 24","a.martin@ifage.ch");
    
  //nouvelle chambre    
    Chambre chambre1 = new Chambre(243,"Ocean","Isolement",15,3,4,2,20,4,false);
    
    patient1.setChambre(chambre1);   
    Operation operation1 = null;
    
    
    try{
    
      operation1 = new Operation(702444,"01/10/2020","hernie discale",171021,24);
      patient1.setOperation(operation1);
      
    }
    
    catch (ControleDateException cde){
        System.out.println("Exception sur la date " + cde.getMessage());
        return;
    }    
    
    finally {
      System.out.println("Finally de Exception sur la date");
   
    }    
    
    System.out.println("Le nouveau/la nouvelle patient(e) s'appelle : " + patient1.getPrenom() + " " + patient1.getNom() + " No.Patient:" + patient1.getNo());
    System.out.println("il/elle est dans la chambre No. : " + patient1.getChambre().getNo() + " " + patient1.getChambre().getNom());  
    System.out.println("il/elle va avoir comme opération : " + patient1.getOperation().getGenre());
    
    //calul le nombre d'heures travaillées
    HoraireTravail ht = new HoraireTravail(1,240,"01/10/2020","08:00","10:15","13:00","18:25");
    System.out.println("La durée travaillée est: " + ht.nbrHeuresTravaillees());
        
    // on redonne des autres valeurs à patient1/chambre1/operation via les setters
    patient1.setNo(171020);
    patient1.setNom("Sonja Widmer");
    patient1.setAdresse("Lausanne");    
    
    chambre1.setNo(204);
    chambre1.setNom("Soleil");
    
    patient1.setChambre(chambre1);    
    
    operation1.setNo(32720);
    operation1.setGenre("Prothèse du genou");
    operation1.setDateSoin("08/10/2020");
    
    patient1.setOperation(operation1);      
    
    System.out.println("L'autre patient(e) s'appelle : " + patient1.getNom() + " No Patient: " + patient1.getNo());
    System.out.println("il/elle est dans la chambre No. : " + patient1.getChambre().getNo() + " " + patient1.getChambre().getNom());  
    System.out.println("il/elle va avoir comme opération : " + patient1.getOperation().getGenre());
        
     
     Patient patient3 = new Patient(171416,"Blanc","Albert","Rte de Chavannes 15","10.11.1975","079 122 45 78","a.blanc@ifage.ch");
     
     System.out.println("3ème patient : " + patient3.getPrenom() + " " + patient3.getNom() + " No Patient:" + patient3.getNo());
     
 
    try { 
      
     Patient patient4 = new Patient(171500,"a   ","Artos","Ch. de Renens 72","","","a@ifage.ch");
     
     System.out.println("4ème patient (avec Exception) : " + patient4.getPrenom() + " " + patient4.getNom());
     
     }
      catch (PatientException pe){
        
        System.out.println("Exception:" + pe.getMessage());
        return;     
      }
    
      finally{
        
        System.out.println("Finally de Exception");
       
      } 
    
    HoraireTravail ht1 = new HoraireTravail(1,240,"01/10/2020","08:00","10:15","13:00","18:25");
    System.out.println("Le nombre de minutes travaillées est: " + ht1.nbrHeuresTravaillees());
       
  
 
  
  
  } 

}
