import java.util.Scanner;

public class exe7 {
    public static double readDouble(String prompt){
        System.out.print(prompt);
        
        Scanner in = new Scanner(System.in);
        Double input = in.nextDouble();
        in.close();

        System.out.println(input);

        return input;
    }

    public static void main(String[] args) {
        Double salary = readDouble("Por favor, insira seu salário: ");
        System.out.println(salary);
    }
}
