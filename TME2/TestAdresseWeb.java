/*Henrique Pires Aragao - 21304445*/

public class TestAdresseWeb {
	public static void main(String[] arg) {
		AdresseWeb web1 = new AdresseWeb("ftp", "siteincroyable.com", "/a/b/c");
		AdresseWeb web2 = new AdresseWeb("sitemagnifique.com", "/x/y/z");
		AdresseWeb web3 = new AdresseWeb("siteclasse.com");
		
		System.out.println(web1);
		System.out.println(web2);
		System.out.println(web3);
	}
}
