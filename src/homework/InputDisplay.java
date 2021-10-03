package homework;

public class InputDisplay {

    public static void main (String [] args){
        int a = 25;
        int b = 5;
        System.out.println("Input first number: "+a);
        System.out.println ("Input second number: "+b);

        System.out.println("\033[1m\033[3mExpect Output: \033[3m"+a+"x"+b+" = "+(a*b));

    }
}
