package academy.devg.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[]args){
        // + - / *
        int numero01 = 10;
        double numero02 = 20;
        double resultado = numero01 / numero02;
        System.out.println("O resultado é: "+resultado);

        // Resto: %
        int resto = 20 % 7;
        System.out.println(resto);

        // Lógicos: < > | <= >= == | !=
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezEqualQueVinte = 10 == 20;
        boolean isDezEqualQueDez = 10 == 10;
        boolean isDezDiferenteQueDez = 10 != 10;
        System.out.println(isDezMaiorQueVinte);
        System.out.println(isDezMenorQueVinte);
        System.out.println(isDezEqualQueVinte);
        System.out.println(isDezEqualQueDez);
        System.out.println(isDezDiferenteQueDez);
    }
}
