package exo8;

public class TestLettre {
    public static void main(String[] arg) {
        char i;
        for (i = 'a'; i <= 'z'; i++) {
            Lettre l = new Lettre(i);
            System.out.println(l.getCarac() + " : " + l.getCodeAscii());
        }
        int cpt = 1;
        for (char x = 'a'; x <= 'z'; x++) {
            Lettre chaine = new Lettre(x);
            System.out.print(chaine.getCarac() + " ");
            if (cpt == 5) {
                System.out.println("n");
                cpt = 0;                
            }
            cpt++;
        }
    }
}
