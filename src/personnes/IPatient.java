package personnes;

import Soins.Operation;
import local.Chambre;
import local.Local;

public interface IPatient {
	
	public Chambre getChambre();
	public void setChambre(Chambre chambre);
	public Local getLocal();
	public void setLocal(Local local);
	public Operation getOperation();
	public void setOperation(Operation operation);

}
