/**
 * Created by Antonella on 4/20/17.
 */
public class Person {
    private String fullName;
    private int age;
    private String ss;
    private String address;

    // blank constructor -- if we don't declare any constructors java will do this for us
    public Person() {

    }

    // overloaded constructor 1
    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    // overloaded constructor 2
    public Person(String address) {
        this.address = address;
    }

    // overloaded constructor 3
    public Person (int age, String name) {
        this.age = age;
        fullName = name;
    }

    // this is where my getter and setters start

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSs() {
        return ss;
    }

    public void setSs(String ss) {
        this.ss = ss;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

//    @Override
//    public String toString() {
//        return "Name: " + fullName + " Age: " + age;
//    }

    public void printPerson() {
        System.out.println("Name: " + fullName + " Age: " + age);
    }
}
