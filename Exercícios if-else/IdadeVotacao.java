import java.util.Scanner;

public class IdadeVotacao {
    public static void main (String[] args) {
        int anoNasc, votoObrigatorio;
        votoObrigatorio = 2006;
        Scanner input = new Scanner(System.in);

        System.out.println("Informe seu ano de nascimento: ");
        anoNasc = input.nextInt();

        if (anoNasc <= votoObrigatorio) {
            System.out.println("Você já pode votar esse ano. ");
        }
        else {
            System.out.println("Você ainda não pode votar. ");
        }




    }

}