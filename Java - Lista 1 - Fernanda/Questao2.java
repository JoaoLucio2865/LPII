import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        double a, b, c, r;
        Scanner obj = new Scanner(System.in);
        System.out.println("Insira o comprimento da formula geométrica:");
        a = obj.nextDouble();
        System.out.println("Insira a largura/base/lados da formula geométrica:");
        b = obj.nextDouble();
        System.out.println("Insira a altura/diâmetro da formula geométrica:");
        c = obj.nextDouble();
        r = (b * c)/2;
        System.out.println("Área do Triângulo: " + r);
        r = (c/2)*(c/2)*3.1415926535897932384626433832795;
        System.out.println("Área do Círculo: " + r);
        r = ((a + b)*c)/2;
        System.out.println("Área do Trapézio: " + r);
        r = b*b;
        System.out.println("Área do Quadrado: " + r);
        r = b*c;
        System.out.println("Área do Retângulo: " + r);
        obj.close();
    }
}
