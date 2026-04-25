package Thread;

public class GetNoOfCores {

    public static void main(String[] args) {

        int noOfCores = Runtime.getRuntime().availableProcessors();
        System.out.println(noOfCores);

    }
}
