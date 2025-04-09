package ex8;
import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        
        
        float valor, consumo, conta, desconto, conta2;
        Scanner entrada = new Scanner(System.in);
        
        System.out.printf("Digite o valor do kWh: ");
        valor = entrada.nextFloat();
        
        System.out.printf("Digite o consumo do mes: ");
        consumo = entrada.nextFloat();
        
        conta = valor * consumo;
        
        if (consumo <= 150){
            desconto = (float) (0.1) * conta;
            conta2 = conta - desconto;
            System.out.printf("valor a pagar eh de: %.2f... \nDesconto de %.2f\n ", conta2, desconto);
        }
        
        else{
            System.out.printf("valor a pagar eh de: %.2f", conta);
        }
    }
}