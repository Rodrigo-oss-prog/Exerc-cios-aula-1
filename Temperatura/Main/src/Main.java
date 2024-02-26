import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final int SEMANA = 7;
        double[] temperatura = new double[SEMANA];

        Scanner sc = new Scanner(System.in);

        double soma = 0;

        for(int i = 0;  i < SEMANA; i++){
            System.out.println("Informe a temperatura do dia --> " + (i + 1));
            temperatura[i] = sc.nextDouble();

            soma += temperatura[i];

        }
        System.out.println("Quantidade de dias da semana: " + SEMANA);
        double media = soma / SEMANA;
        System.out.printf("Média da tempratura para a semana: %.2f ", media );
        System.out.println();

        int cont = 0;
        for(double t : temperatura){
            if(t>media) {
                System.out.println("Dia com temperatura acima da média : " + t);
                cont++;
            }
        }
        System.out.println("Quantidade de dias com a temperatura acima da média: "+ cont);

     sc.close();
    }
}