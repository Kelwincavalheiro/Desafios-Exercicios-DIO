import java.util.Scanner;
public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();

        try {
            contar(parametroUm, parametroDois);
        }catch (ParametrosInvalidosException exception) {
            System.out.println(exception.getMessage());
        }
    }
    public static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
        if (parametroUm >= parametroDois){
            throw  new ParametrosInvalidosException();
        }else {
            int contagem = parametroDois - parametroUm;
            for (int ind = 1; ind <= contagem;ind++){
                System.out.println(ind);
            }
        }
    }
}