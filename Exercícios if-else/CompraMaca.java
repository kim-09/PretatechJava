import java.util.Scanner;

public class CompraMaca {

    public static void main(String[] args) {
        int qntMaca; 
        double precoFinal, precoDuziaMaca = 0.25, precoMaca = 0.30; 

        Scanner input = new Scanner(System.in);
        System.out.println("Informe a quantidade de maçãs compradas: ");
        qntMaca = input.nextInt();

        if (qntMaca < 12) {
            precoFinal = qntMaca * precoMaca;
            System.out.println("O total da compra das maçãs foi: " + precoFinal);
        }
        else {
            precoFinal = qntMaca * precoDuziaMaca;
            System.out.println("O total da compra das maçãs foi: " + precoFinal);
        }
        
        input.close();
    }

}