import java.util.Scanner;

public class exe4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Digite o numero total de crianças: ");
        int totalCriancas = in.nextInt();

        System.out.print("Digite o tamanho dos grupos a serem criados: ");
        int tamGrupos = in.nextInt();
       
        in.close();
        
        int numGrupo = totalCriancas % tamGrupos;
        int criancasSemGrupo = totalCriancas - (tamGrupos * numGrupo);

        System.out.println("Podem ser criados " + numGrupo + " Grupos, mas " + criancasSemGrupo + " Crianças ficam sem grupo.");

    }
}
