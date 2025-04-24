import java.util.Scanner;

public class LifeAssistant {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to your personal Life Assistant");
        System.out.print("What's your full name? ");
        String name = sc.nextLine();
        System.out.println("Hi " + name + "!");

        while (true) {
            System.out.println("\nChoose from the menu:");
            System.out.println("1. Calculate BMI");
            System.out.println("2. Calculate Weekly Earnings");
            System.out.println("3. Determine Age Category");
            System.out.println("4. Get an Inspiring Quote");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); // consume leftover newline

            switch (choice) {
                case 1:
                    calculateBMI();
                    break;
                case 2:
                    weeklyEarnings();
                    break;
                case 3:
                    ageCategory();
                    break;
                case 4:
                    mood();
                    break;
                case 5:
                    System.out.println("Goodbye, " + name + "!");
                    return;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }

    public static void calculateBMI() {
        Scanner sc = new Scanner(System.in);
        System.out.print("What's your weight in kg? ");
        double weight = sc.nextDouble();

        System.out.print("What's your height in meters? ");
        double height = sc.nextDouble();

        double bmi = weight / (height * height);
        long roundedBmi = Math.round(bmi);
        System.out.println("Your BMI is: " + roundedBmi);

        if (bmi < 18.5) {
            System.out.println("You are underweight.");
        } else if (bmi < 24.9) {
            System.out.println("You are normal weight.");
        } else {
            System.out.println("You are overweight — time to workout!");
        }
    }

    public static void weeklyEarnings() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Total hours worked: ");
        double hoursWorked = sc.nextDouble();

        System.out.print("Hourly rate: ");
        double rateHourly = sc.nextDouble();

        double weeklyEarning = rateHourly * hoursWorked;
        System.out.printf("Your total gross pay is: $%.2f%n", weeklyEarning);
    }

    public static void ageCategory() {
        Scanner sc = new Scanner(System.in);
        System.out.print("What's your age? ");
        int age = sc.nextInt();

        if (age < 18) {
            System.out.println("You are a minor.");
        } else if (age < 65) {
            System.out.println("You are an adult.");
        } else {
            System.out.println("You are a senior.");
        }
    }

    public static void mood() {
        Scanner sc = new Scanner(System.in);
        System.out.print("How do you feel? (happy/sad/bored): ");
        String mood = sc.nextLine().toLowerCase();

        switch (mood) {
            case "sad":
                System.out.println("Everything will pass, keep pushing.");
                break;
            case "happy":
                System.out.println("Yayyy!! Good things come to good people.");
                break;
            case "bored":
                System.out.println("Boredom is temporary, it shall pass.");
                break;
            default:
                System.out.println("Unknown mood. Sending good vibes anyway ✨");
        }
    }
}
