package Atividades_2.FormatadorTexto;

public class FormatadorDeTexto {
    String frase1, frase2;

    public String converterParaMaiusculas(String a) {
        this.frase1 = a.toUpperCase();
        return this.frase1;
    }

    public String substituirEspacos(String b) {
        this.frase2 = b.replace(" ", "_");
        return this.frase2;
    }
}
