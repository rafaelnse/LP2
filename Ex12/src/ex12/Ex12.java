package ex12;
import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a, b, soma=0, total=0;
        float media;
        
        System.out.printf("Digite um numero para o intervalo: ");
        a = entrada.nextInt();
        System.out.printf("Digite outro numero para o intervalo: ");
        b = entrada.nextInt();
        
        System.out.println("Numeros pares dentro do intervalo: ");
        
        if(b>a){
            for (int i=a; i <= b; i++){
                if (i%2==0){
                    System.out.printf("%d, ", i);
                    soma += i;
                    total++;
                }
            }
            media = soma/total;
        
        System.out.println("");
        System.out.printf("Total da soma dos pares eh: %d\n", total);
        System.out.printf("Media dos numeros pares eh: %.2f\n", media);
        }
        else{
            for (int i=b; i <= a; i++){
                if (i%2==0){
                    System.out.printf("%d, ", i);
                }
            }            
        }
    }
}
