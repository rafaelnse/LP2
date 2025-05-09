package formas;
import java.util.Scanner;

public class Formas {
    public static void main(String[] args) {
        Scanner  entrada = new Scanner(System.in);
        
        Retangulo r1;
        int x, y, alt, larg;
        System.out.println("Digite os valores de x, y, altura e largura do retangulo respectivamente: ");
        x = entrada.nextInt();
        y = entrada.nextInt();
        alt = entrada.nextInt();
        larg = entrada.nextInt();
        
        r1 = new Retangulo(x, y, alt, larg);
        
        System.out.printf("x: %d \ny: %d \nAltura: %d \nLargura: %d\n", x, y, alt, larg);
    }
    
}
