//Henrique Pires Aragao
public class TrianglePascal {
    public int [][] c;

    public TrianglePascal(int n){
        c = new int[n][];
        for (int i = 0; i < n; i++){
            c[i] = new int[i+1];
        }
    }
    public void remplirTriangle() {
        for (int i = 0; i < c.length; i++){
            for (int j = 0; j <= i; j++) {
                if (i == j || j == 0) {c[i][j]= 1;}
                else {c[i][j]= c[i-1][j-1]+c[i-1][j];}
            }
        }
    }

    @Override
    public String toString() {
        String s = "";
        for (int i = 0; i < c.length; i++){
            s += "|";
            for (int j = 0; j < c[i].length; j++){
                if (j <= i) {s += " " + c[i][j] + " |";}
            }
            s += "\n";
        }
        return s;
    }
}