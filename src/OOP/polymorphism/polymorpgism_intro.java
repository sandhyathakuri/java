package OOP.polymorphism;

public class polymorpgism_intro {
    public int calculateNum( int a, int b){
        System.out.println(a + b);
        return a + b;
    }
    // over load method
    public float calculateNum(float a, float b){
        System.out.println(a + b);
        return a + b;
    }
    public long calculateNum(long a , long b) {
        System.out.println(a + b);
        return a + b;
    }
    public static void main(String[] args) {
        polymorpgism_intro obj = new polymorpgism_intro();
        obj.calculateNum(12.99f,14.68f);
        obj.calculateNum(23, 68);
        obj.calculateNum(Long.MIN_VALUE , Long.MAX_VALUE);

    }
}
