/**
 * Created by Antonella on 4/20/17.
 */
public class UsedCar extends Car {
    private int mileage;

    public UsedCar(String make, String model, int year, double price) {
        super(make, model, year, price);
    }

    public UsedCar(String make, String model, int year, double price, int mileage) {
        super(make, model, year, price);
        this.mileage = mileage;
    }

    @Override
    public String toString(){
        return super.toString() + "\t" + mileage;
    }
}
