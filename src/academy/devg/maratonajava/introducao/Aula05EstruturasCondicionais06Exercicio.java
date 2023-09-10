package academy.devg.maratonajava.introducao;

public class Aula05EstruturasCondicionais06Exercicio {
    public static void main(String[] args) {
        // Utilizando switch e dados os valores de 1 a 7, imprima se é dia útil ou final de semana
        // Considerando 1 como domingo
        byte dia = 6;
        switch (dia) {
            case 1:
                System.out.println("Hoje é domingo, final de semana!");
                break;
            case 2:
                System.out.println("Hoje é segunda, dia útil!");
                break;
            case 3:
                System.out.println("Hoje é terça, dia útil!");
                break;
            case 4:
                System.out.println("Hoje é quarta, dia útil!");
                break;
            case 5:
                System.out.println("Hoje é quinta, dia útil!");
                break;
            case 6:
                System.out.println("Hoje é sexta, dia útil!");
                break;
            case 7:
                System.out.println("Hoje é sábado, final de semana!");
                break;
            default:
                System.out.println("Dígito inválido, apenas números de 1 a 7!");
        }
        // Caso acima feito por mim, abaixo está o caso resolvido pelo professor.

        byte day = 2;
        switch (day){
            case 1:
            case 7:
                System.out.println("Final de semana!");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia útil!");
                break;
            default:
                System.out.println("Operação inválida!");
                break;

                /*
                Caso resolvido pelo professor é um código feito de forma mais "otimizado" de certa forma pois
                tendo em vista que assim que o software checar que o número está em determinada função, ele já pode
                retornar o restultado.
                 */
        }
    }
}
