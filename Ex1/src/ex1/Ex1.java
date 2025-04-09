package ex1;
import java.util.Scanner;
public class Ex1 {
    public static void main(String[] args) {
        
        int num1, num2;
        Scanner entrada = new Scanner(System.in);
        
        System.out.printf("Digite um número: ");
        num1 = entrada.nextInt();
        
        System.out.printf("Digite outro número: ");
        num2 = entrada.nextInt();
        
        System.out.printf("Soma: %d\n", num1+num2);
        System.out.printf("Subtracao: %d\n", num1-num2);
        System.out.printf("Multiplicacao: %d\n", num1*num2);
        System.out.printf("Divisao: %d\n", num1/num2);
        
    }
    
}
