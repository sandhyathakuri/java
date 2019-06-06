package OOP.Constructor;

public class Intro_Constructor {
    int empId;
    String empName;
    //no-arg constructor
    public  Intro_Constructor(){
        System.out.println("This is no-arg constructor");
    }
    //Parametrized constructor
    public  Intro_Constructor(int id, String name){
        this.empId = id;
        this.empName = name;
    }

    public static void main(String[] args) {
        Intro_Constructor ic = new  Intro_Constructor();
        Intro_Constructor ic2 = new  Intro_Constructor(22, "testuser");
        System.out.println(ic2);
    }

    @Override
    public String toString() {
        return "Intro_Constructor{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                '}';
    }
}

