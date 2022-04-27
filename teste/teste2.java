import java.util.Scanner;
public class teste2 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        int a;
        int b;
        int resultado;
  
        System.out.println("Digite sua nota");
        a = ler.nextInt();
  
        System.out.println("Digite sua outra nota");
        b = ler.nextInt();
  
        resultado = (a + b) / 2;
        System.out.println("Sua media é" + resultado);


    }
 }
    

