package JavaProgrammes;

import java.util.Scanner;

public class ConvertUpToDown9 {
    private static Scanner sc;

    public static void main(String[] args) {
        ConvertUpToDown9 obj = new ConvertUpToDown9();
        obj.upper();
    }

    public void upper(){
        String upperStr;
        sc = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        System.out.print("\n Enter Uppercase String :");
        upperStr = sc.nextLine();
        String upperstr1 = upperStr.toLowerCase();
        System.out.print("\n The Lowercase String:" + upperstr1);


    }
}
