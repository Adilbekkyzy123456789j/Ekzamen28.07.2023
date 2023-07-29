public class Programmer extends Person{
    public Programmer() {
    }

    public Programmer(String name, String lastName, int age) {
        super(name, lastName, age);
    }

    @Override
    public void Sleep() {
        System.out.println("Программист спить");
    }

    @Override
    public void Work() {
        System.out.println("Программист рвботает");

    }
}
