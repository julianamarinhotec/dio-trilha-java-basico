public class Operadores2 {
    public static void main (String[] args) {
        int numero = 5;
//valor original impresso
        System.out.println(numero);

//valor com decremento subtracao
        System.out.println(--numero);

//valor com incremento soma
        System.out.println(++numero+1);

    boolean v = true;
//valor impresso original 
        System.out.println(v);

//valor impresso da memória
        System.out.println(!v);

//Invertendo uma variavel booleana rtue/false e false/true
        boolean variavel = true;

//Inversão da variavel
        variavel = !variavel; 
        System.out.println(variavel);

//Expressões e significados 

// x += y       é igual a x = x + y
    int x = 3, y= 2;
         System.out.println(x += y);

// a -= b       é igual a a = a + b
    int a = 10, b= 4;
          System.out.println(a -= b);

// c += d       é igual a c = c + d
    int c = 5, d =3;
         System.out.println(c *= d);

    }
}
