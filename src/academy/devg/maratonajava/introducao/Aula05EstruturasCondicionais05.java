package academy.devg.maratonajava.introducao;

public class Aula05EstruturasCondicionais05 {
    public static void main(String[] args) {
        // Imprima o dia da semana considerando um como domingo
        byte dia = 1;
        // Valores permitidos dentro do switch: char, int, byte, short, enum e String.
        switch (dia){
            default:
                System.out.println("Opção inválida!");
                break;
            // A função do "default" é exibir a imagem de erro caso o número solicitado seja inexistente no código plotado.
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sábado");
                break;
                // Break serve para que o programa não continue rodando após encontrar o resultado correto solicitado.
        }
    }
}
