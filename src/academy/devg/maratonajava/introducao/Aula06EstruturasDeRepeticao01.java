package academy.devg.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao01 {
    public static void main(String[] args) {
        // São estruturas de repetição: while, do while e for
        int count = 0;
        while(count <= 10){ // Enquanto o valor da variável "count" não for menor ou igual a 10 o contador continuará imprimindo a contagem.
            System.out.println(count); // Também pode ser escrito como System.out.println(++count);.
            count += 1;
        }
        count = 0; // Aprivetando de uma variável já declarada para rodar com do-while.
        do{
            count += 1;
            System.out.println("dentro do do-while "+count); // Também pode ser escrito como: System.out.println("dentro do do-while"+ ++count);
        }while (count < 10);

        for(int i = 0; i<=10;i++){ // Para i começando de 0 até i ser <= 10 incrementando-o de 1 em 1, faça:
            System.out.println("For "+i);
        }
    }
}
