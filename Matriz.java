package Array;

import java.util.Scanner;

public class Matriz {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.print("São quantos alunos? ");
        int qtDeAlunos = entrada.nextInt();
        
        System.out.print("Quantos bimestres?? ");
        int qtDeNotas = entrada.nextInt();

        double[][] notasDaTurma = new double[qtDeAlunos][qtDeNotas];

        double nota = 0;
        for(int i = 0; i < notasDaTurma.length; i++) {
            for(int j = 0; j < notasDaTurma[i].length; j++) {
                System.out.print("Informe a " + (j + 1) + " nota do " + (i + 1) + "° aluno: " );
                notasDaTurma[i][j] = entrada.nextDouble();
                nota += notasDaTurma[i][j];
            }
            System.out.println();
        }

        double media = nota / (qtDeAlunos * qtDeNotas);

        System.out.print("A média da turma é " + media);

        entrada.close();
    }
}
