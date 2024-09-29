package assignment1;

import java.util.Scanner;

public class MyHealthDataTest {

    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);
        MyHealthData Data1 = new MyHealthData();

        System.out.println("Please enter your birth year(exam 1970):");
        Data1.setYear(input.nextInt());
        System.out.println("Please enter your birth month(1-12):");
        Data1.setMonth(input.nextInt());
        System.out.println("Please enter your birth day(1-31):");
        Data1.setDay(input.nextInt());
        input.nextLine();
        System.out.println("Please enter your First Name:");
        Data1.setFirstname(input.nextLine());
        System.out.println("Please enter your Last Name:");
        Data1.setLastname(input.nextLine());
        System.out.println("Please enter your Gender:");
        Data1.setGender(input.nextLine());
        System.out.println("Please enter your Home Address:");
        Data1.setHome_address(input.nextLine());
        System.out.println("Please enter your Level of education:");
        Data1.setLevel_of_education(input.nextLine());
        System.out.println("Please enter your Height (in inches):");
        Data1.setHeightParam(input.nextDouble());
        System.out.println("Please enter your Weight (in pounds):");
        Data1.setWeightParam(input.nextDouble());

        // Display all health data
        Data1.displayMyHealthData();
        input.close();
    }
}
