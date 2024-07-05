import java.util.Scanner;

public class OrdemCrescente {

    public static void main (String[] args) {

        int valor1, valor2, valor3;

        Scanner input = new Scanner(System.in);
        System.out.println("Digite o primeiro valor: ");
        valor1 = input.nextInt();
        System.out.println("Digite o segundo valor: ");
        valor2 = input.nextInt();
        System.out.println("Digite o terceiro valor: ");
        valor3 = input.nextInt();

        if (valor1 < valor2) {
            if (valor2 < valor3) {
                System.out.println("Organizando em ordem crescente: "+valor1+ ", "+valor2+", "+valor3);
            } else if (valor3 < valor2) {
                System.out.println("Organizando em ordem crescente: "+valor1+ ", "+valor3+", "+valor2);
            } 
        } else if (valor2 < valor1) {
            if (valor1 < valor3) { 
                System.out.println("Organizando em ordem crescente: "+valor2+", "+valor1+", "+valor3);
            }
            else {
                System.out.println("Organizando em ordem crescente: "+valor2+", "+valor3+", "+valor1);
            }  
        }
        else if (valor3 < valor1) {
            if (valor1 < valor2) { 
                System.out.println("Organizando em ordem crescente: "+valor3+", "+valor1+", "+valor2);
                } else {
                    System.out.println("Organizando em ordem crescente: "+valor3+", "+valor2+", "+valor1);
                }
        }
        input.close();

        
    }
}









