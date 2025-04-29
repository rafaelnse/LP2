package ex10;
import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int n, num2, num3;
        
        System.out.println("Escreva um numero: ");
        n = entrada.nextInt();
        System.out.println("Escreva um numero para o intervalo: ");
        num2 = entrada.nextInt();
        System.out.println("Escreva um segundo numero maior para o intervalo: ");
        num3 = entrada.nextInt();
        
        
        if (n > num2){
            if (n > num3){
                System.out.printf("Numero e maior que o intervalo de %d e %d", num2, num3);
            }
            else {
                System.out.printf("Numero esta entre o intervalo de %d e %d", num2, num3);
            }
        }
        else { 
            System.out.printf("Numero e menor que o intervalo de %d e %d", num2, num3);
        }
        
        
    }
    
}
