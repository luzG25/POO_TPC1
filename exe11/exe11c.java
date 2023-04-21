package exe11;

import java.util.ArrayList;
import java.util.Scanner;

public class exe11c {
    

    public static void adic_veiculo(Scanner in, ArrayList<Vehicle> carros)
    {

        System.out.print("RegNo: ");
        String regNO = in.next();

        System.out.print("Make: ");
        String make = in.next();

        System.out.print("Year of Manucfacture: ");
        int yearofMan = in.nextInt();

        System.out.print("Value: ");
        double value = in.nextDouble();
        

        Vehicle veiculo = new Vehicle(regNO, make,yearofMan, value);

        carros.add(veiculo);

        System.out.println("\nVeiculo adicionado com Sucesso!");     
    }

    public static void listar_veiculo(ArrayList<Vehicle> carros){
        System.out.println("Veiculos: ");

        for (int c=0; c < carros.size(); c++)
            System.out.println("\t" + (c+1) + "-Veiculo " + carros.get(c).getMake() + " " + carros.get(c).getRegNO() + " \n\t\tproduzido em " + carros.get(c).getYearofManufacture() + "\n\t\tvale " + carros.get(c).getValue() + "$.");
    
    }

    public static void apagar_veiculo(Scanner in, ArrayList<Vehicle> carros){

        listar_veiculo(carros);
        
        System.out.print("Numero do veiculo que pretende remover: ");
        int opt = in.nextInt();

        carros.remove(opt-1);
    }



    public static boolean menu(Scanner in, ArrayList<Vehicle> carros, boolean sair){
        System.out.println("\t1-Adicionar veiculo\n\t2-Listar Veiculos\n\t3-Apagar um veiculo\n\t4-Terminar");

        System.out.print("\n\tSua Opção__ ");
        int op = in.nextInt();

        switch (op) {
            case 1:
                adic_veiculo(in, carros);
                break;
            
            case 2:
                listar_veiculo(carros);
                break;

            case 3:
                apagar_veiculo(in, carros);
                break;

            case 4:
                return true;
            
            default:
                break;
        }

        return false;
    
    }
    public static void main(String[] args) {
        ArrayList<Vehicle> carros = new ArrayList<Vehicle>();
        Scanner in = new Scanner(System.in);
        boolean sair = false;
        
        while (!sair)
            sair = menu(in, carros, sair);

        in.close();
    }
}
