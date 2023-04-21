package exe12;

public class Tarefa {
    int day, month, year;
    String descricao;
    
    public boolean ocorreEM(int year, int month, int day){
        if (this.day == day && this.month == month && this.year == year)
            return true;

        else 
            return false;
    }

    public Tarefa(int year, int month, int day, String descricao){
        this.year = year;
        this.month = month;
        this.day = day;
        this.descricao = descricao;
    }
}
