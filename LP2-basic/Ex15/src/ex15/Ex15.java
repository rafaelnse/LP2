package ex15;
import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        char caracter;
        int vogal=0, digito=0, demais=0;
        
        System.out.print("Digite um caracter: ");
        caracter = entrada.next().charAt(0);
        
        while (caracter != '.'){
            if(caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u' ){
                vogal++;
            }
            else if(caracter >= '0' && caracter <= '9' ){
                digito++;
            }
            else {
                demais++;
            }
            System.out.print("Digite um caracter ou . para sair: ");
            caracter = entrada.next().charAt(0);
    }
          
        System.out.printf("Total de vogais: %d\n", vogal);
        System.out.printf("Total de digitos: %d\n", digito);
        System.out.printf("Total dos demais caracter: %d\n", demais);
        
            
    }
}