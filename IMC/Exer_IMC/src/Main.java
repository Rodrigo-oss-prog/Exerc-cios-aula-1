
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o seu peso: ");
        double peso = sc.nextDouble();
        System.out.println("Informe sua altura: ");
        double altura = sc.nextDouble();

        double IMC = peso / (altura * altura);
        System.out.printf("Seu IMC é de: %.2f", IMC);

        if (IMC < 18.5)
            System.out.println("Este IMC indica que está abaixo do peso!");
            else if (IMC <= 24.9)
                System.out.println("Este IMC indica peso normal!");
                else if(IMC <= 29.9)
                    System.out.println("Este IMC indica que está acima do peso!");
                    else if (IMC <= 34.9)
                        System.out.println("Indica Obesidade I");
                        else if (IMC <= 39.9)
                            System.out.println("Indica Obesidade II");
                            else
                                System.out.println("Obesidade III");


        sc.close();
    }

}