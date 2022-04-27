import java.util.Scanner;

public class AulaDeSelecao {
    public static void main(String[] args){
        double nota;
        Scanner input = new Scanner(System.in);
        System.out.println("Entre com sua nota");
        nota = input.nextDouble();

        //System.out.println(nota >= 60 ? "Aprovado" : "Reprovado");

        if(nota < 40){
            System.out.println("Voce foi reprovado");
        }
        else{
            if(nota < 60){
                System.out.println("Voce esta de recuperacao!");
            }
            else{
                System.out.println("Voce foi aprovado");
            }
        }
        }
        
      


    }

    
    

