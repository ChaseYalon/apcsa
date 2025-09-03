import java.util.*;
public class Prog2c {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        System.out.print("What is your favorite ice cream flavor: ");
        String uIn = s.nextLine();
        System.out.println("You are wrong " + uIn + " is the WORST flavor");	
        s.close();
	}

}
