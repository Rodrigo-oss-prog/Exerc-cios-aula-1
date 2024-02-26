import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double v1 = 1.50;
        double v2 = 1.25;


        double km_padrao = 100;
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a kilometragem percorrida: ");
        double p = sc.nextDouble();

        double tarifa1 = v1 * p;
        double tarifa2 = v2 * p;
        if(p <= km_padrao){

            System.out.println("Seu percurso foi de: " + p);
            System.out.printf("O valor total da sua corrida foi de R$: %.2f ", tarifa1);
        }else{
            System.out.println("Seu percurso foi de: " + p);
            System.out.printf("O valor total da sua corrida foi de R$: %.2f ", tarifa2);

        }
        sc.close();
    }
}