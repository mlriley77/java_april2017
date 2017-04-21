/**
 * Created by Antonella on 4/21/17.
 */
public class App {
    public static void main(String[] args) {

        // You can not create a machine object because the class is declared
        // as abstract
        // Machine machine1 = new Machine();

        Camera camera = new Camera();
        camera.setId(3455);
        camera.run();

        System.out.println();
        Car car = new Car();
        car.setId(5555);
        car.run();

    }
}
