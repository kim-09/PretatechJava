import java.util.Scanner;

public class Senha {
    public static void main(String[] args) {
        int verificacao, senha = 1234;

        Scanner input = new Scanner(System.in);

        System.out.println("Digite a senha: ");
        verificacao = input.nextInt();

        if (verificacao == senha) {
            System.out.println("ACESSO PERMITIDO.");
        } 
        else {
            System.out.println("ACESSO NEGADO");
        }


    }
    
}
