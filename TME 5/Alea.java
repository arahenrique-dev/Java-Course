//Henrique Pires Aragão 21304445
public class Alea {
    public static char lettre(){
        return (char)(Math.random()*(122-97+1)+97);
    }
    public static String chaine() {
        String s = "";
        for (int i=0;i<10;i++){
            s  += lettre();
        } 
        return s;
    }

    //Question 36.2
    //Elles sont des methodes de classe parce qu'elles n'ont pas besoin d'une instance et ses operations sont independantes d'une instance.

    //Pour interdire la creation des instances de cette classe de toute classe exterieure, on peut faire un constructeur vide de type privé:
    private Alea() {
    }
    public static void main(String[] args){
        System.out.println(chaine()); //Il ny a pas besoin de prefixer chaine() avec Alea
    }
}
