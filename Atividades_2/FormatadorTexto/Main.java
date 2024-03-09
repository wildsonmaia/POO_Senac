package Atividades_2.FormatadorTexto;

public class Main {
    public static void main(String[] args) {
        FormatadorDeTexto formatador = new FormatadorDeTexto();
        String textoMaiusculo = formatador.converterParaMaiusculas("Java é legal");
        System.out.println("Texto em maiúculas: " + textoMaiusculo);
        
        String textoSubstituido = formatador.substituirEspacos("Java é legal");
        System.out.println("Texto com underscores: " + textoSubstituido);
    }
}