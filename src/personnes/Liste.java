package personnes;

import java.util.ArrayList;
import java.util.List;

import misc.PatientException;

public interface Liste {
	
	
	public void addToListe(Object object);
	
	public  Object removeFromListe();
	
	public int showSizeListe();
	
	public static List<String> ListObjectName() {
		return null;
	}


	
	

}
