import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idade;
        // usei ArrayList, pois ArrayList é dinâmico e como um array [] simples deve ser fixo, no
        // do while, é a melhor forma.
        ArrayList<Integer> idades = new ArrayList<Integer>();


        System.out.println("Enquanto não digitar um número negativo, o programa não encerrará!");

        do{
            System.out.println("Digite a idade: ");
            idade = sc.nextInt();
            if (idade >= 0){
                idades.add(idade);

            }

        }while (idade >= 0);
        System.out.println("Você digitou um número negativo!");
        System.out.println(idades);

        double soma = 0;
        for(int i = 0; i < idades.size(); i ++){
            soma += idades.get(i);

        }
        double media = soma / idades.size();
        System.out.printf("A média de idades é: %.1f", media);
        System.out.println();
        int count21 = 0;
        int count65 = 0;
        int i1 = 21;
        int i2 = 65;
        for(int i: idades){
            if(i > i1 ){
                ++count21;
            }
            if(i > i2){
                ++count65;
            }
        }
        if(count21 > 0){
            System.out.println("Existem " + count21 + " maiores que 21 anos");

        }else {
            System.out.println("Não existem idades maiores que 21");
        }
        if (count65 > 0){
            System.out.println("Existe " + count65 + " maiores que 65 anos");
        }

        sc.close();
    }
}