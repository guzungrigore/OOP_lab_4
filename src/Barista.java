public class Barista extends Person {
    private int salary;

    public Barista(String name, int salary) {
        super(name);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }
}
