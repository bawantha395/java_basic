import java.util.Scanner;


public class HelloWorld {

    public static void announceTeatime(){
        System.out.println("wait for a tea time");
        System.out.println("type word" + "  to start tea time");
        Scanner input = new Scanner(System.in);
         input.next();
        System.out.println("this is a teatime");
    }

    public static void calculateTotalMealPrice(double tipRate, double taxRate, double listedPrice){
        double tip = tipRate * listedPrice;
        double tax = taxRate * listedPrice;
        double result = listedPrice + tip + tax;
        System.out.println("Your total meal price is " + result);
    }
    public static void main(String[] args) {
//        double sGPA = 3.02;
//        String firstName = "abc";
//        String lastName = "xyz";
//
//        System.out.println(firstName + " " + lastName + " " + "has a GPA " + sGPA);
//
//        System.out.println("enter new Gpa");
//
//        Scanner input = new Scanner(System.in);
//        sGPA = input.nextDouble();
//        System.out.println(firstName + " " + lastName + " " + " now has a GPA " + sGPA);

//
//        int number;
//        System.out.println("enter the number : ");
//        Scanner input =new Scanner(System.in);
//        number = input.nextInt();
//        if(number>8){
//            System.out.println("high");
//        }
//        else if (number >5){
//            System.out.println("medium");
//        }
//        else{
//            System.out.println("low");
//        }

//        Scanner input = new Scanner(System.in);

//        boolean isSongRepeat =  true;
//
//        while(isSongRepeat){
//            System.out.println("current song is playing");
//            System.out.println("are you want to repaet");
//            String song = input.next();
//
//            if("yes".equals(song)){
//                isSongRepeat = false;
//            }
//        }
//        System.out.println("playing next song");

//        String question = "What is the largest planet in our solar system";
//        String choiceOne = "earth";
//        String choiceTwo = "jupiter";
//        String choiceThree = "saturn";
//
//        String correctAnswer = choiceThree;
//
//        // Write a print statement asking the question
//        System.out.println(question);
//
//        // Write a print statement giving the answer choices
//        System.out.println("Choose one of the following: " + choiceOne +
//                ", " + choiceTwo + ", or " + choiceThree + ".");
//
//        // Have the user input an answer
//        // Retrieve the user's input
//        Scanner scanner = new Scanner(System.in);
//        String input = scanner.next();
//
//        // If the user's input matches the correctAnswer...
//        if (correctAnswer.equals(input.toLowerCase())) {
//            // then the user is correct, and we want to print out a
//            // congrats message to the user.
//            System.out.println("Congrats! That’s the correct answer.");
//        } else {
//            // If the user's input does not match the correctAnswer…
//            // then the user is incorrect, and we want to print out a
//            // message saying that the user is incorrect as well
//            // as what the correct choice was.
//            System.out.println("You are incorrect. The correct answer is " +
//                    correctAnswer);
//        }
//        announceTeatime();
        calculateTotalMealPrice(0.2, 0.08, 15);
    }

}
