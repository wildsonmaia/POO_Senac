package Arrays.Numeros;

public class Flutuantes {
    public static void main(String[] args) {
        double flutuante [] = {5.5, 7.8, 9.2, 3.5};
        double soma = flutuante[0], media;
        
        for(int i = 0; i < flutuante.length; i++){
            soma += flutuante[i];
        }

        media = soma / flutuante.length;

        System.out.printf("A média das notas é: %.2f" ,(media));
    }
}
