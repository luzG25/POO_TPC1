import java.util.Scanner;

public class exe6 {

    public static double sphereVolume(double r) {
        return (4/3 * (Math.PI * Math.pow(r, 3)));
    }

    public static double sphereSurface(double r) {
        return (4 * Math.PI * Math.pow(r, 2));
    }

    public static double cylinderVolume(double r, double h)
    {
        return (Math.PI * Math.pow(r, 2) * h);
    }

    public static double cylinderSurface(double r, double h) {
        return (2 * Math.PI * Math.pow(r, 2) * h);
    }

    public static double coneVolume(double r, double h) {
        return ((Math.PI * Math.pow(r, 2) * h)/3);
    }

    public static double coneSurface(double r, double h) {
        return (Math.PI * r * (r + Math.sqrt(Math.pow((r/2), 2)+ Math.pow(h, 2))));
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Digite o valor do raio: ");
        Double r = in.nextDouble();

        System.out.print("Digite o valor da altura: ");
        Double h = in.nextDouble();

        in.close();

        System.out.println("\nVolume da Esfera: " + sphereVolume(r));
        System.out.println("Área da Esfera: " + sphereSurface(r));
        System.out.println("Volume do Cilindro: " + cylinderVolume(r, h));
        System.out.println("Área do Cilindro: " + cylinderSurface(r, h));
        System.out.println("Volume do Cone: " + coneVolume(r, h));
        System.out.println("Área do Cone: " + coneSurface(r, h));
    }
}
