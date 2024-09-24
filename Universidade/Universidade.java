import java.util.Scanner;

public class Universidade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        // Entrada de dados do aluno
        System.out.print("Digite o nome do aluno: ");
        String nome = scan.nextLine();

        System.out.print("Digite o RA do aluno: ");
        String ra = scan.nextLine();

        System.out.print("A disciplina é EAD? (1 para Sim, 2 para Não): ");
        int tipoDisciplina = scan.nextInt();

        double[] notas;

        switch (tipoDisciplina) {
            case 1:


            System.out.print("Digite a quantidade de avaliações (2 ou 3): ");
            int qtdAvaliacoesEAD = scan.nextInt();
            notas = new double[qtdAvaliacoesEAD];
            for (int i = 0; i < qtdAvaliacoesEAD; i++) {
                System.out.print("Digite a nota " + (i + 1) + ": ");
                notas[i] = scan.nextDouble();
            }

            Aluno alunoEAD = new Aluno(nome, ra, notas);
            alunoEAD.imprimirDetalhes();
            break;


            case 2:


            System.out.print("Digite a quantidade de avaliações (2, 3 ou 4): ");
            int qtdAvaliacoesPresencial = scan.nextInt();
            notas = new double[qtdAvaliacoesPresencial];
            for (int i = 0; i < qtdAvaliacoesPresencial; i++) {
                System.out.print("Digite a nota " + (i + 1) + ": ");
                notas[i] = scan.nextDouble();
            }

            System.out.print("Digite a presença do aluno (em %): ");
            double presenca = scan.nextDouble();

            Aluno alunoPresencial = new Aluno(nome, ra, notas, presenca);
            alunoPresencial.imprimirDetalhes();
            break;

            default:

                System.out.println("Opção inválida!");
                
                break;
        }

        scan.close();

        
    }

}
