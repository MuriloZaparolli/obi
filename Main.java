import java.util.Scanner;

class No {

    int valor;
    No esquerda;
    No direita;

    No(int valor){

        this.valor = valor;
        this.direita = null;
        this.esquerda = null;

    }

}



class ArvoreBinaria {

    final static Scanner SC = new Scanner(System.in);

    private static No arvoreBinaria;

    public static void inserirValorArvore(int valor) {

         inserirValorArvore(valor, arvoreBinaria);

    }

    private static No inserirValorArvore(int valor, No atual) {

        if (atual == null) {
            return new No(valor);
        }

        if (valor < atual.valor) {
            atual.esquerda = inserirValorArvore(valor, atual.esquerda);
        } else if (valor > atual.valor) {
            atual.direita = inserirValorArvore(valor, atual.direita);
        }

        return atual;

    }

    public static void main(String[] args) {

        System.out.println("Insira o valo inicial da arvore:");
        arvoreBinaria = new No(SC.nextInt());

        int resposta;
        boolean ctrl = true;
        while (ctrl) {
            System.out.println("Para inserir um novo valor, digite 1;");
            System.out.println("Para fechar o programa, digite 2;");

            resposta = SC.nextInt();
            switch (resposta) {
                case 1:
                    System.out.println("Digite o valor a ser inserido na arvore");
                    inserirValorArvore(SC.nextInt());
                    break;
            
                case 2:
                    ctrl = false;
                    break;
            }
        }
        
    }
    
}