package OOP.Encapsulation;

public class Encapsulation_Intro {
    public int num;
    // keep your variables private

    //Getters and setter method

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
class Sample{
    public static void main(String[] args) {
        Encapsulation_Intro en = new Encapsulation_Intro();
        int n = en.num = (20);
        System.out.println(n);
    }
}