/**
 * Created by Antonella on 4/21/17.
 */
public class Car extends Machine {
    @Override
    public void start(String name, int num) {
        System.out.println(name + " " + num + " " +"Starting ignition");
    }

    @Override
    public void doStuff() {
        System.out.println("Driving");
    }

    @Override
    public void shutDown() {
        System.out.println("Switch off ignition");
    }
}
