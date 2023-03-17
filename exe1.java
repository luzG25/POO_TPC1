import java.util.Scanner;

class exe1
{
    public static double converter(double tempF)
    {
        double tempC = (tempF - 32) / 1.8;
        return tempC;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite temperatura em Fahrenheit: ");
        double tempC = converter(in.nextDouble());

        in.close();

        System.out.println("Temperatura em Celsius: " + tempC);
    }
}