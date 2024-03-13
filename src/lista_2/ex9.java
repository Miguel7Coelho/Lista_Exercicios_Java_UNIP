
package lista_2;
import java.util.Scanner;
import java.util.Random;

public class ex9 {
    public static void main(String[] args) {
        
    
    Scanner input = new Scanner(System.in);
    Random random = new Random();
    
    int numeroAleat = random.nextInt(101) + 1;
    int tent;
    
    System.out.println("Este eh um jogo de adivinhação, tente adivinhar um numero entre 1 e 100.");   
    
    do{
        System.out.println("Digite o numero");
        tent = input.nextInt();
        
        if(tent == numeroAleat){
            System.out.println("parabens voce acertou");
        }else if(tent < numeroAleat){
            System.out.println("o numero eh maior continue tentando");
        }else if(tent > numeroAleat){
        System.out.println("o numero eh menor continue tentando");
    }
    }while (tent != numeroAleat);
    
  }  
}
