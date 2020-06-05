package com.tddexamples.datastructurestdd.java8;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
* Stream Use and
* */
public class Employee {
    private int employeeID;
    private String employeeName;
    private String employeeGender;
    private String employeeCountry;
    private String employeeState;
    private String employeeCity;

    public Employee() {
        // TODO Auto-generated constructor stub
    }

    public Employee(int employeeID, String employeeName, String employeeGender, String employeeCountry,
                    String employeeState, String employeeCity) {
        super();
        this.employeeID = employeeID;
        this.employeeName = employeeName;
        this.employeeGender = employeeGender;
        this.employeeCountry = employeeCountry;
        this.employeeState = employeeState;
        this.employeeCity = employeeCity;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeGender() {
        return employeeGender;
    }

    public void setEmployeeGender(String employeeGender) {
        this.employeeGender = employeeGender;
    }

    public String getEmployeeCountry() {
        return employeeCountry;
    }

    public void setEmployeeCountry(String employeeCountry) {
        this.employeeCountry = employeeCountry;
    }

    public String getEmployeeState() {
        return employeeState;
    }

    public void setEmployeeState(String employeeState) {
        this.employeeState = employeeState;
    }

    public String getEmployeeCity() {
        return employeeCity;
    }

    public void setEmployeeCity(String employeeCity) {
        this.employeeCity = employeeCity;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "[Employee ID : " + employeeID + ", Employee Name : " + employeeName + ", Employee Gender : "
                + employeeGender + ", Employee Country : " + employeeCountry + ", Employee State : " + employeeState
                + ", Employee City : " + employeeCity + "]";
    }

    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<Employee>();

        employees.add(new Employee(101, "John", "M", "United States", "California", "Los Angeles"));
        employees.add(new Employee(91, "Jacob", "M", "United States", "California", "Los Angeles"));
        employees.add(new Employee(111, "Lisa", "F", "United States", "California", "Los Angeles"));
        employees.add(new Employee(97, "Mary", "F", "United States", "California", "Sacramento"));
        employees.add(new Employee(76, "Christine", "F", "United States", "California", "Sacramento"));
        employees.add(new Employee(114, "David", "M", "United States", "California", "San Jose"));
        employees.add(new Employee(103, "Kevin", "M", "United States", "California", "Oakland"));
        employees.add(new Employee(109, "Joe", "M", "United States", "California", "Oakland"));
        employees.add(new Employee(119, "Mathew", "M", "United States", "California", "San Jose"));
        employees.add(new Employee(99, "Angelina", "F", "United States", "California", "San Diego"));
        employees.add(new Employee(98, "Tom", "M", "United States", "California", "San Diego"));
        employees.add(new Employee(116, "Curl", "M", "United States", "California", "Los Angeles"));
        employees.add(new Employee(66, "Christopher", "M", "United States", "California", "Oakland"));
        employees.add(new Employee(56, "Chelse", "F", "United States", "California", "Oakland"));
        employees.add(new Employee(88, "Murali", "M", "United States", "California", "San Jose"));
        employees.add(new Employee(87, "Daisy", "F", "United States", "California", "Sacramento"));
        employees.add(new Employee(85, "Niza", "F", "United States", "Virginia", "Richmond"));
        employees.add(new Employee(86, "Chris", "M", "United States", "Virginia", "Fairfax"));
        employees.add(new Employee(90, "Andrew", "M", "United States", "Virginia", "Reston"));

        /*
        * 1. Get list of all the employees from state "California"; Return a List
        2. Count the number of Females; Return a Count
        3. Add 10 to the ID of each Employee; Return the updated List
        4. Sort in the Descending order by employee name (z-a); Return the List
        5. Get the details of the second highest employee ID; Return the employee
        * */

        List<Employee> employeesOfCali = employees.stream()
                .filter(employee -> employee.employeeState == "California")
                .collect(Collectors.toList());
        employeesOfCali.forEach(System.out::println);

        long count = employees.stream()
                .filter(employee -> employee.employeeGender.equals("F"))
                .count();
        System.out.println("Female Count: " + count);

        employees.stream()
                .forEach(employee ->
                        employee.setEmployeeID(employee.getEmployeeID() + 10)
                );
        System.out.println("ID with 10");
        employees.forEach(System.out::println);

        System.out.println("Sorting the list based on Name");

        List<Employee> sortedList =
                employees.stream()
                        .sorted(Comparator.comparing(Employee::getEmployeeName))
                        .collect(Collectors.toList());
        sortedList.forEach(System.out::println);


        System.out.println("Sorting the list based on Name: Reversed");
        List<Employee> reverseSortedList =
                employees.stream()
                        .sorted(Comparator.comparing(Employee::getEmployeeName).reversed())
                        .collect(Collectors.toList());
        reverseSortedList.forEach(System.out::println);

        System.out.println("Test sorted");
        List<String> list = Arrays.asList("9", "A", "Z", "1", "B", "Y", "4", "a", "c");

        List<String> sortedList3 = list.stream()
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toList());
        System.out.println(sortedList3);
        List<String> sortedList4 = list.stream()
                .sorted((o1, o2) -> o1.compareTo(o2))
                .collect(Collectors.toList());
        System.out.println(sortedList4);

        System.out.println("Get The Details of Second Highest ID");

        List<Employee> secondHighest = employees.stream()
                .sorted(Comparator.comparingInt(Employee::getEmployeeID).reversed())
                .collect(Collectors.toList());

        System.out.println("" + secondHighest.get(1));
        Optional<Employee> employee = employees.stream()
                .sorted(Comparator.comparingInt(Employee::getEmployeeID).reversed()).limit(2).skip(1).findFirst();
        System.out.println("Employee: "+employee.get());

    }
}