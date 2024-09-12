import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int parametroUm = scan.nextInt();
        int parametroDois = scan.nextInt();


        try {
            contar(parametroUm, parametroDois);
        }catch (ParametrosInvalidosException exception) {
            System.out.println(exception.getMsg());
        }

    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {

        if (parametroDois < parametroUm) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }
        int indice = parametroDois - parametroUm;
        for (int i = 1; i <= indice; i++) {
            System.out.println("Imprimindo o número " + i);
        }

    }
}
