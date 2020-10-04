import personnes.Patient;
import local.Chambre;
import Soins.Operation;
import misc.*;

public class mainHopital {

  public static void main(String[] args) throws PatientException {
        
    //nouveau patient
    Patient patient1 = new Patient();
    
    patient1.setNo(171020);
    patient1.setNom("Sonja Widmer");
    patient1.setAdresse("Lausanne");
    
    //nouvelle chambre    
    Chambre chambre1 = new Chambre();
    
    chambre1.setNo(204);
    chambre1.setNom("Soleil");
    
    patient1.setChambre(chambre1);     
    
    //Genre d'opération
    Operation operation1 = new Operation();
    operation1.setNo(32720);
    operation1.setGenre("Prothèse du genou");
    
    patient1.setOperation(operation1);    
    
    System.out.println("Le nouveau/la nouvelle patient(e) s'appelle : " + patient1.getNom());
    System.out.println("il/elle est dans la chambre No. : " + patient1.getChambre().getNo() + " " + patient1.getChambre().getNom());  
    System.out.println("il/elle va avoir comme opération : " + patient1.getOperation().getGenre());
    
   patient1.operer(patient1.getNom());
   
   try {     
     
     Patient patient2 = new Patient("Soja", "Wiedmer");
     
     System.out.println("2ème patient : " + patient2.getPrenom() + " " + patient2.getNom());
     
   }
   catch (PatientException pe){
     System.out.println("Exception:" + pe.getMessage());
     return;     
   }
   finally{
     System.out.println("Pas d'opération - finally");
   }
    
  }

}
