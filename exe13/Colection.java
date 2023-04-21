package exe13;
import java.util.ArrayList;
import java.util.Scanner;

import exe12.*;

public class Colection {
    static ArrayList<Tarefa> tarefas = new ArrayList<Tarefa>();
    static Scanner in = new Scanner(System.in);

    //criar
    public static void criar()
    {
        System.out.println("Criando Nova Tarefa");

        System.out.print("Dia: ");
        int day = in.nextInt();

        System.out.print("Mês: ");
        int month = in.nextInt();

        System.out.print("Ano: ");
        int year = in.nextInt();

        System.out.print("Descrição: ");
        String desc = in.next();
        
        Tarefa tarefa = new Tarefa(year, month, day, desc);
        tarefas.add(tarefa);

        System.out.println("Tarefa criado com Sucesso!");
    }

    //listar
    public void listar()
    {
        for (int c=0; c < tarefas.size(); c++)
            System.out.println("\t-Tarefa "+ (c+1) + ": "+ )
    }

    //modificar 

     //apagar

     //listar

     //listar(data)

     public static void main(String[] args) {
        
     }
}
