package FlowControlStatements;

public class IfElseLadder {

    public static void main(String[] args){

        int tShirtSize = 38;

        if(tShirtSize == 28){
            System.out.println("You will need Tshirt of XS Size");
        }
        else if(tShirtSize == 30){
            System.out.println("You will need Tshirt of S Size");
        }
        else if(tShirtSize == 32 || tShirtSize ==34){
            System.out.println("You will need Tshirt of M Size");
        }
        else if(tShirtSize == 36 || tShirtSize == 38){
            System.out.println("You will need Tshirt of L Size");
        }
        else if(tShirtSize == 40){
            System.out.println("You will need Tshirt of XL Size");
        }
        else if(tShirtSize == 42){
            System.out.println("You will need Tshirt of XXL Size");
        }
        else {
            System.out.println("Please Enter Valid Tshirt Size");
        }

    }
}
