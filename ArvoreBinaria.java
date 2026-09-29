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






public class ArvoreBinaria {
    
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
    
    public static void main(String[] args) {
        
        System.out.println("Insira o valo inicial da arvore:");
        arvoreBinaria = new No(SC.nextInt());
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



class Main extends ArvoreBinaria{

    public static void main(String[] args) {
        inserirValorArvore(5);
    }

}
