package ex9;
import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        
        
        float num, resto;
        int conv;
        Scanner entrada = new Scanner(System.in);
        
        System.out.printf(" ");
        
        num = entrada.nextFloat();
        conv = (int) num;
         
        resto = num - conv;
        
        if (resto >= 0.5){
            System.out.printf("Seu numero eh: %d", conv+1);
        }
        
        else{
             System.out.printf("Seu numero eh: %d", conv);
        }
    }
}