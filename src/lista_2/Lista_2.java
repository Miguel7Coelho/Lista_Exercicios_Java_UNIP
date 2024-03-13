package lista_2;


public class Lista_2 {


    public static void main(String[] args) {
        int n1 = 100;
        int soma = 0;
            while (n1 <= 500){
                if (n1 % 2 == 0){
                    soma += n1;
                }
                n1++;
            }
            System.out.println("a soma dos numeros pares entre 100 e 500 é: " + soma);
        
        
       
    }
    
}
