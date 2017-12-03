import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    private static int base = 2;
    private static int pow;

    public static void main(String[] args) {
        System.out.print("Please enter the power: ");
        pow = input.nextInt();

        int count = 1;
        int output = 1;

        while(count <= pow){
            count++;
            output *= base;

        }

        System.out.println(base+" to the power "+pow+" is: "+output);
    }


}
