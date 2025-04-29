package ex7;
import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        
        int num;
        Scanner entrada = new Scanner(System.in);
        
        System.out.printf("Digite um numero: ");
        num = entrada.nextInt();
        
        if (num%2==0){
            System.out.println("o numero eh par!");
        }
        else {
            System.out.println("o numero eh impar");
        }
    }
}