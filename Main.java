import java.util.Scanner;

public class Main {
    final static Scanner SC = new Scanner(System.in);

    public static void main(String[] args) {
        int[] n = new int[SC.nextInt()];
        int[] m = new int[SC.nextInt()];

        for (int i = 0; i < n.length; i++) {
            n[i] = SC.nextInt();
        }

        for (int i = 0; i < m.length; i++) {
            m[i] = SC.nextInt();
        }

        int[] qnt = new int[10];

        for (int i = 0; i < m.length - 1; i++) {
            for (int j = m[i] - 1; j != m[i+1];) {
                qnt[n[j]]++;

                if (j > m[i+1]) {
                    j--;
                } else {
                    j++;
                }
            }
        }


        for (int i = 0; i < qnt.length; i++) {
            System.out.print(qnt[i] + " ");
        }
        
    }
}