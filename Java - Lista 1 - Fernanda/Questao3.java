import java.util.Scanner;

public class Questao3 {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int matricula;
        double horas, valor, r;
        System.out.println("Insira a matrícula do funcionário:");
        matricula = obj.nextInt();
        System.out.println("Insira a quantidade de horas trabalhadas:");
        horas = obj.nextDouble();
        System.out.println("Insira o valor a pago por hora trabalhada:");
        valor = obj.nextDouble();
        r = horas * valor;
        System.out.println("Matricula: " + matricula + " - Salário do Colaborador: " + String.format("%.2f", r));
        obj.close();
    }           
}
