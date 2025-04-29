package ex2;
import java.util.Scanner;
public class Ex2 {
    public static void main(String[] args) {
        
        int num1, num2;
        Scanner entrada = new Scanner(System.in);
        
        System.out.printf("Digite um número: ");
        num1 = entrada.nextInt();
        
        System.out.printf("Digite outro número: ");
        num2 = entrada.nextInt();
        
        System.out.printf("Soma: %.2f\n", (float) num1+num2);
        System.out.printf("Subtracao: %.2f\n", (float) num1-num2);
        System.out.printf("Multiplicacao: %.2f\n", (float) num1*num2);
        System.out.printf("Divisao: %.2f\n", (float) num1/num2);
        
    }
    
}
