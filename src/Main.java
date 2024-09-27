import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int month = 0;
        Scanner in = new Scanner(System.in); //program by someone else to get input from the user
        System.out.println("Enter the birth month (1-12)");
        if (in.hasNextInt()) {
            month = in.nextInt();
            in.nextLine(); // clears the buffer
            if (month >= 1 && month <= 12) {
                System.out.println("You birth month is " + month);
            } else {
                System.out.println("You entered an incorrect month value : " + month);
            }
        }

        else{
            System.out.println("Invalid Value");
        }
    }
}