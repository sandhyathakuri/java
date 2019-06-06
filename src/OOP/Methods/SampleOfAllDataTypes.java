package OOP.Methods;

public class SampleOfAllDataTypes {

    public static Byte getByte(){
   return Byte.MAX_VALUE;

}

public static short getShort(){
        return Short.MIN_VALUE;
}
public static double getDouble(){
        return Double.MAX_VALUE;
}
public static char getChar(){
        return Character.MIN_VALUE;
}
public static long getLong(){
        return Long.MIN_VALUE;
}
public static float getFloat(){
        return Float.MAX_VALUE;
}
public static int getInt(){
        return Integer.MAX_VALUE;
}
    public static void main(String[] args) {
        System.out.println(getByte());
        System.out.println(getShort());
System.out.println(getDouble());
System.out.println(getChar());
System.out.println(getLong());
System.out.println(getFloat());
System.out.println(getInt());

}}