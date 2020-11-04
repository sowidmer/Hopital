package personnes;

import local.Chambre;
import local.Local;
import Soins.Operation;
import misc.*;

public class Patient extends Personne {

	private Chambre chambre;
	private Local local;
	private Operation operation;
	
	public Patient(int no, String nom, String prenom) throws PatientException{
		super(no, nom, prenom);
	}

	public Patient(int no, String nom, String prenom, String adresse,
      String dateNaissance, String telephone, String email) throws PatientException {
    super(no, nom, prenom, adresse, dateNaissance, telephone, email);

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
