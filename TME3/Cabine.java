public class Cabine {
	public double volume;
	public String couleur;
	
	public Cabine(double volume, String couleur) {
		this.volume = volume; //On est oblige de mettre le this ici parce que le parametre a le meme nom que la variable;
		this.couleur = couleur;
	}
	public String toString() {
		return "Volume de la Cabine : "+ volume + "m^3 Couleur : " + couleur;
	}
	public void setCouleur(String couleur){
		this.couleur = couleur;
	}
	
	public Cabine(Cabine c) {
		volume = c.volume;
		couleur = c.couleur;
	}
}
