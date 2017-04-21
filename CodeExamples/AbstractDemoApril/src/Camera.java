/**
 * Created by Antonella on 4/21/17.
 */
public class Camera extends Machine {

    // these methods have to be in this class because I am extending
    // from an abstract class
    @Override
    public void start(String name, int num) {
        System.out.println("Starting camera");
    }

    @Override
    public void doStuff() {
        System.out.println("Taking photo");
    }

    @Override
    public void shutDown() {
        System.out.println("Shutting down camera!");

    }
}
