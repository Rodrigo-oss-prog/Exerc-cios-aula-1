import java.util.Scanner;
/*Faça um programa em Java que calcule o montante acumulado em um
investimento. O usuário deverá fornecer como entradas: capital aplicado,
taxa de juros anual (formato decimal) e o tempo da aplicação (em anos).
Fórmula dos juros compostos: M = C * (1 + taxa) ^ tempo */

public class Main {
    public  static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Iremos calcular os seu rendimentos: ");
        System.out.println("Digite o Capital investido: ");
        double Capital = sc.nextDouble();
        System.out.println("Digite por quantos anos deseja manter o capital investido: ");
        int Tempo = sc.nextInt();
        System.out.println("Digite a taxa de juros: ");
        double Taxa = sc.nextDouble();
        double Juros  = Taxa / 100;
        System.out.println("Capital investido: R$ " + Capital + ", por um período de: " + Tempo + " anos, a juros de "
                + Juros);

        double Montante = Capital * Math.pow((1 + Juros), Tempo);
        System.out.printf("Seus rendimentos após este tempo: R$ %.2f", Montante);
        System.out.println();
        System.out.println();


        sc.close();
    }
}
