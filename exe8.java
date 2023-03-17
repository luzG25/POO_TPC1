public class exe8 {
    public static String getTimeName(int hours, int minutes)
    {
        String[] hoursStrings = {"","Uma", "Duas", "Três", "Quatro", "Cinco", "Seis", "Sete", "Oito", "Nove", 
            "Dez", "Onze", "Doze", "Treze", "Catorze", "um Quarto", "Dezasseis", "Desoito", "Desanove"};
        String output;

        int aux = 60 - minutes;
        if (aux >= 1 && aux <= 29)
        {
            if (aux >= 20 && aux <= 29)
                output = "Vinte e " + hoursStrings[aux - 20] + " para ";
            else
                output =  hoursStrings[aux] + " para ";

            if (hours == 12)
                output += hoursStrings[1];
            else
                output += hoursStrings[hours + 1];
        }
            
        else if (aux == 30)
            output = hoursStrings[hours] + " e Meia";

        else if (minutes >= 1 && minutes <= 29)
        {
            if (minutes >= 20 && minutes <= 29)
                output = "Passam Vinte e " + hoursStrings[minutes - 20] + " das " + hoursStrings[hours];
            else
                output = "Passam " + hoursStrings[minutes] + " das " + hoursStrings[hours];
        }

        else 
            output = hoursStrings[hours] + " horas";

        return output;
    }

    public static void main(String[] args) {
        System.out.println(getTimeName(11, 22));
    }
}
