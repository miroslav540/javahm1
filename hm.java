import java.util.Scanner;

public class hm {
    public static void main(String[] ags) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int number = in.nextInt();
        int triangleNumber = ((int)Math.pow(number, 2) + number) / 2;
        System.out.print("Result = " + triangleNumber);
    }

}
        

