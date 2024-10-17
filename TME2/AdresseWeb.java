/*Henrique Pires Aragao - 21304445*/

public class AdresseWeb {
	public String protocole, domaine, chemin;
	
	public AdresseWeb(String prot, String dom, String che) {
		this.domaine = dom;
		this.chemin = che;
		protocole = prot;
	}
	public AdresseWeb(String dom, String che) {
		this("http",dom, che);
	}
	public AdresseWeb(String dom) {
		this(dom,"");
	}
	public String toString() {
		return protocole + "://" + domaine + chemin;
	}
	
}
