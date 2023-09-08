package academy.devg.maratonajava.introducao;

import java.sql.SQLOutput;

public class Aula02TiposPrimitivos {
    public static void main(String[]args) {
        // int, double, float, char, byte, short, long, boolean
        int age = (int) 10000000000L;
        long numeroGrande = (long )155.23D;
        double salarioDouble = 2000.0D;
        float salarioFloat = (float) 2500.0D;
        byte idadeByte = -128;
        short idadeShort = 32000;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 'M';
        String nome = "Goku";
        System.out.println("A idade é "+age);
        System.out.println(verdadeiro);
        System.out.println(caractere);
        System.out.println(salarioFloat);
        System.out.println(numeroGrande);
        System.out.println("Oi, eu sou o "+nome);
        //O Cast pode ser feito de números maiores para uma variável primitiva menor, porém há chances do resultado ser "quebrado.
    }
}
