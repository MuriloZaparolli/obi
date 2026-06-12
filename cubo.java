import java.util.Scanner;

public class cubo {

    final static Scanner SC = new Scanner(System.in);

    public static void main(String[] args) {

        int n = SC.nextInt();

        int cubosDe3l = 8;

        int cubosDe2l = 4*3*(n-2);

        int cubosDe1l = (int)Math.pow(n-2, 2)*6;

        int cubosDe0l = (int)Math.pow(n-2, 3);

        System.out.println(cubosDe0l);
        System.out.println(cubosDe1l);
        System.out.println(cubosDe2l);
        System.out.println(cubosDe3l);
    }
    
}