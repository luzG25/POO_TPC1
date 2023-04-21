package exe11;
public class SecondHandVehicle extends Vehicle {
    private int numberOfOwners;

    public SecondHandVehicle(String regNo, String make, int yearOfManufacture, double value, int numberOfOwners) {
        super(regNo, make, yearOfManufacture, value);
        this.numberOfOwners = numberOfOwners;
    }

    public int getNumberofOwners(){
        return this.getNumberofOwners();
    }

    public boolean hasMultipleOwners(){
        if (this.numberOfOwners > 1)
            return true;

        else
            return false;
    }
}
