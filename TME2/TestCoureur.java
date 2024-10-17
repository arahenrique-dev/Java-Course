/*Henrique Pires Aragao - 21304445*/

public class TestCoureur {
	public static void main(String[] arg){
		Coureur c1 = new Coureur(10);
		Coureur c2 = new Coureur();
		Coureur c3 = new Coureur();
		Coureur c4 = new Coureur(98);
		
		//Tests
		System.out.println(String.format("Coureur %d tempsAu100 : %.2f au 100m possedeTemoin : %b", c1.getNumDossard(), c1.getTempsAu100(), c1.getPossedeTemoin()));
		System.out.println(c2.toString());
		c1.passeTemoin(c2);
		System.out.println(String.format("Coureur %d tempsAu100 : %.2f au 100m possedeTemoin : %b", c1.getNumDossard(), c1.getTempsAu100(), c1.getPossedeTemoin()));
		System.out.println(c2.toString());


		//test 14.6
		c1.courir();
		c2.courir();
		c3.courir();
		c4.courir();
		double tempsTotal = c1.tempsAu100 + c2.tempsAu100 + c3.tempsAu100 + c4.tempsAu100;
		System.out.println(String.format("Temps total pour les 400m : %.2f s", tempsTotal));
	}
}
