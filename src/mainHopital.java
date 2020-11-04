import horaires.HoraireTravail;
import horaires.HorairePause;
import personnes.ListePersonnes;
import personnes.Medecin;
import personnes.Patient;
import personnes.Personne;
import personnes.Technicien;
import local.Chambre;

import java.util.List;

import Autres.Medicament;
import Autres.Service;
import Autres.StockMedicaments;
import Soins.Operation;
import local.Salle;
import local.Restaurant;
import local.InterfaceRestaurant;
import local.RestaurantSalle;
import misc.*;

public class mainHopital { 
  
  
  public static int i;  
  private static int compteur = 0;
  static String newLine = System.getProperty("line.separator");
  

  public static void main(String[] args) throws Exception {      
    
    // Gestion des horaires
    System.out.println(newLine);
    System.out.println("*** Gestion des horaires");
    
    HoraireTravail j1, j2, j3, j4, j5;
    j1 = new HoraireTravail(1,"08:00","11:00");
    j2 = new HoraireTravail(2,"08:30","11:45");
    j3 = new HoraireTravail(3,"09:00","13:00");
    j4 = new HoraireTravail(4,"10:00","10:15");
    
    j5 = new HoraireTravail(5,"07:30","12:00");
    
    HoraireTravail[] hts = {j1,j2,j3,j4};

	  Medecin m11 = new Medecin(1, "Dro", "Paul");
	  Medecin m12 = new Medecin(2, "Falui", "Arbert");
	  Medecin m13 = new Medecin(3, "Gosnak", "Hubert");
	  //Medecin [] tableauMedecin = {m11, m12, m13};
	  
	  //ListePersonnes<Medecin> listeMedecins = new ListePersonnes<Medecin>(tableauMedecin);
	  ListePersonnes<Medecin> listeMedecins = new ListePersonnes<Medecin>();
	  //listeMedecins.listerNomPersonnes();
	  Medecin m14 = new Medecin(4, "Ralt", "Ambroise");
	  listeMedecins.addPersonne(m14);
	  
	  listeMedecins.listerNomPersonnes();
	  List <String> NomMedecins = listeMedecins.listerNomPersonnes();
	  System.out.println (NomMedecins);
	  
	  System.out.println ("-----------------------------------------------");
	  System.out.println ("-----------------------------------------------");
	  
	  
	  Technicien t1 = new Technicien(11, "Hald", "Furet");
	  Technicien t2 = new Technicien(12, "Burf", "Artom");
	  Technicien t3 = new Technicien(13, "Shield", "Joseph");
	  Technicien[] tableauTechnicien = {t1, t2, t3};
	  
	  ListePersonnes<Technicien> listeTechniciens = new ListePersonnes<Technicien>(tableauTechnicien);
	  
	  List <String> NomTechniciens = listeTechniciens.listerNomPersonnes();
	  System.out.println (NomTechniciens);
	  Technicien t4 = new Technicien(14, "Rudolf", "Jacques");
	  listeTechniciens.addPersonne(t4);
	  NomTechniciens = listeTechniciens.listerNomPersonnes();
	  System.out.println (NomTechniciens);
	  
	  System.out.println ("-----------------------------------------------");
	  System.out.println ("-----------------------------------------------");
	  
	  ListePersonnes<Personne> listePersonnes = new ListePersonnes<Personne>();
	  
	 
	  
	  System.out.println ("-----------------------------------------------");
	  System.out.println ("-----------------------------------------------");
	  
	  
	  

    
    GestionHoraires gh = new GestionHoraires(hts);
    
    System.out.println(newLine);  
    System.out.println("Total des heures : " + gh.calculerDureeTotale());
    
    gh.addHoraire(j5);
    System.out.println("Total des heures : " + gh.calculerDureeTotale());
    System.out.println(newLine);
    
    //nouvelles instances du main
    mainHopital chablais = new mainHopital();
    mainHopital ehnv = new mainHopital();
    mainHopital hug = new mainHopital();

    int instances = hug.getNumberOfInstances();
    System.out.println ("Number of instances =" + instances);    
    
    
    //liste de Medicaments - Stock de medicaments
    System.out.println(newLine);  
    System.out.println("***Stock de Medicaments");
        
    Medicament m1,m2,m3,m4,m5;
    
     m1 = new Medicament(1,"Alcacyl");
     m2 = new Medicament(2,"Panadol");
     m3 = new Medicament(3,"Paracetamol");
     m4 = new Medicament(4,"Dafalgan");
     m5 = new Medicament(5,"Xylophone");
     
     Medicament[] medic = {m1,m2,m3,m4};
    
     StockMedicaments stm = new StockMedicaments(medic);
     
     stm.addMedicament(m5); 
     
     System.out.print((i = stm.niveauStock()) + " = niveau du stock de medicaments 1");  
     
     System.out.println(newLine);  
     System.out.println(stm.listerNomMedicament());
     
      
     stm.removeMedicament(m4);
     
     System.out.println(newLine);      
     System.out.print((i = stm.niveauStock()) + " = niveau du stock de medicaments 2 apres removeMedicament");   
        
    
    // Medicaments, recherche un medicament a une place donnee dans un tableau_________________
    System.out.println(newLine);
    System.out.println("**Medicaments:");
    
    Medicament medic1 = new Medicament(1,"a","a","injection","Nausees");
    
    try{
    medic1.afficherMedicament(3);
    medic1.afficherMedicament1(12);
    }
    catch (TableauException e){
      //e.printStackTrace();   
      System.out.println("Exception : " + e.getMessage());
    }
    medic1.listerMedicaments();
    
    //Liste des services___________________________________________
    System.out.println(newLine);
    System.out.println("Liste de services :");
    Service serv = new Service(1,"Psychologie",3,4);
    serv.AddElementListe();
   
        
   //nouveau patient________________________________________________
    Patient patient1 = new Patient(171021,"Martin","Arthur","Rue de la Madeleine 4","14.02.2004","076 323 24 24","a.martin@ifage.ch");
    
  //nouvelle chambre    
    Chambre chambre1 = new Chambre(243,"Ocean","Isolement",15,3,4,2,20,4,false);
    
    patient1.setChambre(chambre1);   
    Operation operation1 = null;
    
    //Interface SalleRestaurant_________________________________________________
    System.out.println(newLine);
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
    
        
    //Exception sur date de l'operation (si la date tombe sur un weekend)__________________
    System.out.println(newLine);
    System.out.println("**Exception sur la date de l'operation :");
    
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
    System.out.println(newLine);
    System.out.println("**Nouveau Patient : ");
    
    System.out.println("Le nouveau/la nouvelle patient(e) s'appelle : " + patient1.getPrenom() + " " + patient1.getNom() + " No.Patient:" + patient1.getNo());
    System.out.println("il/elle est dans la chambre No. : " + patient1.getChambre().getNo() + " " + patient1.getChambre().getNom());  
    System.out.println("il/elle va avoir comme opï¿½ration : " + patient1.getOperation().getGenre());
    
    //calcul le nombre d'heures travaillees_______________________________-
    HoraireTravail ht = new HoraireTravail(1,240,"01/10/2020","02/10/2020", "02/10/2020","08:00","10:15","13:00","18:25");
    System.out.println("La duree travaillee est: " + ht.nbrHeuresTravaillees());
        
    // on redonne des autres valeurs a patient1/chambre1/operation via les setters
    patient1.setNo(171020);
    patient1.setNom("Sonja Widmer");
    patient1.setAdresse("Lausanne");    
    
    chambre1.setNo(204);
    chambre1.setNom("Soleil");
    
    patient1.setChambre(chambre1);    
    
    operation1.setNo(32720);
    operation1.setGenre("Prothese du genou");
    operation1.setDateSoin("08/10/2020");
    
    patient1.setOperation(operation1);      
    
    System.out.println("L'autre patient(e) s'appelle : " + patient1.getNom() + " No Patient: " + patient1.getNo());
    System.out.println("il/elle est dans la chambre No. : " + patient1.getChambre().getNo() + " " + patient1.getChambre().getNom());  
    System.out.println("il/elle va avoir comme operation : " + patient1.getOperation().getGenre());
        
     
     Patient patient3 = new Patient(171416,"Blanc","Albert","Rte de Chavannes 15","10.11.1975","079 122 45 78","a.blanc@ifage.ch");
     
     System.out.println("3eme patient : " + patient3.getPrenom() + " " + patient3.getNom() + " No Patient:" + patient3.getNo());
     
 
    try { 
      
     Patient patient4 = new Patient(171500,"a   ","Artos","Ch. de Renens 72","","","a@ifage.ch");
     
     System.out.println("4eme patient (avec Exception) : " + patient4.getPrenom() + " " + patient4.getNom());
     
     }
      catch (PatientException pe){
        
        System.out.println("Exception:" + pe.getMessage());
        return;     
      }
    
      finally{
        
        System.out.println("Finally de Exception");       
      } 
    
    HoraireTravail ht1 = new HoraireTravail(1,240,"01/10/2020","02/10/2020","02/10/2020","08:00","10:15","13:00","18:25");
    System.out.println("Le nombre de minutes travaillees est: " + ht1.nbrHeuresTravaillees());    
    
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
  
  static {
    //executer au debut avant tout le reste - faire des initialisations en dehors de tout
    System.out.println("Lancement de: ....");
    compteur = 35;
    System.out.println("Ceci est un compteur: " + compteur);
  }
  
   {
     //executer la creation de chaque objet - instanciation du main - appeler quand on fait new
      
    System.out.println("création de l'objet: ...."); 
    compteur += 1;    
    System.out.println(compteur);
    System.out.println(newLine);  
    
    // par Sonja
    System.out.println("c'est bientot fini");
  }

  // Par Patrice
  private int getNumberOfInstances() {
    System.out.println ("Reading number of instances");
    return 33 ;
  }  
  
}
