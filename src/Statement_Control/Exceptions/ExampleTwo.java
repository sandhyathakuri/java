package Statement_Control.Exceptions;

public class ExampleTwo {
    public static void main(String[] args) {
        try{
            int arr[] = new int[7];
            arr[44] =30/2;
            System.out.println("End of Try block");
        }
        catch (ArithmeticException e){
            e.printStackTrace();
            e.getMessage();
            System.out.println("it's an Arithmetic Exceptions");
        }catch (ArrayIndexOutOfBoundsException e ){
            System.out.println("The index range is out side of an array");
        }catch (Exception e){
            System.out.println("something went wrong");
        }
        System.out.println("out side of try catch block");
    }
}
