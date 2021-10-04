package homework;

public class AdditionMultiplication {
    /*
     * Addition and multiplication using print method, datatype and variables
     */
    public static void main(String[] args) {
        int a, b, c, d, e, f, g, h, i; // declared all variables together
        a = 5;
        b = 8;
        c = 6;
        d = 55;
        e = 9;
        f = 20;
        g = 3;
        h = 15;
        i = 2;

        System.out.print(" Test Data: ");
        System.out.println("a." + "-" + a + "+" + b + "*" + c);
        System.out.println("            b." + "(" + d + "+" + e + ")" + "%" + e);
        System.out.println("            c." + f + "-" + g + "*" + a + "/" + b);
        System.out.println("            d." + a + "+" + h + "/" + g + "*" + i + "-" + b + "%" + g);

        System.out.println("Expected Output: " + (-a + b * c));
        System.out.println("                  " + (d + e) % e);
        System.out.println("                  " + (f + -g * a / b));
        System.out.println("                  " + (a + h / g * i - b % g));


    }

}
