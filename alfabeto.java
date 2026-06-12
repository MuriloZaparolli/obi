
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class alfabeto {

    final static Scanner SC = new Scanner(System.in);

    public static void main(String[] args) {

        SC.next();
        SC.next();

        String regex = SC.next();
        String palavra = SC.next();

        Pattern pattern = Pattern.compile("(?=.*"+regex+")", Pattern.LITERAL);
        Matcher matcher = pattern.matcher(palavra);

        boolean match = matcher.find();

        if (match){
            System.out.println(1);
        } else {
            System.out.println(0);
        }

    }
}
