import java.util.Scanner;
public class AulaTeste1 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        int n;
        int m;
        int result;

        System.out.println("Entre com o primeiro valor");
        n = ler.nextInt();

        System.out.println("Entre com o segundo valor");
        m = ler.nextInt();

        result = n + m;
        System.out.println("A soma é: " + result);

    }
}
