import java.util.Scanner;

public class Questao4 {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int[] matricula = new int[2];
        int maior_matricula = 0;
        double maior_salario = 0, r;
        double[] horas = new double[2];
        double[] valor = new double[2];
        int i=0;
        for(i=0;i<2;i++){
            System.out.println("Insira a matrícula do funcionário:");
            matricula[i] = obj.nextInt();
            System.out.println("Insira a quantidade de horas trabalhadas:");
            horas[i] = obj.nextDouble();
            System.out.println("Insira o valor a pago por hora trabalhada:");
            valor[i] = obj.nextDouble();
            r = horas[i] * valor[i];
            if(r > maior_salario){
                maior_matricula = matricula[i];
                maior_salario = r;
            }
        }
        System.out.println("Matricula: " + maior_matricula + " - Salário do Colaborador: " + String.format("%.2f", maior_salario));
        obj.close();
    }           
}
