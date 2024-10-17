//Henrique Pires Aragão 21304445
public class Cone {
    public double r, h, pi;
    private static int nbCones;

    public Cone(double r, double h) {
        this.r = r;
        this.h = h;
        nbCones++;
    }
    public Cone(){
        this(Math.random()*10, Math.random()*10);
    }
    public double getVolume() {
        return (Math.PI*Math.pow(r, 2)*h)/3;
    }
    public String toString() {
        return String.format("Cone r=%.1fcm h=%.1fcm de volume %.1fcm3", r,h,getVolume());
    }
    public static int getNbCones() {
        return nbCones;
    }
}