
package lista_2;
import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int baby = 0;
        int young = 0;
        int adult = 0;
        int old = 0; 
        double porcentagem = 0;
        int vezes = 0;
                
            while(vezes < 5){
            System.out.println("Escreva uma idade: ");
            int idade = input.nextInt();
            vezes++;
            if(idade<=15){
                baby++;
            }
            else if(idade <=30){
                young++;
            }
            else if(idade <=45){
                adult++;
            }
            else{
                old++;
            }
            porcentagem++;
            
            
        }
            
        double porcentagemBaby = (baby / (double) porcentagem) * 100;
        double porcentagemYoung = (young / (double) porcentagem) * 100;
        double porcentagemAdult = (adult / (double) porcentagem) * 100;
        double porcentagemOld = (old / (double) porcentagem) * 100; 
        
        System.out.println("A porcentagem de pessoas em cada faiza etaria e: :");
        System.out.println("Baby: " + porcentagemBaby + "%");
        System.out.println("Young: " + porcentagemYoung + "%");
        System.out.println("Adult: " + porcentagemAdult + "%");
        System.out.println("Old: " + porcentagemOld + "%");
        
                         

            
        
        
    }
    
}
