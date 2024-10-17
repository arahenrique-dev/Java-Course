public class Tracteur {
	public Cabine cabine;
	public Roue roue1;
	public Roue roue2;
	public Roue roue3;
	public Roue roue4;
	
	public Tracteur (Cabine cabine, Roue roue1, Roue roue2, Roue roue3, Roue roue4) {
		this.cabine = cabine;
		this.roue1 = roue1;
		this.roue2 = roue2;
		this.roue3 = roue3;
		this.roue4 = roue4;
	}
	//Constructeur de copie:
	public Tracteur(Tracteur t) {
		cabine = new Cabine(t.cabine);
		roue1 = new Roue(t.roue1.getDia());
		roue2 = new Roue(t.roue2.getDia());
		roue3 = new Roue(t.roue3.getDia());
		roue4 = new Roue(t.roue4.getDia());
	}
	
	public String toString () {
		return "1 " + roue1 + " 2 "+ roue2 + " 3 " + roue3 + " 4 " + roue4 + cabine; //il ny a pas besoin de mettre toString() la parce quil comprends que cest une chaine de characteres.
	}
	public void peindre(String couleur) {
		cabine.setCouleur(couleur);
	}
}
