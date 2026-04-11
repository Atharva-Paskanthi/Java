package OOPS.Encapsulation;

class GetValues{

    public static void main(String[] args) {

        IntroToEncap obj1 = new IntroToEncap();
        obj1.setId(1);
        obj1.setAge(30);
        obj1.setName("Tony Stark");
        obj1.setAddress("New York");

        System.out.println("Getting values for obj1");
        System.out.println("Id for obj1 is "+obj1.getId());
        System.out.println("Age for obj1 is "+obj1.getAge());
        System.out.println("Name for obj1 is "+obj1.getName());
        System.out.println("Address for obj1 is "+obj1.getAddress());

        System.out.println("----------------------------------------------------");

        IntroToEncap obj2 = new IntroToEncap();
        obj2.setId(2);
        obj2.setAge(31);
        obj2.setName("Steve Rogers");
        obj2.setAddress("Manhatten");

        System.out.println("Getting values for obj2");
        System.out.println("Id for obj2 is "+obj2.getId());
        System.out.println("Age for obj2 is "+obj2.getAge());
        System.out.println("Name for obj2 is "+obj2.getName());
        System.out.println("Address for obj2 is "+obj2.getAddress());
    }
}

public class IntroToEncap {

    private int id;
    private int age;
    private String name;
    private String address;

    public IntroToEncap(){}

    public IntroToEncap(int id, int age, String name, String address) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
