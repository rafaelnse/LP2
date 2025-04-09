package ex3;
import java.util.Scanner;
public class Ex3 {
    public static void main(String[] args) {
        
        float salario, aumento, fim;
        Scanner entrada = new Scanner(System.in);
        
        System.out.printf("Digite o valor do salário: ");
        salario = entrada.nextFloat();
        
        System.out.printf("Digite a porcentagem de aumento: ");
        aumento = entrada.nextFloat();
        
        fim = salario + (aumento/100) * salario;
        
        System.out.printf("O salário foi de %.2f para %.2f", salario, fim);
        
    }
    
}
