
package lista_2;
import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in); 
      
      int senha = 0;
      int senhaC = 1234;
        while(senha != senhaC) {
          System.out.println("digite sua senha");
          senha = input.nextInt();
            if (senha == senhaC){
                System.out.println("bem vindo");
                
            }else{
                System.out.println("digite a senha correta");
            }
          
      }
    }
    
}
