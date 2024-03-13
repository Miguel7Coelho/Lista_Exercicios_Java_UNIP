package lista_2;
import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       
        int vezes = 1;
        int soma = 0;
        
        while(vezes <= 20){
        System.out.println("digite um numero: ");
        int numeral = input.nextInt();
            if(numeral % 2 == 0){
                soma += numeral;
                
            }
        vezes++;
        }
        System.out.println("A soma dos numeros pares eh: " + soma);
       
    }
}
