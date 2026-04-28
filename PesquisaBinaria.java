import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class PesquisaBinaria {

    final static Scanner SC = new Scanner(System.in);

    static int pesquisaBinaria(int[] vetor, int objetivo) {
        
        int fim = vetor.length-1;
        int ini = 0;

        while (ini <= fim) {

            int meio = ini + (fim-ini) / 2;

            if (vetor[meio] == objetivo) {
                return meio;
            }

            if (vetor[meio] < objetivo) {
                ini = meio+1;
            } else {
                fim = meio-1;
            }
            
        }

        return -1;

    }

    public static void main(String[] args) {

        Random rng = new Random();

        int[] vetor = new int[100];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = rng.nextInt(100) + 1; 
        }

        Arrays.sort(vetor);

        System.out.println(pesquisaBinaria(vetor, vetor[rng.nextInt(100)]));
            
    }

}