package JavaProgrammes;

public class Programme4 {
    int a = 20; // Instance variable
    int b = 10; // second Instance variable
    static int c = 30;//static variable
    static int d = 20;//second static variable

    public static void main(String[] args) {
        //call both Instance and static variables
        Programme4 obj = new Programme4();
        Programme4 obj1 = new Programme4();
        System.out.println(obj.a);//20
        System.out.println(obj.b);//10

        myMethod();
    }

    public void test(){
        //Instance area
        System.out.println(a);
        System.out.println(b);
    }

    public static void myMethod(){
        System.out.println(c);
        System.out.println(d);

    }
}
