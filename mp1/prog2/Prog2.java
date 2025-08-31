import java.util.Scanner;
public class Prog2 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        //1. I am confused about the first question, ask Orak

        //2
        System.out.println("   XXXXX   ");
        System.out.println("  X     X  ");
        System.out.println("((  o o  ))");
        System.out.println("  |  V  |  ");
        System.out.println("  | === |  ");
        System.out.println("  -------  ");

        //3
        System.out.print("What is your favorite ice cream flavor: ");
        String uIn = s.nextLine();
        System.out.println("You are wrong " + uIn + " is the WORST flavor");
        
        //4
        String mainChorus = "Head, shoulders, knees and toes, knees and toes";
        System.out.println(mainChorus);
        System.out.println(mainChorus);
        System.out.println("And eyes and ears and mouth and nose");
        System.out.println(mainChorus);

        //5
        System.out.print("Enter an integer: ");
        int user_int = s.nextInt();
        System.out.println("2 * " +  user_int + " = " + 2 * user_int);
        

        s.close();
    }
}
