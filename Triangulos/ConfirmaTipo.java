public class ConfirmaTipo {
    public static void tipoTriangulo(int a, int b, int c){
        if(a == b && a == c){
            System.out.println("Os 3 lados são iguais, portando se trata de um triângulo equilátero!");

        } else if (a == b || b == c || a == c ) {
            System.out.println("Existem apenas dois lados iguais, portanto se trata de um triângulo isósceles!");

        }else{
            System.out.println("Os 3 lados do triângulo são diferentes, portanto se trata de um triângulo escaleno");

        }

    }
}
