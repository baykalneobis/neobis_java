package Entity;

public class Employee {
    private Integer id;
    private String name;
    private String address;
    private Double salary;
    private Integer age;
    private String position;

    public Employee() {

    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public Double getSalary() {
        return salary;
    }

    public Integer getAge() {
        return age;
    }

    public String getPosition() {
        return position;
    }

    public Employee( String name, String address, Double salary, Integer age, String position) {

        this.name = name;
        this.address = address;
        this.salary = salary;
        this.age = age;
        this.position = position;
    }
    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", Name='" + name + '\'' +
                ", Address='" + address + '\'' +
                ", Salary='" + salary + '\'' +
                ", Age=" + age + '\'' +
                ", Position='" + position + '\'' +
                '}';
    }
}

