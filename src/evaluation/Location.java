package evaluation;

public class Location{
	
	private int nbJours;
	private Client client;
	private Vehicule vehicule;
	
	
	public Location(int nbJours, Client client, Vehicule vehicule) {
		this.nbJours = nbJours;
		this.client = client;
		this.vehicule = vehicule;
	}
	
	public double calculerMontant() {
		return vehicule.calculerCout(nbJours);
	}
	
	public void afficherRecapitulatif() {
		System.out.println("Récapitulatif de la Location");
        System.out.println(client.toString());
        vehicule.afficherDetails();
        System.out.println("Durée : " + nbJours + " jours");
        System.out.println("Montant Total : " + calculerMontant() + " Dh");
	}
}
