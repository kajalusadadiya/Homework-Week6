package JavaProgrammes;

public class SwapTwoVariables15 {
    public static void main(String[] args) {
        SwapTwoVariables15 obj = new SwapTwoVariables15();
        obj.swap();
    }
    public void swap(){
        int a, b, temp;
        a = 10;
        b = 20;
        System.out.println("before swapping : a, b = "+a+","+ b);//10,20
        temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping : a, b = "+a+","+ b);//20,10

    }
}
