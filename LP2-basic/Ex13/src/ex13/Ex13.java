package ex13;
import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int n;
        float nota, total=0, media;
        
        System.out.printf("Digite um numero de alunos: ");
        n = entrada.nextInt();
        
        for (int i=0; i<n; i++){
            System.out.printf("Digite a nota do aluno %d: ", i+1);
            nota = entrada.nextFloat();
            total += nota;
        }
        
        media = total/n;
        System.out.printf("Total de alunos: %d\n", n);
        System.out.printf("Media da turma: %.2f", media);
    }
}