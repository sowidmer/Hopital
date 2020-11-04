package personnes;

import java.util.ArrayList;
import java.util.List;

import misc.PatientException;

public class ListePersonnes<T extends Personne> {
	
	private List<T> listePersonnes;
	
	public ListePersonnes() {
		this.listePersonnes = new ArrayList<T>();
	}
	
	public ListePersonnes(T[] listePersonnes) {
		
		for (T t : listePersonnes) {
			this.listePersonnes.add(t);
			System.out.println(t.getNom()+ " " +  t.getPrenom() + " a été ajouté à la liste des " + t.getClass().getSimpleName()+ "s.");
		}	
	}

	public void addPersonne(T t) {
		if (t == null) {}
		else {
			listePersonnes.add(t);
		}
	}

	public  T removePersonne(T t) throws PatientException{
		int position = -1;
		for(T ti : listePersonnes){
			position  +=1;
			if( ti.getNo() == t.getNo()){
				return listePersonnes.remove(position);        
			}
		}
		throw new PatientException("Administratif introuvable");
	}

	public int nombrePersonnesListe() {
		return listePersonnes.size();
	}

	public List<String> listerNomPersonnes(){
		List<String> nomPersonnes = new ArrayList<String>();     

		for (T t : listePersonnes){
			if(t == null) {}
			else {
				nomPersonnes.add(t.getNom());
			}
		}
		return nomPersonnes;
	}


}
