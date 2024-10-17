public class Point {
    public int posx, posy;

    public Point(int posx,int posy) {
        this.posx = posx;
        this.posy = posx;
    }
    public Point() {
        this((int)(Math.random()*(10)), (int)(Math.random()*(9+1)));
    }
    public String toString() {
        return "("+posx+", "+posy+")";
    }
    public double distance(Point p) {
        return Math.sqrt(Math.pow(posx - p.posx, 2) + Math.pow(posy - p.posy,2));
    }
    public void deplaceToi(int newx, int newy){
        posx=newx;
        posy = newy;
    }
    public Point(Point p) {
        posx = p.posx;
        posy = p.posy;
    }
}
