package matrizdin;

import java.util.Scanner;

public class AdicaoMatrizEmJava {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Informe o nº de linhas:");
        int numLinhas = leia.nextInt();
        
        System.out.println("Informe o nº de colunas:");
        int numColunas = leia.nextInt();
        
        int[][] matrizA = new int[numLinhas][numColunas];
        int[][] matrizB = new int[numLinhas][numColunas];
        int[][] matrizC = new int[numLinhas][numColunas];
        
        //Preenche a matriz A
        System.out.println("Informe os dados da Matriz A:");
        for (int linha = 0; linha < matrizA.length; linha++) {
            for (int coluna = 0; coluna < matrizA[linha].length; coluna++) {
                System.out.println
                ("Informe um número na posição ["+linha+"]["+coluna+"]:");
                
                matrizA [linha][coluna] = leia.nextInt();
            }
        }
        
        //Preenche a matriz B
        System.out.println("Informe os dados da Matriz B:");
        for (int linha = 0; linha < matrizB.length; linha++) {
            for (int coluna = 0; coluna < matrizB[linha].length; coluna++) {
                System.out.println
                ("Informe um número na posição ["+linha+"]["+coluna+"]:");
               
                matrizB [linha][coluna] = leia.nextInt();
            }
        }
        
        //Soma as matrizes A e B
        for (int linha = 0; linha < matrizC.length; linha++) {
            for (int coluna = 0; coluna < matrizC[linha].length; coluna++) {
                matrizC [linha][coluna] = matrizA [linha][coluna] + matrizB [linha][coluna];
            }
        }
        
        //Percorre a matriz  C
        for (int linha = 0; linha < matrizC.length; linha++) {
            for (int coluna = 0; coluna < matrizC[linha].length; coluna++) {
                System.out.print(matrizC [linha][coluna]+"\t");
            }
            System.out.println("");
        }
        
        
    }
    
}
