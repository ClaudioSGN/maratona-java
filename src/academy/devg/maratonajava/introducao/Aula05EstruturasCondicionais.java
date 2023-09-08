package academy.devg.maratonajava.introducao;

public class Aula05EstruturasCondicionais {
    public static void main(String[] args) {
        int idade = 15;
        boolean isAutorizadoComprarBebida = idade >= 18;
        // !
        if(isAutorizadoComprarBebida) {
            System.out.println("Autorizado a consumir bebida alcólica.");
        }

        if(!isAutorizadoComprarBebida){
            System.out.println("Não autorizado a consumir bebida alcólica.");
        }

        System.out.println("Fora do if");
    }
}
