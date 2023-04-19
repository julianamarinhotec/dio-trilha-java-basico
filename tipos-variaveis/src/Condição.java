import java.util.Scanner;

public class Condição {
    public static void main (String[] args){

        Scanner sc= new Scanner(System.in);

        System.out.println("Digite o primeiro número:  ");
            int numero1 = sc.nextInt();
        System.out.println("Digite o segundo número:  ");
             int numero2 = sc.nextInt();

        int soma = numero1 + numero2;
            System.out.println(" A soma é " + soma);
                    

        Scanner nn= new Scanner(System.in);

        System.out.println("Digite um número:  "); 
            int x = nn.nextInt(); 
            
            if ( x < 10) {
                System.out.println("O número  " + x + " é menor que 10.");
            }else {
                System.out.println("O número  " + x+ " é maior que 10.");
           }
           
           sc.close ();
         
    }
    
}
