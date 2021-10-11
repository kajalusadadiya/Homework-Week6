package JavaProgrammes;

import java.util.Scanner;

public class Addition18 {
    public static void main(String[] args) {
        Addition18 obj = new Addition18();
        obj.Sum();
    }
    public void Sum(){
        Scanner in = new Scanner(System.in);

        System.out.print("Input first number:");
        int n1 = in.nextInt();

        System.out.print("Input second number:");
        int n2 = in.nextInt();

        System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));
        System.out.println(n1 + " - " + n2 + " = " + (n1 - n2));
        System.out.println(n1 + " * " + n2 + " = " + (n1 * n2));
        System.out.println(n1 + " / " + n2 + " = " + (n1 / n2));
    }
}
