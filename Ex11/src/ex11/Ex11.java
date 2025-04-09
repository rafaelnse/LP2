package ex11;
import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        char op;
        float a, b, resultado;
        
        System.out.printf("Digite um operador para a funcao: ");
        op = entrada.nextLine().charAt(0);
        
        System.out.printf("Digite um numero: ");
        a = (float)entrada.nextFloat();
        
        System.out.printf("Digite outro numero: ");
        b = (float)entrada.nextFloat();
        
        switch(op){
            case '+': System.out.printf("%.1f %c %.1f = %.1f ", a, op, b, a+b); break;
            case '-': System.out.printf("%.1f %c %.1f = %.1f", a, op, b, a-b); break;
            case '*': System.out.printf("%.1f %c %.1f = %.1f", a, op, b, a*b); break;
            case '/': System.out.printf("%.1f %c %.1f = %.1f", a, op, b, a/b); break;
            default: System.out.println("Operador inválido!");
        }
        
        
        
        
        
        
    }
    
}
