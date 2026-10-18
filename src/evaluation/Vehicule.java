package evaluation;

public abstract class Vehicule {

	protected String immatriculation;
	protected String marque ;
	protected double tarifJournalier;
	
	
	public Vehicule(String immatriculation, String marque, double tarifJournalier) {
		super();
		this.immatriculation = immatriculation;
		this.marque = marque;
		this.tarifJournalier = tarifJournalier;
	}
	
	
	public double getTarifJournalier() {
		return this.tarifJournalier;
	}
	
	public abstract double calculerCout(int nbJours);
	
	public void afficherDetails() {
		System.out.println("L'immatriculation du véhicule est"+ this.immatriculation +",de marque"+ this.marque +"avec un tarifJournalier"+ this.tarifJournalier+ ".");
	}
	
	
}
