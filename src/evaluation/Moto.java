package evaluation;

public class Moto extends Vehicule {
	
	private int cylindree;
	

	public Moto(String immatriculation, String marque, double tarifJournalier, int cylindree) {
		super(immatriculation, marque, tarifJournalier);
		this.cylindree = cylindree;
	}

	@Override
	public double calculerCout(int nbJours) {
		if(nbJours<5) {
			return tarifJournalier*nbJours;
		}else {
			return tarifJournalier*nbJours*0.90;
		}
		
	}
	
	

}
