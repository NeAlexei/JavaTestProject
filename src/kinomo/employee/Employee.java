package kinomo.employee;

public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private String position;
    private Double experience;
    private Double salary;

    public Employee(int id, String firstName, String lastName, String position, Double experience, Double salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.experience = experience;
        this.salary = salary;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    public void setExperience(Double experience) {
        this.experience = experience;
    }

    public Double getExperience() {
        return experience;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Double getSalary() {
        return salary;
    }

}
