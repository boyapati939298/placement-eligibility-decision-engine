
import java.util.Scanner;
// Imports the Scanner class from Java's utility package.
// Scanner is used to take input from the user through the keyboard.

public class Main {
    // Declares a public class named Main.
    // In Java, every program must have at least one class.

    public static void main(String[] args) {
        // This is the main method.
        // Program execution starts from this method.
        // public: Accessible from anywhere.
        // static: Can be executed without creating an object of Main.
        // void: Does not return any value.
        // String[] args: Accepts command-line arguments.

        Scanner scanner = new Scanner(System.in);
        // Creates a Scanner object named scanner.
        // System.in tells Scanner to read input from the keyboard.

        String name = scanner.next();
        // Reads a single word entered by the user.
        // Stores the entered name in the String variable 'name'.

        double percentage = scanner.nextDouble();
        // Reads a decimal number entered by the user.
        // Stores the percentage in the double variable 'percentage'.

        int backlogs = scanner.nextInt();
        // Reads an integer entered by the user.
        // Stores the number of backlogs in the variable 'backlogs'.

        int graduationYear = scanner.nextInt();
        // Reads an integer representing the graduation year.
        // Stores it in the variable 'graduationYear'.

        int skillCount = scanner.nextInt();
        String[] skills = new String[skillCount];

        for (int i = 0; i < skillCount; i++) {
            skills[i] = scanner.next();
        }

        Candidate candidate = new Candidate(
            name,
            percentage,
            backlogs,
            graduationYear,
            skills
        );
        // Creates an object of the Candidate class.
        // Passes the user's name, percentage, backlogs and graduation year
        // to the Candidate class constructor.
        // The candidate object stores all the candidate's information.

        int jobCount = scanner.nextInt();
        Job[] jobs = new Job[jobCount];

        for (int i = 0; i < jobCount; i++) {
            String company = scanner.next();
            String role = scanner.next();
            double minimumPercentage = scanner.nextDouble();
            int maximumBacklogs = scanner.nextInt();
            int requiredGraduationYear = scanner.nextInt();

            int requiredSkillCount = scanner.nextInt();
            String[] requiredSkills = new String[requiredSkillCount];

            for (int j = 0; j < requiredSkillCount; j++) {
                requiredSkills[j] = scanner.next();
            }

            jobs[i] = new Job(
                company,
                role,
                minimumPercentage,
                maximumBacklogs,
                requiredGraduationYear,
                requiredSkills
            );
        }

        Job selectedJob = jobs[0];
        // Creates an object of the Job class.
        // Passes the job-related information to its constructor.
        // "Infosys"       -> Company name.
        // "Java Developer" -> Job role.
        // 65.0            -> Minimum required percentage.
        // 0               -> Maximum allowed backlogs.
        // 2026            -> Required graduation year.

        EligibilityChecker checker = new EligibilityChecker();
        // Creates an object of the EligibilityChecker class.
        // This object is responsible for checking whether
        // the candidate satisfies the job eligibility criteria.

        System.out.println("================================");
        // Prints a decorative separator line.

        System.out.println("PLACEMENT ELIGIBILITY RESULT");
        // Displays the heading of the placement eligibility result.

        System.out.println("================================");
        // Prints another decorative separator line.

        System.out.println();
        // Prints an empty line to create spacing in the output.

        System.out.println("Candidate : " + candidate.getName());
        // Calls the getName() method of the Candidate object.
        // Retrieves the candidate's name and displays it.
        // The + operator joins the text and candidate's name.

        System.out.println("Company   : " + selectedJob.getCompany());
        // Calls the getCompany() method of the Job object.
        // Retrieves and displays the company name.

        System.out.println("Role      : " + selectedJob.getRole());
        // Calls the getRole() method of the Job object.
        // Retrieves and displays the job role.

        System.out.println();
        // Prints an empty line for better output formatting.

        boolean eligible = checker.evaluate(candidate, selectedJob);
        // Calls the evaluate() method of EligibilityChecker.
        // Passes the candidate object and job object as arguments.
        // The method checks whether the candidate meets the job requirements.
        // Stores the returned true or false value in the boolean variable 'eligible'.
        // true means eligible, false means not eligible.


        System.out.println();
        // Prints an empty line before displaying the final result.

        if (eligible) {
            // Checks whether the eligible variable is true.
            // If true, the statements inside this if block are executed.

            System.out.println("Final Result : ELIGIBLE");
            // Displays ELIGIBLE if the candidate satisfies the requirements.

        } else {
            // Executes when the eligible variable is false.
            // This means the candidate does not satisfy the requirements.

            System.out.println("Final Result : NOT ELIGIBLE");
            // Displays NOT ELIGIBLE if the candidate does not qualify.
        }

        System.out.println("================================");
        // Prints the closing separator line.

        scanner.close();
        // Closes the Scanner object.
        // Releases the input resource after all user input is completed.
    }
    // Closing brace of the main() method.

}
// Closing brace of the Main class.