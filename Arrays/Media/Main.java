package Arrays.Media;

public class Main {
    public static void main(String[] args) {
        float [] notas = {4.0f, 8.5f, 9.5f};
        boolean [] frequen = {true, true, false, true, true};
        
        Alunos aluno = new Alunos("Wildson", "ADS", "Noite", "2024.233", notas, frequen);

        System.out.println("Aluno: " + aluno.nome);
        System.out.println("Média: " + aluno.calcMedia());
        System.out.println("Frequência: " + aluno.calcPercentFrequenc() + "%");
        System.out.println("Aprovado: " + (aluno.aprov()));

    }
}
