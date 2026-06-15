package Java8.StreamAPIs;

import java.util.ArrayList;
import java.util.List;

public class EmployeeWithStream implements Comparable<EmployeeWithStream>{
    private int age;
    private int empId;
    private String name;
    private String address;

    //public EmployeeWithStream(){}

    public EmployeeWithStream(int age,int empId,String name,String address){
        this.age = age;
        this.empId = empId;
        this.name = name;
        this.address = address;
    }

    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }

    public int getEmpId(){
        return empId;
    }
    public void setEmpId(int empId){
        this.empId = empId;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getAddress(){
        return address;
    }
    public void setAddress(String address){
        this.address = address;
    }

    @Override
    public String toString(){
        return "Employee{"+
                "age="+ age +
                ", empID="+ empId +
                ", name='"+ name +"\'"+
                ", address='"+ address + "\'"+
                "}";
    }

    @Override
    public int compareTo(EmployeeWithStream o) {
        //return this.getEmpId() - o.getEmpId();
        //return this.getAge() - o.getAge();
        return this.getName().compareTo(o.getName());
        //return this.getAddress().compareTo(o.getAddress());

    }

    public static void main(String[] args) {

        EmployeeWithStream emp1 = new EmployeeWithStream(23,101,"Tony","New York");
        EmployeeWithStream emp2 = new EmployeeWithStream(24,102,"Chris","Queens");
        EmployeeWithStream emp3 = new EmployeeWithStream(25,103,"Steve","Manhatten");
        EmployeeWithStream emp4 = new EmployeeWithStream(24,104,"Peter","Columbia");
        EmployeeWithStream emp5 = new EmployeeWithStream(26,105,"Bruce","Texas");

        List<EmployeeWithStream> employeeList = new ArrayList<>();
        employeeList.add(emp4);
        employeeList.add(emp2);
        employeeList.add(emp3);
        employeeList.add(emp1);
        employeeList.add(emp5);

        employeeList.stream().
                sorted().
                forEach(e -> System.out.println("Employee Details : "+e));

        System.out.println("---------------------------------------------------------");

        employeeList.stream().
                sorted((EmployeeWithStream e1, EmployeeWithStream e2) -> e1.getAge()-e2.getAge()).
                forEach(e -> System.out.println("Employee Details - Using Compartor sorted() : "+e));
    }

}
