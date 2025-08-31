import java.util.Scanner;
public class Greetings2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter your first name: ");
        String fname = s.nextLine();

        System.out.print("Enter your last name: ");
        String lname = s.nextLine();
        
        System.out.println("Hi "+ fname + " " + lname);
        s.close();
    }
}
