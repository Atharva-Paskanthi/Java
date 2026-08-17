package JavaBasicPrograms;

public class MethodsPractice2 {

    String CompanyName = "VOIS";
    String CompanyAddress = "EON IT Park, Kharadi, Pune";
    int Floors = 5;
    char Block = 'D';

    String CandidateName(String cn){
        System.out.println("Name of the Candidate is : " +cn);
        return cn;
    }

    void CandidateAge(int ca){
        if (ca>22){
            System.out.println("Candidate is eligible to apply");
        }
        else {
            System.out.println("Candidate is not eligible to apply");
        }
    }

    void Qualification(boolean b1){
        System.out.println("Is candidate from Engineering Background : " + b1);
    }


    public static void main(String[] args){

        MethodsPractice2 can1 = new MethodsPractice2();

        System.out.println("------------------------------------------------------------");
        System.out.println("Name of the Company : "+ can1.CompanyName);    //Accessed variables
        System.out.println("Address of Company : " + can1.CompanyAddress); //Accessed variables
        System.out.println("------------------------------------------------------------");

        can1.CandidateName("John"); //Accessed Methods
        can1.CandidateAge(17);          //Accessed Methods
        System.out.println("------------------------------------------------------------");

        MethodsPractice2 can2 = new MethodsPractice2();
        System.out.println("Totals Floors reserved for " +can2.CompanyName + " are " + can2.Floors); //Accessed variables

        System.out.println("------------------------------------------------------------");

        can2.CandidateName("Jay");  //Accessed Methods
        can2.CandidateAge(26);          //Accessed Methods
        can2.Qualification(true);   //Accessed Methods
    }
}
