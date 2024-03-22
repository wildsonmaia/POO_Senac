package Arrays.Numeros;

public class Inteiros {
    public static void main(String[] args) {
        //int inteiros [] = new int[5];
        
        int inteiros [] = {-7, 122, 16, 2, 6};
        int maior = inteiros[0];

        for(int i = 0; i < 5; i++){
            if (inteiros[i] > maior) {
                maior = inteiros[i];
            }
        }
        System.out.println("O maior valor é: " + maior);
    }
}
