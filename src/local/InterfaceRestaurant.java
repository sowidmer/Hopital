package local;

public interface InterfaceRestaurant {
  
  String ANNEE_OUVERTURE = "2003";
  
  int getNoResponsable();
  String getResponsable();
  
  void setResponsable(String Responsable);
  
  default void setDateOuverture(String anneeOuverture){
    System.out.println("Annee d'ouverture : = " + anneeOuverture );
  }

}
