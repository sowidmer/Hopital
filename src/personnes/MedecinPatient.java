package personnes;

import Soins.Operation;
import local.Chambre;
import local.Local;
import misc.PatientException;

public class MedecinPatient extends Medecin implements IPatient {
	
	private Chambre chambre;
	private Local local;
	private Operation operation;
	
	public MedecinPatient(int no, String nom, String prenom)throws PatientException{
		super(no, nom, prenom);
	}

	public MedecinPatient(int no, String nom, String prenom, String adresse, String dateNaissance, String telephone,
			String email, String specialite) throws PatientException {
		super(no, nom, prenom, adresse, dateNaissance, telephone, email, specialite);
	}
	
	public MedecinPatient(int no, String nom, String prenom, String adresse, String dateNaissance, String telephone,
			String email, String specialite, Chambre chambre, Local local, Operation operation) throws PatientException {
		super(no, nom, prenom, adresse, dateNaissance, telephone, email, specialite);
		this.chambre = chambre;
		this.local = local;
		this.operation = operation;
	}

	public Chambre getChambre() {
		return chambre;
	}
	
	public void setChambre(Chambre chambre) {
		this.chambre = chambre;
	}
	
	public Local getLocal() {
		return local;
	}
	
	public void setLocal(Local local) {
		this.local = local;
	}
	
	public Operation getOperation() {
		return operation;
	}
	
	public void setOperation(Operation operation) {
		this.operation = operation;
	}

}
