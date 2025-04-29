package ex14;
import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int alunos=0;
        float nota, total=0, media, menor, maior=0;
        
        System.out.printf("Digite a nota: ");
            nota = entrada.nextFloat();
            menor = nota;
             
        while (nota != -1){
            total +=nota;
            alunos++;
            if (nota>=maior){
                maior = nota;
            }
            if (nota<=menor){
                menor = nota;
                }        
            
            System.out.printf("Digite a nota ou -1 para sair: ");
            nota = entrada.nextFloat();
            
        } 
        
        
        media = total/alunos;
        System.out.printf("Total de alunos: %d\n", alunos);
        System.out.printf("Media da turma: %.2f\n", media);
        System.out.printf("Menor nota da turma: %.2f\n", menor);
        System.out.printf("maior nota da turma: %.2f\n", maior);
    }
}
