package ex12;
import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int a, b;
        
        System.out.printf("Digite um numero para o intervalo: ");
        a = entrada.nextInt();
        System.out.printf("Digite outro numero para o intervalo: ");
        b = entrada.nextInt();
        
        System.out.println("Numeros pares dentro do intervalo: ");
        
        for (int i=a; i <= b; i++){
            if (i%2==0){
                System.out.printf("%d, ", i);
            }
        }
    }
}
