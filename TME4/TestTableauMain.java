//Henrique Pires Aragao
public class TestTableauMain {
    public static void main(String[] args) {
        System.out.println("Il y a " + args.length + " arguments : ");
        int numero = 0;
        for (String arg : args) {
            
            System.out.println("args["+numero+"] = " + arg);
            numero++;
        }
    }
}