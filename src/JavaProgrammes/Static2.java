package JavaProgrammes;

public class Static2 {
    static int a = 10;//static variable
    static int b = 20;//Static variable

    public static void main(String[] args) {
        System.out.println(Static2.a);//10
        System.out.println(Static2.b);//20
        myMethod();
    }

    public static void myMethod(){
        System.out.println(a);//10
        System.out.println(b);//20
    }
}
