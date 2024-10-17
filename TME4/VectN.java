import java.util.Arrays;

public class VectN {
    public  int [] tab;

    //On echange public à private donc c'est pas possible de creer des objects a lexterieur de cette classe
    private VectN(int n) {
        tab = new int[n];
    }
    public VectN(int n, int valMax) {
        this(n);
        for(int i = 0; i < n; i++) {
            tab[i] = (int)(Math.random()*(valMax + 1));
        }
    }
    public VectN() {
        this(5, 9);
    }
    public VectN(int a, int b, int c) {
        this(3);
        tab[0] = a;
        tab[1] = b;
        tab[2] = c;
    }

    public int somme() {
        int sum = 0;
        for (int x : tab) {sum += x;}
        return sum;
    }
    @Override
    public String toString() {
        String s = "[";
        for (int i= 0; i < tab.length - 1; i++) {
            s += tab[i] + ", ";
        }
        s = s + tab[tab.length-1];
        return s + "]";
    }

    //Retourner le tableau nest pas une bonne idee parce que la variable dinstance peut etre modifié
    //Donc on va retourner une copie en utilisant Arrays.copyOf(tab, tab.lenght)
    public int [] getTab() {
        return Arrays.copyOf(tab, tab.length);
    }
}
