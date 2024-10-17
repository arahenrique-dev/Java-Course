

public class Triangle {
    public Point s1,s2,s3;

    public Triangle(Point s1, Point s2, Point s3) {
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
    }
    public Triangle() {
        this(new Point(),new Point(),new Point());
    }

    //Constructeur de copie
    public Triangle(Triangle t1) {
        //On ajoute un constructeur avec un parametre de type Point pour faire un nouveau objet avec les memes attributs dans Point.java
        s1 = new Point(t1.s1);
        s2 = new Point(t1.s2);
        s3 = new Point(t1.s3);
    }
    public String toString() {
        return "{" + s1.toString() + ", " + s2.toString() + ", " + s3.toString() + "}";
    }
    public double getPerimetre() {
        return + s1.distance(s2) + s1.distance(s3) + s2.distance(s3);
    }
}
