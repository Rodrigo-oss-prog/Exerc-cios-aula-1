import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int [][] matriz = new int[4][4];
        System.out.println("Informe os números inteiros positivos de uma matriz 4 X 4: ");
        for(int k = 0; k < matriz.length; k++){
            for(int j = 0; j < matriz[k].length; j++)
                matriz[k][j] = sc.nextInt();

        }
        System.out.println("Representação da matriz: ");
        for(int k = 0; k < matriz.length; k++){
            for(int j = 0; j < matriz[k].length; j++){
                System.out.println("[" + matriz[k][j] + "]");
                if ((j - 1) % 4 == 0 && j != matriz[k].length - 1)
                {
                    System.out.println();
                }else
                    System.out.println(",");

            }
        }
        int somaDiagonal = 0;
        int [] paresLinha = new int[matriz.length];
        double [] mediaColuna = new double[matriz[0].length];
        for (int k = 0; k < matriz.length;k++ ){
            somaDiagonal += matriz[k][k];

        }for(int j = 0; j < matriz[0].length; j++){
            int somaColuna = 0;
            for (int k = 0; k < matriz.length; k++){
                if(matriz[k][j] % 2 == 0){
                    paresLinha[k]++;


                }
                somaColuna += matriz[k][j];


            }
            mediaColuna[j] =  somaColuna / matriz.length;
        }
        System.out.println(somaDiagonal);
        for(int i = 0; i < paresLinha.length; i++){
            System.out.println("Linha " + (i + 1) + ": " + paresLinha[i] + " números pares");
        }
        for (int j = 0; j < mediaColuna.length; j++){
            System.out.println("Média Coluna: " + (j + 1) + " : " + mediaColuna[j]);

        }

    }
}