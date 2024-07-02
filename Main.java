import java.nio.file.LinkPermission;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // ****Question 1****

        /*
            1.Write a program that checks the role of the user
            If the role is admin print "welcome admin"
            If the role is superuser print "welcome superuser"
            If the role is user print "welcome user" (tip:use if else)
        */
        System.out.println("****Question 1****");
        System.out.print("Enter your role :");
        String role = input.nextLine();
        if (role.equalsIgnoreCase("admin")) {
            System.out.println("Welcome admin");
        } else if (role.equalsIgnoreCase("superuser")) {
            System.out.println("Welcome Superuser");
        } else if (role.equalsIgnoreCase("user")) {
            System.out.println("Welcome User");
        } else {
            System.out.println("invalid");
        }

        // ****Question 2****

        /*
            2.Take three numbers from the user and print the greatest number.
            Test Data
            Input the 1st number: 25
            Input the 2nd number: 78
            Input the 3rd number: 87
            Expected Output : The
            greatest: 87
         */
        System.out.println("****Question 2****");
        System.out.print("Enter 1st number  :");
        int num1 = input.nextInt();
        System.out.print("Enter 2nd number  :");
        int num2 = input.nextInt();
        System.out.print("Enter 3rd number  :");
        int num3 = input.nextInt();

        if (num1 > num2  && num1 > num3) {
            System.out.println(num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println(num2);
        } else {
            System.out.print("greatest:"+num3);
        }

        // ****Question 3****

        /*
            3.Write a Java program that generates an integer between 1 and 7 and
            displays the name of the weekday.
            Test Data
            number: 4
            Expected Output:
            Wednesday
         */
        System.out.println("****Question 3****");
        System.out.println("choose from 1 to 7:");
        System.out.print("*");

        int num4 = input.nextInt();
        switch (num4){
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("invalid , please enter from 1 -7 ");
                break;
        }

        // ****Question 4****

        /*
            4. Write a program that takes a numeric score as input and prints the
            corresponding letter grade using the following grading scale:
            A: 90-100
            B: 80-89
            C: 70-79
            D: 60-69
            F: 0-59
            Enter your numeric score: 85
            Numeric Score: 85
            Letter Grade: B
         */
        System.out.println("****Question 4****");
        System.out.print("Enter your numeric score: ");
        int score = input.nextInt();
        System.out.println("Numeric Score :"+score);

        if (score<=100 && score>=90){
            System.out.println("Letter Grade: A");

        }else if (score<=89 && score>=80) {
            System.out.println("Letter Grade: B ");
        }else if (score<=79 && score>=70) {
            System.out.println("Letter Grade: C ");
        }else if (score<=69 && score>=60) {
            System.out.println("Letter Grade: D ");
        }else if (score<=59 && score>=0){
            System.out.println("Letter Grade: F");
        }else {
            System.out.println("invalid");
        }

        // ****Question 5****

        /*
            5. Write a Java program that takes a person's age as input and
            categorizes them into one of three age categories: "Child,"
            "Teenager," or "Adult" using an if statement.
            use an if statement to categorize the age based on the following criteria:
            • If the age is less than 13, categorize them as a "Child."
            • If the age is between 13 and 19 (inclusive), categorize them as a
            "Teenager."
            • If the age is 20 or older, categorize them as an "Adult."
            Sample Output:
            Enter your age: 25
            You are an Adult.
         */
        System.out.println("****Question 5****");
        System.out.print("Enter your Age :");
        int age = input.nextInt();

        if (age < 13) {
            System.out.println("You are a Child");

        } else if (age >= 13 && age <= 19) {
            System.out.println("You are a Teenager");
        } else {
            System.out.println(" You are an Adult");
        }


    }
}