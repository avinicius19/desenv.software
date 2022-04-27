import java.util.Scanner;

public class ClassesEObjetos {
    public static void main(String[] args){
       BoasVindas teste1 = new BoasVindas();

       Scanner entrada = new Scanner(System.in);

       System.out.println("Entre com o nome do seu curso");
       String curso = entrada.nextLine();

       System.out.println("Entre com seu periodo atual");
       int periodo = entrada.nextInt();
       teste1.exibirMensagem(curso, periodo);
        
    }

}
    
 