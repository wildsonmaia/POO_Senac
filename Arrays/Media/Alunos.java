package Arrays.Media;

public class Alunos {
    String nome, curso, turno, matricula;
    float notas [];
    boolean frequencia [];

    public Alunos(String nome, String curso, String turno, 
    String matricula, float notas[], boolean frequencia[]) {
        this.nome = nome;
        this.curso = curso;
        this.turno = turno;
        this.matricula = matricula;
        this.notas = notas;
        this.frequencia = frequencia;
    }

    public float calcMedia (){
        float soma = 0;
        for(float nota: notas){
            soma += nota;
        }
        return soma / notas.length;
    }

    public double calcPercentFrequenc (){
        int presencas = 0;
        for(boolean presente : frequencia){
            if(presente) presencas++;
        }
        return presencas * 100 / frequencia.length;
    }

    public boolean verificarAprovacao(){
        
        float media = calcMedia();
        double freq = calcPercentFrequenc();
        return media >= 7.0 && freq >= 75.0;
    }

    public String aprov (){
        if (verificarAprovacao()) {
            return "Aprovado";
        }else{
            return "Reprovado";
        }
    }

}
