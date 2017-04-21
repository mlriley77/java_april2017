import java.util.ArrayList;

/**
 * Created by Antonella on 4/20/17.
 */
public class MainApp {


    public static void main(String[] args) {
        //Car car = new Car("Ford", "Explorer",2017,25000.99);
        //System.out.println(car.toString());

        //UsedCar car2 = new UsedCar("Ford", "Fiesta", 1999, 300.98, 300000);
        //System.out.println(car2.toString());

        ArrayList<Car> carList = new ArrayList<>();
        carList.add(new Car("Ford", "Explorer",2017,25000.99));
        carList.add(new UsedCar("Ford", "Fiesta", 1999, 300.98, 300000));
        carList.add(new Car("Ford", "Taurus",2017,25000.99));
        carList.add(new UsedCar("Ford", "Ranger", 2000, 300.98, 300500));

        carList.get(0).setModel("Escape");

        for (Car c: carList) {
            //System.out.println(c);

            if (c instanceof UsedCar) {
                System.out.println(c + " Used Car");
            } else {
                System.out.println(c + " New Car");
            }
        }

        System.out.println();
    }

}

