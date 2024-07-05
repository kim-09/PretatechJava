import java.util.Scanner;

public class MaiorValor {

    public static void main(String[] args) {

        double valor1;
        double valor2;

        Scanner input = new Scanner(System.in);

        System.out.println("Informe o primeiro valor: ");
        valor1 = input.nextDouble();
        System.out.println("Informe o segundo valor: ");
        valor2 = input.nextDouble();

        if (valor1 > valor2) {
            System.out.println("O primeiro valor digitado é o maior. ");
        } else if (valor2 > valor1) {
            System.out.println("O segundo valor digitado é o maior. ");
        }
        else {
            System.out.println("Digite valores diferentes. ");
        }

    }


}