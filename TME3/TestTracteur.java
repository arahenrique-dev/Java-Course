public class TestTracteur {
	public static void main(String[] arg) {
		Roue roue1 = new Roue();
		Roue roue2 = new Roue();
		Roue roue3 = new Roue(120);
		Roue roue4 = new Roue(120);
		
		System.out.println("Roue 1 : " + roue1.toString());
		System.out.println("Roue 1 : " + roue2.toString());
		System.out.println("Roue 1 : " + roue3.toString());
		System.out.println("Roue 1 : " + roue4.toString());
		
		Cabine cabine = new Cabine(3, "bleue");
		System.out.println("Cabine : " + cabine.toString());
		//Pour compiler tous au meme temp, juste compiler la classe ou il y a main, parce auil va chercher les fichiers des autres classes qui sont dans le code aussi.
		
		System.out.println("Apres creation du Tracteur 1 :");
		Tracteur t1 = new Tracteur(cabine,roue1,roue2,roue3,roue4);
		System.out.println("Tracteur 1 : " + t1.toString());
		
		Tracteur t2 = t1;
		t2.peindre("rouge");
		System.out.println("On a crée le Tracteur deux et puis on essaye de faire le changement de couleur : ");
		System.out.println("Tracteur 1 : " + t1.toString());
		System.out.println("Tracteur 2 : " + t2.toString());
		
		//t1 est affecté par t2 parce que il y a deux variables qui representent le meme objet. Donc t2 affecte lobjet de reference t1. Les types de base et lobjets se comportent d'une façon différente.
		
		//On echange la couleur en bleue encore pour demontrer encore : 
		t2.peindre("bleue");
		
		//Pour modifier juste t2 il faut faire une copie de l'objet. Comme les attributs de l'objet Tracteur sont des objets aussi, on va creer un constructeur de copie dans la classe Tracteur (voir le fichier Tracteur.java) : 
		System.out.println("On a fait la copie du objet et on a bien fait le changement de couleur cette fois, on voit que t1 n'est pas affecté : ");
		//t2 points deja un objet donc on cree une copie de t1 qui s'appelle t3 :
		Tracteur t3 = new Tracteur(t1);
		t3.peindre("rouge");
		System.out.println("\nTracteur 1 : " + t1.toString());
		System.out.println("Tracteur 3 : " + t3.toString());
		
	}
}
