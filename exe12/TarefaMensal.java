package exe12;

public class TarefaMensal extends Tarefa {
    public TarefaMensal(int year, int month, int day, String description){
        super(year, month, day, description);
    }

    @Override
    public boolean ocorreEM(int day, int month, int year){
        if (this.day == day && this.month == month)
            return true;

        else
            return false;
    }
}
