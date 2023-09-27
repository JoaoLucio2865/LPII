import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {
        double a, b, r;
        Scanner obj = new Scanner(System.in);
        a = obj.nextDouble();
        b = obj.nextDouble();
        r = a + b;
        System.out.println(r);
        obj.close();
    }
}
