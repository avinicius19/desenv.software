import java.util.Scanner;
public class treinando {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        int a;
        int b;
        int resultado;

        System.out.println("Digite o ano em que estamos");
        a = ler.nextInt();

        System.out.println("Digite o ano em que nasceu");
        b = ler.nextInt();

        resultado = a - b;
        System.out.println("Sua idade é" + resultado);
        
        

        
   
    }

    
}