import javax.swing.text.html.HTML;

import horaires.HoraireTravail;
import horaires.HorairePause;
import personnes.Patient;
import local.Chambre;
import Autres.Medicament;
import Autres.Service;
import Soins.Operation;
import local.Salle;
import local.Restaurant;
import local.InterfaceRestaurant;
import local.RestaurantSalle;
import misc.*;

public class mainHopital {
  
  public static void main(String[] args) throws Exception {   
    
    // Medicaments, recherche un medicament a une place donnee dans un tableau_________________
    System.out.println("**Medicaments:");
    
    Medicament medic = new Medicament(1,"a","a","injection","Nausees");
    medic.afficherMedicament(3);
    medic.afficherMedicament1(12);
    medic.listerMedicaments();
    
    //Liste des services___________________________________________
    System.out.println("**Liste de services :");
    Service serv = new Service(1,"Psychologie",3,4);
    serv.AddElementListe();
   
        
   //nouveau patient________________________________________________
    Patient patient1 = new Patient(171021,"Martin","Arthur","Rue de la Madeleine 4","14.02.2004","076 323 24 24","a.martin@ifage.ch");
    
  //nouvelle chambre    
    Chambre chambre1 = new Chambre(243,"Ocean","Isolement",15,3,4,2,20,4,false);
    
    patient1.setChambre(chambre1);   
    Operation operation1 = null;
    
    //Interface SalleRestaurant_________________________________________________
    System.out.println("**Interface SalleRestaurant :");
    
    Salle salle = creerSalle(10,"Aile Ouest","Conference","09:00","20:00");
    
    Restaurant resto = creerRestaurant(2,"Losana","Brasserie");
    resto.setResponsable("Monsieur Blanc");
    
    RestaurantSalle sr = creerSalleRestaurant(resto,"10:00","23:00");
    sr.setResponsable("Monsieur Vert");
    
    InterfaceRestaurant ir = new Restaurant(14,"Veneziana","Pizzeria");
    ir.setResponsable("Monsieur Jaune");
    
    afficherInfoSalle(ir);
    afficherInfoSalle(sr);
    afficherInfoSalle(resto);
    
        
    //Exception sur date de l'opération (si la date tombe sur un weekend)__________________
    System.out.println("**Exception sur la date de l'opération :");
    
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
    
    // Nouveau patient_____________________________________________
    System.out.println("**Nouveau Patient : ");
    
    System.out.println("Le nouveau/la nouvelle patient(e) s'appelle : " + patient1.getPrenom() + " " + patient1.getNom() + " No.Patient:" + patient1.getNo());
    System.out.println("il/elle est dans la chambre No. : " + patient1.getChambre().getNo() + " " + patient1.getChambre().getNom());  
    System.out.println("il/elle va avoir comme opération : " + patient1.getOperation().getGenre());
    
    //calul le nombre d'heures travaillées_______________________________-
    HoraireTravail ht = new HoraireTravail(1,240,"01/10/2020","02/10/2020", "02/10/2020","08:00","10:15","13:00","18:25");
    System.out.println("La durée travaillée est: " + ht.nbrHeuresTravaillees());
        
    // on redonne des autres valeurs a patient1/chambre1/operation via les setters
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
    
    HoraireTravail ht1 = new HoraireTravail(1,240,"01/10/2020","02/10/2020","02/10/2020","08:00","10:15","13:00","18:25");
    System.out.println("Le nombre de minutes travaillées est: " + ht1.nbrHeuresTravaillees());
    
    
    HorairePause hp = new HorairePause(2,240,"10/10/2020","10/10/2020","10/10/2020","10:00","07:15","16:00","16:25");
    System.out.println(hp.getDebutMatin());
    hp.controleHoraire(hp.getDebutMatin(), hp.getFinMatin());
    
        
  //Methode pour l'interface SalleRestaurant__________________________________
  } 
  public static Salle creerSalle(int no, String nom, String genre, String horaireOuverture, String horaireFermeture){
    Salle sll = new Salle(no, nom, genre,horaireOuverture, horaireFermeture);
    return sll;
  }
  
  public static Restaurant creerRestaurant(int no, String nom, String genre){
    Restaurant rst = new Restaurant(no, nom, genre);
    return rst;
  }
  
  public static RestaurantSalle creerSalleRestaurant(Restaurant r, String o, String f){
    RestaurantSalle sr = new RestaurantSalle(r,o,f);
    System.out.println(sr.getNom());
    return sr;
  }
  
  public static void afficherInfoSalle(InterfaceRestaurant is){
    System.out.println(" Salle : " + is.getNoResponsable() + " - Responsable: "  + is.getResponsable());
  
  }
  

}
