package misc;

public class Employee {
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
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

    private int age;
    private String name;
    private int salary;

    @Override
    public String toString() {
        return "Employee{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    Employee(int age, String name, int salary){
        this.age= age;
        this.name= name;
        this.salary = salary;
    }

}
