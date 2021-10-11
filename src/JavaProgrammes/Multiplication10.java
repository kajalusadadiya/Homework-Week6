package  JavaProgrammes;

    import java.util.Scanner;

    public class Multiplication10 {
    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of the table:");

        int c = sc.nextInt();
        for (a = 1; a <= 10; a++){
            b = c * a;
            System.out.println(c + "*" + a + "=" + b);
        }
    }
}
