package beans;

public class Staff {

    private Staff() {

    }

    private Staff(Integer id, String name, Integer salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    private int id;
    private String name;
    private int salary;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return String.format("%-10s: %s\n%-10s: %s\n%-10s: %s\n", "ID", String.valueOf(this.getId()), "Name", this.getName(), "Salary", String.valueOf(this.getSalary()));
    }
}
