package exe11;

public class exe11b {
    public static void main(String[] args) {
       Vehicle starlet = new Vehicle("Starlet", "Toyota", 1990, 250000);
        
       System.out.println("O veiculo " + starlet.getMake() + " " + starlet.getRegNO() + " produzido em " + starlet.getYearofManufacture() + " vale " + starlet.getValue() + "$ tem  " + starlet.calculateAge(2023) + " anos.");
    }
    
}
