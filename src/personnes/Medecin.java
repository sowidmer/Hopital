package personnes;

import misc.PatientException;

public class Medecin extends PersonnelMedical { 
	
	public Medecin(int no, String nom, String prenom) throws PatientException {
		super(no, nom, prenom);
	}
  
	public Medecin(int no, String nom, String prenom, String adresse,
      String dateNaissance, String telephone, String email, String specialite) throws PatientException {
    super(no, nom, prenom, adresse, dateNaissance, telephone, email, specialite);
    
	}

	public void operer(){
    
	}
  
  

}
