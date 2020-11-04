package personnes;

import java.util.ArrayList;
import java.util.List;

import misc.PatientException;

public class ListePatients {
	
	private static List<Patient> listePatients = new ArrayList<Patient>();
	
	public ListePatients(List<Patient> listePatients) {
		this.listePatients = listePatients;
}

public ListePatients(Patient[] listePatients) {
	for (Patient patient : listePatients) {
		this.listePatients.add(patient);
		System.out.println(patient.getNom()+ " " + patient.getPrenom() + " a été ajouté à la liste de patients.");
	}
}

public void addPatient(Patient patient) {
	if (patient == null) {}
	else {
		listePatients.add(patient);
	}
}

public  Patient removePatient(Patient patient) throws PatientException{
	int position = -1;
	for(Patient pat : listePatients){
		position  +=1;
		if(pat.getNo() == patient.getNo()){
			return listePatients.remove(position);        
		}
	}
	throw new PatientException("Patient introuvable");
}

public int nombrePatientsListe() {
	return listePatients.size();
}

public static List<String> listerNomsPatients(){
	List<String> nomPatients = new ArrayList<String>();     

	for (Patient patient : listePatients){
		if(patient == null) {}
		else {
			nomPatients.add(patient.getNom());
		}
	}
	return nomPatients;
}

}
