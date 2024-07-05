public class CursoPretaTech {

  public static void main(String[] args) {
  int result2 = 0;
  result2 = somar2(10, 30);
  System.out.println("O resultado da soma 2 é: " + result2);
  
  int result = 0;
  result = somar(10, 20, 30, 40, 50);
  System.out.println("O resultado da soma é: " + result);

  //sobrecarga de método
  double a = 0;
  a = somar(1.0, 2.0, 3.5, 4.9, 5.9);
  System.out.println("O resultado da soma (double) é: " + a);

  }
  public static int somar2(int numero1, int numero2) {
      
      int resultado2 = numero1 + numero2;
      return resultado2;

    }
  public static int somar(int... numeros) {
    int resultado = 0;
    for (int num:numeros){
      resultado += num; 
    }
    return resultado; 

  }
  
  //sobrecarga de métodos: mesmo nome, assinatura diferente
  public static double somar(double... numeros) {
    double resultado = 0;
    for (double num:numeros){
      resultado += num; 
    }
    return resultado; 

  }

  





}