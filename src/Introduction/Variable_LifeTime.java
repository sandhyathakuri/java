package Introduction;

public class Variable_LifeTime {

    public static void main(String[] args){
        //This is for Loop and Loop will run 4 times
        for(int i = 0; i < 4; i ++) {

            int y = -1;
            System.out.println("Y = " + y);
            y = 100;
            System.out.println("Y is now =" + y);


        }


    }
}
