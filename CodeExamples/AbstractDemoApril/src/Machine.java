/**
 * Created by Antonella on 4/21/17.
 */
public abstract class Machine {

    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // if I create abstract methods in any class my class must be declared as abstract
    public abstract void start(String name, int num);

    public abstract void doStuff();

    public abstract void shutDown();

    public void run(){
        start("Antonella", 5);
        doStuff();
        shutDown();
    }
}

