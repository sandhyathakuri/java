package OOP.Abstraction;

public class Interface  implements printer, scanner, fax{


    @Override
    public void printing() {

    }

    @Override
    public void scanning() {

    }

    @Override
    public void faxing() {

    }

    public static void main(String[] args) {

    }
}
interface printer{
    void printing();
    static void getInfo(){
        System.out.println("Test static method");
    }
}
interface scanner{
    void scanning();
}
interface fax{
    void faxing();
}