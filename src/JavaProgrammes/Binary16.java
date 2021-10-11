package JavaProgrammes;

import java.util.Scanner;

public class Binary16 {
    public static void main(String[] args) {
        Binary16 obj = new Binary16();
        obj.Binary();
    }
    public void Binary(){
        Scanner in = new Scanner(System.in);
        System.out.println("Input first binary number:");//1
        String a = in.next();
        System.out.println("Input second binary number:");//0
        String b = in.next();
        int n1 = Integer.parseInt(a,2);
        int n2 = Integer.parseInt(b,2);
        int n3=n1+n2;
        System.out.println("Sum of two binary number:" + Integer.toBinaryString(n3));//101

    }
}
