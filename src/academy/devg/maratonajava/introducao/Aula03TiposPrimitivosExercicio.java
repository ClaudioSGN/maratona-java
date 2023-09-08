package academy.devg.maratonajava.introducao;
/*
    Prática

    Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

    Eu <nome>, morando no endereço <endereço>,
    confirmo que recebi o salário de <salario>, na data <data>
 */
public class Aula03TiposPrimitivosExercicio {

    public static void main(String[] args) {
        String nome = "Cláudio";
        String endereco = "Rua das Ostras";
        int salario = 2500;
        String data = "08/09/2023";
        System.out.println("Eu, "+nome+" morando no endereço: "+endereco+", confirmo que recebi o salário de R$"+salario+", na data "+data+".");
    }
}