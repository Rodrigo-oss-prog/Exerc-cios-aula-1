import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Trinângulo com 3 lados: a; b; c.");
        System.out.println("Informe a medida do lado 'a': ");
        int a = sc.nextInt();
        System.out.println("Informe a medida do lado 'b': ");
        int b = sc.nextInt();
        System.out.println("Informe a media do lado 'c': ");
        int c = sc.nextInt();

        //chamando o método booleano no if
        if(confirmaTriangulo(a, b, c)){
            System.out.println("As medidas formam um triângulo!");
            // chamando o método tipoTRiangulo da classe ConfirmaTipo'
            ConfirmaTipo.tipoTriangulo(a, b, c);

        }else{
            System.out.println("Um triânfulo não formado a partir das medidas informadas!");
        }
        sc.close();


    }

    // este método retorna a confirmação se é ou não um triangulo
    private static boolean confirmaTriangulo(int a, int b, int c){
        return (a + b > c) && (a + c > b) && (b + c > a);

    }

}
