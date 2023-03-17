import java.util.Scanner;

public class exe2 {
    public static boolean checkArmstrong(int numero)
    {
        int sum = 0;
        String numeroString = "" + numero;

        String[] aux = numeroString.split("");
        for (int c=0; c < aux.length; c++)
            sum += Math.pow(Integer.parseInt(aux[c]), aux.length);
            
        
        if (sum == numero)
            return true;
        
        return false;
    }

    public static void main(String[] args) {
        System.out.println("VERIFICADOR DE NÚMERO ARMSTRONG\n");

        Scanner in = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = in.nextInt();
        in.close();

        boolean armstrong = checkArmstrong(numero);
        if (armstrong)
            System.out.println("O número " + numero + " é ARMSTRONG.");
        else
            System.out.println("O número " + numero + " 1634não é ARMSTRONG.");
    }
}
