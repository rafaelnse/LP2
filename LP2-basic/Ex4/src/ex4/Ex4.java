package ex4;
import java.util.Scanner;
public class Ex4 {
    public static void main(String[] args) {
        
        float raio;
        final float PI = 3.14159f;
        Scanner entrada = new Scanner(System.in);
        
        System.out.printf("Digite o raio do circulo: ");
        raio = entrada.nextFloat();
        
        float per = 2*(PI*raio);
        float area = PI*(raio*raio);
        
        System.out.printf("O perimetro do circulo e: %.2f\n "
                + "A area do circulo e: %.2f", per, area);
        
    }
    
}
