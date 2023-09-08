package academy.devg.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        // + - / *
        int numero01 = 10;
        double numero02 = 20;
        double resultado = numero01 / numero02;
        System.out.println("O resultado é: " + resultado);

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

        // && (AND), || (or), ! (not)
        int idade = 29;
        float salario = 3500F;
        boolean isDentroDaLeiMa30 = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMe30 = idade < 30 && salario >= 3381;
        System.out.println("isDentroDaLeiMa30 " + isDentroDaLeiMa30);
        System.out.println("isDentroDaLeiMe30 " + isDentroDaLeiMe30);

        double valorTotalCCorrente = 200;
        double valorTotalCPoupanca = 10000;
        float valorPlaystation = 5000F;
        boolean isPlaystation5Affordable = valorTotalCCorrente > valorPlaystation || valorTotalCPoupanca > valorPlaystation;
        System.out.println("isPlaystation5Affordable "+isPlaystation5Affordable);

        // =, +=, -=, *=, /=, %=
        double bonus = 1800; // 1800
        bonus += 1000; // 2800
        bonus -= 1000; // 1800
        bonus *= 2;
        bonus /= 2;
        bonus %= 2;
        System.out.println(bonus);

        // ++, --
        int contador = 0;
        contador += 1; // contador = contador + 1;
        contador++;
        contador--;
        ++contador;
        --contador;
        int contador2 = 0;
        System.out.println(contador2++);
        System.out.println(contador2);
        // Quando se coloca a atribuição após o nome da variável no println, ele executa o comando após mostrar na tela.
    }
}
