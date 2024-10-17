/*Henrique Pires Aragao - 21304445*/

public class Complexe {
    double reelle, imag;

    public Complexe(double rl, double img) {
        reelle = rl;
        imag = img;
    }
    public Complexe() {
        this((Math.random()*(2_2)-3),(Math.random()*(2_2)-3));
    }

    public String toString(){
        String chaine = reelle + " + " + imag + "i";
        return chaine;
    }
    public boolean estReel() {
        if (imag == 0) {
            return true;
        }
        else {return false;}
    }
    public Complexe addition(Complexe c2) {
        Complexe c3 = new Complexe(reelle + c2.reelle, imag + c2.imag);
        return c3;
    }
    public double multiplication(Complexe c2) {
        Complexe c3 = new Complexe((reelle * c2.reelle -  imag * c2.imag),(reelle*c2.imag + imag*c2.reelle));
        return c3.imag;
    }
}
