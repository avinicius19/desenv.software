import java.util.Scanner;

public class AulaTeste {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int n;

        n = ler.nextInt();

        System.out.println("Seja bem vindo ao java" + n );

        String nome;

        System.out.println("Entre com o nome do usuário:");

        nome = ler.next();

        System.out.println("O nome do usuário é" + nome);

        String nomeCompleto;

        System.out.println("Digite seu nome completo");

        ler = new Scanner(System.in);

        nomeCompleto = ler.nextLine();

        System.out.println("Seu nome completo é" + nomeCompleto);


    }
    
}