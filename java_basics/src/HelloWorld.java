import java.util.Scanner;


public class HelloWorld {
    public static void main(String[] args) {
        double sGPA = 3.02;
        String firstName = "abc";
        String lastName = "xyz";

        System.out.println(firstName + " " + lastName + " " + "has a GPA " + sGPA);

        System.out.println("enter new Gpa");

        Scanner input = new Scanner(System.in);
        sGPA = input.nextDouble();
        System.out.println(firstName + " " + lastName + " " + " now has a GPA " + sGPA);
    }

}
