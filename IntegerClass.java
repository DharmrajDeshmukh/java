
import java.util.Scanner;
public class IntegerClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number (Decimal): ");
        int decimal = sc.nextInt();
        System.out.println("Select one option: ");
        System.out.println("1. Binary");
        System.out.println("2. Octal");
        System.out.println("3. Hexadecimal");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
        switch(choice){
            case 1:
                System.out.println("Binary Number: " + Integer.toBinaryString(decimal));
                break;
            case 2:
                System.out.println("Octal Number: " + Integer.toOctalString(decimal));
                break;
            case 3:
                System.out.println("Hexadecimal Number: " + Integer.toHexString(decimal));
                break;
            default:
                System.out.println("Invalid Input!");
        }
    }
}
