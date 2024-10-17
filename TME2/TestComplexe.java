/*Henrique Pires Aragao - 21304445*/

public class TestComplexe {
    public static void main(String[] args) {
        Complexe c1 = new Complexe();
        Complexe c2 = new Complexe(1,1);
        Complexe c3 = new Complexe(2,2);

        System.out.println("iˆ2 = "+ c2.multiplication(c2));
        System.out.println("Complexe 1");
        System.out.println(c1);
        System.out.println("Est-il reel : " + c1.estReel());
        System.out.println("Addition : " + c1.addition(c2));
        System.out.println("Multiplication = "+ c1.multiplication(c1));
    }
}
