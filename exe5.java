import java.lang.Math;
import java.util.Scanner;

public class exe5 {
    public static double CalcArea(float raio) {
        return (Math.PI * Math.pow(raio, 2));
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Digite o valor do raio (cm): ");
        float raio = in.nextFloat();

        System.out.println("A Circunferencia de raio " +  raio + "cm , tem diametro de " +  (raio *2) + "cm , e area de " + CalcArea(raio) + "cm");
        
        in.close();
    }
    
}
