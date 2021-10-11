package JavaProgrammes;

import java.util.Scanner;

public class Calculation13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input first number:");
        float n1 = in.nextInt();

        System.out.print("Input second number:");
        float n2 = in.nextInt();

        System.out.print("Input third number:");
        float n3 = in.nextInt();

        System.out.print("Average of three number is:" +
                (n1 + n2 + n3 ) / 3);


    }
}
