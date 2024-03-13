
package lista_2;
import java.util.Scanner;

public class ex8 {
public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
        int numero;
        char continuar;
        
        do {
            System.out.println("Digite o numero para exibir a tabuada:");
            numero = input.nextInt();
            
            System.out.println("Tabuada do " + numero + ":");
            int mult = 1;
            while (mult <= 10) {
                System.out.println(numero + " x " + mult + " = " + (numero * mult));
                mult++;
            }
            
            System.out.println("Deseja continuar(C) ou encerrar (E)? ");
            continuar = input.next().charAt(0);
        } while (continuar == 'C' || continuar == 'c');
    }
    }
}
    

