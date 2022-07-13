package com.java.learning.completeJava.problemStatements.amazon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee {
    private int id;
    private String name;
    private int age;

    public Employee(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class EmployeeSort {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(1, "Vinay", 28));
        list.add(new Employee(4, "Arjun", 32));
        list.add(new Employee(7, "Samrat", 27));
        list.add(new Employee(2, "Don", 35));
        list.add(new Employee(3, "Vinay", 28));

        // One way is using collections
        Collections.sort(list, Comparator.comparing(Employee::getId).thenComparing(Employee::getAge));
        System.out.println(list);
        Collections.sort(list, Comparator.comparing(Employee::getId).thenComparing(Employee::getAge));
        System.out.println(list);

        // Using streams
        Comparator<Employee> byId = (x, y) -> Integer.compare(x.getId(), y.getId());
        Comparator<Employee> byName = (x, y) -> x.getName().compareTo(y.getName());
        list.stream().sorted(byId.thenComparing(byName))
                .forEach(System.out::println);

        // By implementing Comparator interface
        Collections.sort(list, new MySort());
        System.out.println(list);
        //Above code with lambda expressions
        Collections.sort(list, (x,y) -> (x.getName()).compareTo(y.getName()));
        System.out.println(list);
    }
}

class MySort implements Comparator<Employee> {
    //asending
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getId() - o2.getId();
    }
    //descending
//    @Override
//    public int compare(Employee o1, Employee o2) {
//        return o2.getId() - o1.getId();
//    }
}
