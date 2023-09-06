package misc;

import java.util.*;
import java.util.concurrent.BlockingQueue;
import java.util.function.Function;
import java.util.stream.Collectors;

public class EmployeeSorting {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(23,"Tracy",20000));
        employees.add(new Employee(26,"Aubree",22000));
        employees.add(new Employee(21,"Diana",34000));
        employees.add(new Employee(23,"Olga",25000));

        employees.forEach(e-> System.out.println(e.toString()));
        //sorted By Name
        List<String> sortedByName = employees.stream().map(Employee::getName).
                sorted((o1, o2) ->o1.compareTo(o2)).
                collect(Collectors.toList());
        System.out.println(sortedByName);
        List<String> sortedByNameReverse = employees.stream().map(Employee::getName).
                sorted((o1, o2) ->o2.compareTo(o1)).
                toList();
        System.out.println(sortedByNameReverse);
        //sorted based on salary
        List<Employee> empSalary = employees.stream().sorted((o1, o2) -> (int)o1.getSalary() - o2.getSalary()).collect(Collectors.toList());
        System.out.println(empSalary);

        List<Employee> empAge = employees.stream().sorted((o1,o2)->(int)o1.getAge()-o2.getAge())
                .collect(Collectors.toList());
        System.out.println(empAge);



    }
}
