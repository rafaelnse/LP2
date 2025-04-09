package ex6;
import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        
        int km, hora, combustivel, velMedia, consumo;
        Scanner entrada = new Scanner(System.in);
        
        System.out.printf("Digite aproximadamente as horas do percurso: ");
        hora = entrada.nextInt();
        
        System.out.printf("Digite quantos km foi percorrido: ");
        km = entrada.nextInt();
        
        System.out.printf("Digite o combustivel gasto: ");
        combustivel = entrada.nextInt();
        
        
        velMedia = km / hora;
        consumo = km / combustivel;
        
        
        
        System.out.printf("Voce percorreu %dkm em %d horas\n", km, hora);
        System.out.printf("Velocidade media: %dkm/h\n Consumo por km: %dkm/l", velMedia, consumo );
        
    }
    
}

