import java.util.*;
import javax.swing.JOptionPane;

public class MediaAlunoEx3 {
 
  public static void main(String[] args) {

    /*3 - Fazer programa em java para informar as medias de uma quantidade de alunos e calcular:
  A menor média.
  A maior média.
  A media geral., 
  OBS:. Usar o JOptionPane.*/

    int nota_a1, nota_a2, nota_a3;
    int nota_b1, nota_b2, nota_b3;


    List <Integer> aluno1 = new ArrayList<Integer>();

    nota_a1 = Integer.parseInt(JOptionPane.showInputDialog("Insira a primeira nota do aluno 1:"));
    aluno1.add(nota_a1);
    nota_a2 = Integer.parseInt(JOptionPane.showInputDialog("Insira a segunda nota do aluno 1:"));
    aluno1.add(nota_a2);
    nota_a3 = Integer.parseInt(JOptionPane.showInputDialog("Insira a terceira nota do aluno 1:"));
    aluno1.add(nota_a3);
    int media_al1 = (nota_a1 + nota_a2 + nota_a3) / 3;
  
    
    List <Integer> aluno2 = new ArrayList<Integer>();

    nota_b1 = Integer.parseInt(JOptionPane.showInputDialog("Insira a primeira nota do aluno 2:"));
    aluno2.add(nota_b1);
    nota_b2 = Integer.parseInt(JOptionPane.showInputDialog("Insira a segunda nota do aluno 2:"));
    aluno2.add(nota_b2);
    nota_b3 = Integer.parseInt(JOptionPane.showInputDialog("Insira a terceira nota do aluno 2:"));
    aluno2.add(nota_b3);
    int media_al2 = (nota_b1 + nota_b2 + nota_b3) / 3;
   


    int media_geral = (media_al1 + media_al2) / 2;
    System.out.println("A média geral é: " +media_geral);

     if (media_al1 < media_al2) {
      System.out.println("A menor média é do aluno 1: " +media_al1+ ". A maior média é do aluno 2:" +media_al2);
    }
    else {
      System.out.println("A menor média é do aluno 2: " +media_al2+ ". A maior média é do aluno 1:" +media_al1);
    }
    
    
    

  }
}
