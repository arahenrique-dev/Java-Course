/*Henrique Pires Aragao - 21304445*/

public class Coureur {
	public int numDossard;
	public double tempsAu100;
	public boolean possedeTemoin;
	
	public Coureur (int nD) {
		this.numDossard = nD;
		tempsAu100 = (double)(Math.random()*(16-12)+12);
		possedeTemoin = false;
	}
	public Coureur() {
		this((int)(Math.random()*(1000)+1));
	}
	
	//Accesseurs
	public int getNumDossard() {return numDossard;}
	public double getTempsAu100() {return tempsAu100;}
	public boolean getPossedeTemoin() {return possedeTemoin;}
	//Mutateur
	public void setPossedeTemoin(boolean cPossedeTemoin){possedeTemoin = cPossedeTemoin;}
	//Méthode
	public String toString() {
		String pT = "non";
		if (possedeTemoin) {pT = "oui";}
		return String.format("Coureur %d tempsAu100 : %.2f au 100m possedeTemoin : %s", numDossard, tempsAu100, pT);
	}
	public void passeTemoin(Coureur c) {
		System.out.println(String.format("moi, coureur %d, je passe le témoin au coureur %d", numDossard, c.getNumDossard()));
		c.setPossedeTemoin(true);
		possedeTemoin = false;
	}
	public void courir() {
		System.out.println(String.format("je suis le coureur %d et je cours", numDossard));
	}
}
