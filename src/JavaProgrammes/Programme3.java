package JavaProgrammes;

public class Programme3 {
    int a = 10;//instance variable
   static int b = 20;//static  variable

    public static void main(String[] args) {
        Programme3 obj = new Programme3();
        System.out.println(obj.a);//10
        //System.out.println(Staticvariables.b);
        myMethod();//20
    }
    public void test(){
        //Instance area
        System.out.println(a);
        Programme3 obj = new Programme3();
    }
    public static void myMethod(){
        System.out.println(b);
    }

}
