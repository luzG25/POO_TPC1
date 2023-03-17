import java.util.Arrays;
import java.util.Scanner;

public class exe3 {
    public static void Maior(int[] numeros) {
        int[] sortedNumeros = numeros.clone();
        Arrays.sort(sortedNumeros);
        
        if (sortedNumeros[0] == sortedNumeros[2])
            System.out.println("\nnúmeros não são distintos");

        else 
            System.out.println("\nO maior número é " + sortedNumeros[2]);

    }

    private static int n = 3;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] numeros = new int[n];
        
        for (int i=0; i < n; i++){
            System.out.println("Digite um número: ");
            numeros[i] = in.nextInt();
        } 
 
        in.close();

        Maior(numeros);
    }
}
