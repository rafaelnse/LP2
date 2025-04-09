package ex5;
import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        
        int tempo, hora, min, seg;
        Scanner entrada = new Scanner(System.in);
        
        System.out.printf("Digite o valor de tempo: ");
        tempo = entrada.nextInt();
        
        hora = tempo / 3600;
        min = (tempo%3600) / 60;
        seg = min % 60;
        System.out.printf("%dH:%dmin:%dseg", hora, min, seg);
        
    }
    
}

