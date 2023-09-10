package academy.devg.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao02Exercicio {
    public static void main(String[] args) {
        // Imprima todos os números pares de 0 até 1000000
        int count = 0;
        while(count <= 1000000) {
            count++;
            if(count % 2 == 0){ // Enquanto o resto da variável "count" for 0 o programa imrpimirá o valor pois é um valor par.
                System.out.println(count);
            }
        }
    }
}
