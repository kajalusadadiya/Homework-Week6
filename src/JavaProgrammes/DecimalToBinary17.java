package JavaProgrammes;

import java.util.Scanner;

public class DecimalToBinary17 {
    public static void main(String[] args) {
        DecimalToBinary17 obj = new DecimalToBinary17();
        obj.DeBi();
    }

    public void DeBi(){
        int a = 5;
        Scanner in = new Scanner(System.in);
        System.out.println("Input a Decimal Number: 5");
        System.out.print("Binary number is:");
        System.out.println(Integer.toBinaryString(5));
    }
}
