
package lista_2;
import java.util.Scanner;

public class ex7 {
 public static void main(String[] args) {
     try (Scanner input = new Scanner(System.in)) {
         int numero;
         int soma = 0;
         
         do {
             System.out.println("Digite um numero inteiro positivo (ou negativo para encerrar):");
             numero = input.nextInt();
             
             if (numero > 0 && numero % 2 == 0) {
                 soma += numero;
             }
         } while (numero >= 0);
         
         System.out.println("A soma dos números pares inseridos é: " + soma);
     }
    }
}
