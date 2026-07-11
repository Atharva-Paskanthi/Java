package Java8.StreamAPIs;

class Employee1{

    private int age;
    private String name;

    Employee1(int age, String name){
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee1{" +
                "Age : " + age +
                ", Name : '" + name + '\'' +
                '}';
    }
}

interface ReturnEmployee1{

    Employee1 getEmployee(int age, String name);
}

public class ParameterizedConstructor {

    public static void main(String[] args) {

        ReturnEmployee1 employee1 = Employee1 :: new; //Constructor References

        Employee1 empObj = employee1.getEmployee(26,"William");
        System.out.println(empObj);


    }
}
