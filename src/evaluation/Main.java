package evaluation;

public class Main {

	public static void main(String[] args) {
		Client c1 = new Client(1,"Lahlou","Amal");
		Client c2 = new Client(2,"Salim","Karima");
		
		Voiture v1 = new Voiture("12345-A-26", "Dacia Logan", 250.0, 5);
		Voiture v2 = new Voiture("67890-B-26", "Golf 8", 450.0, 5);
		
		Moto m = new Moto("99999-D-26", "T-MAX", 300.0, 560);
		
		
		 Vehicule[] tabV = {v1,v2,m};
		 
		 System.out.println("LISTE DES VEHICULES");
		 for(int i=0; i<tabV.length;i++) {
			 tabV[i].afficherDetails();
		 }
		 
		 	Location l1 = new Location(3,c1, v1);
	        Location l2 = new Location(4,c2, v2);
	        Location l3 = new Location(6,c1, m);
	        
	        Location[] tabL = {l1, l2, l3};
	        
	        System.out.println("\nRECAPITULATIF DES LOCATIONS");
	        for (int i = 0; i < tabL.length; i++) {
	            tabL[i].afficherRecapitulatif();
	        }
	        
	        double montantTotalGlobal = 0;
	        for (int i = 0; i < tabL.length; i++) {
	            montantTotalGlobal += tabL[i].calculerMontant();
	        }
	        System.out.println("\nLE MONTANT TOTAL DE TOUTES LES LOCATIONS : " + montantTotalGlobal + " Dh");
		
	}
}
