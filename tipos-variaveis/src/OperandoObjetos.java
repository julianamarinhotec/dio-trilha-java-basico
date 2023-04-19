public class OperandoObjetos {

    public static void main(String[] args) {
        
// Operando com objetos é preciso utilizar equals (serve para comparar conteúdo/objeto/texto)
        String nome1= "JULIANA";
        String nome2= new String("JULIANA");
             System.out.println(nome1.equals(nome2));

        String nome3= "FRANCISCO";
        String nome4= new String ("JULIANA");
            System.out.println(nome3.equals(nome4));

    }    
}
