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
    
    private static No arvoreBinaria = null;

    public static void iniciarArvore(int valor) {
        arvoreBinaria = new No(valor);
    }
    
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
    
    public static int obterComando() {
        
        System.out.println("Para inserir um novo valor, digite 1;");
        System.out.println("Para imprimir a arvore, digite 2;");
        System.out.println("Para fechar o programa, digite 3;");
        
        int comando = SC.nextInt();
        System.out.println();
        
        if (comando < 0 || comando > 3) {

            System.out.println("Comando não encontrado");
            return obterComando();

        }
        
        return comando;
        
    }
    
    public static void imprimirArvore() {
        imprimirArvore(arvoreBinaria);
    }
    
    private static void imprimirArvore(No atual) {

        if (atual.esquerda != null) {
            imprimirArvore(atual.esquerda);
        }
        
        System.out.println(atual.valor);
        
        if (atual.direita != null) {
            imprimirArvore(atual.direita);
        }

    }

}



class Main extends ArvoreBinaria{

    public static void main(String[] args) {
        
        System.out.println("Insira o valo inicial da arvore:");
        iniciarArvore(SC.nextInt());
        System.out.println();

        boolean ctrl = true;
        while (ctrl) {
            
            switch (obterComando()) {
                
                case 1:
                    System.out.println("Digite o valor a ser inserido na arvore");
                    inserirValorArvore(SC.nextInt());
                    System.out.println();
                    break;
                
                case 2:
                    imprimirArvore();
                    break;
                
                case 3:
                    ctrl = false;
                    break;
                
            }

        }

    }

}



class NoRN {

    public enum Cor {
        VERMERLHO,
        NEGRO
    }

    Cor cor;
    int valor;
    NoRN esquerda = null;
    NoRN direita = null;

}



class ArvoreRubroNegra {

    private static NoRN arvoreRN;

    public void iniciarArvore(int valor) {

    }

}
