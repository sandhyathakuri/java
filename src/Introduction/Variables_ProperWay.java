package Introduction;

public class Variables_ProperWay {
    //this is globe variable
    static int numOne;
    public static void main(String[] args){
        numOne = 20;
        System.out.println(numOne);

        //Local Variables
        int numTwo = 50;
        System.out.println(numTwo);
        getNumber();
    }

    public static void getNumber(){

        // local variables
        int numThree = 99;
        System.out.println(numThree);


        numOne = 40;
        System.out.println(numOne);

    }
}
