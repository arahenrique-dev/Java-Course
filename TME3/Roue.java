public class Roue {
	private int dia; //on utilise private pour questions de securite. Une fois que lobjet est cree et defini avec le constructeur, le user ne pourras plus le modifier. Toutefois, la valeur reste visible et on peut la obtenir avec la methode getDia definie ci-dessous.

	public Roue(int dia) {
		this.dia = dia;
		
	}
	public Roue() {
		this(60);
	}
	public String toString(){
		return "Diametre : " + dia + "cm";
	}
	
	public int getDia() {
		return dia;
	}
	
}
