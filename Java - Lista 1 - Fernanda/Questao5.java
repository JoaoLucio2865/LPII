import java.util.Scanner;

public class Questao5 {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int matricula;
        double horas, valor;
        System.out.println("Insira a matrícula do funcionário:");
        matricula = obj.nextInt();
        System.out.println("Insira a quantidade de horas trabalhadas:");
        horas = obj.nextDouble();
        System.out.println("Insira o valor a pago por hora trabalhada:");
        valor = obj.nextDouble();
        Funcionario fun = new Funcionario(matricula, horas, valor);
        System.out.println("Matricula: " + fun.getMatricula() + " - Salário do Colaborador: " + String.format("%.2f", fun.calcularSalario()));
        obj.close();
    }        

    static class Funcionario {
        private int matricula;
        private double hora;
        private double valor;

        public Funcionario(int matricula, double hora, double valor) {
            this.matricula = matricula;
            this.hora = hora;
            this.valor = valor;
        }

        public double calcularSalario() {
            return hora * valor;
        }

        public int getMatricula() {
            return matricula;
        }

        public void setMatricula(int matricula) {
            this.matricula = matricula;
        }

        public double getHoras() {
            return hora;
        }

        public void setHoras(double hora) {
            this.hora = hora;
        }

        public double getValor() {
            return valor;
        }

        public void setValor(double valor) {
            this.valor = valor;
        }
    }
}