package exe12;

public class TarefaDiaria extends Tarefa {
    public TarefaDiaria(int year, int month, int day, String description){
        super(year, month, day, description);
    }

    @Override
    public boolean ocorreEM(int day, int month, int year){
        if (this.day == day)
            return true;

        else
            return false;
    }

}
