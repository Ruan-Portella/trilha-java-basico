import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {

        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int p_1 = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int p_2 = terminal.nextInt();

        try {
            contar(p_1, p_2);

        }catch (ParametrosInvalidosException exception) {
             System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }

    }
    static void contar(int p_1, int p_2 ) throws ParametrosInvalidosException {
        if(p_1>p_2) {
            throw new ParametrosInvalidosException();
        }
        int contagem = p_2 - p_1;
        for(int i=1;i<=contagem;i++){
            System.out.println("Imprimindo o numero "+ i);
        }
    }

}

public class ParametrosInvalidosException extends Exception{
}
