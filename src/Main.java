import java.util.Scanner;
// Imports the Scanner class from Java's utility package to read user input.

public class Main {
    // Declares a public class named Main.

    public static void main(String[] args) {
        // Main method where the execution of the Java program begins.

        Scanner scanner = new Scanner(System.in);
        // Creates a Scanner object to accept input from the keyboard.

        String name = scanner.next();
        // Reads the candidate's name as a single word.

        double percentage = scanner.nextDouble();
        // Reads the candidate's academic percentage as a decimal value.

        int backlogs = scanner.nextInt();
        // Reads the number of backlogs as an integer.

        int graduationYear = scanner.nextInt();
        // Reads the candidate's graduation year.

        int skillCount = scanner.nextInt();
        // Reads the total number of skills possessed by the candidate.

        String[] skills = new String[skillCount];
        // Creates a String array to store the candidate's skills.

        for (int i = 0; i < skillCount; i++) {
            // Loops through the array to accept each candidate skill.

            skills[i] = scanner.next();
            // Reads a skill entered by the user and stores it at the current index.
        }
        // Ends the loop for entering candidate skills.

        Candidate candidate = new Candidate(
                // Creates a Candidate object using the constructor.

                name,
                // Passes the candidate's name to the constructor.

                percentage,
                // Passes the candidate's academic percentage.

                backlogs,
                // Passes the candidate's number of backlogs.

                graduationYear,
                // Passes the candidate's graduation year.

                skills
        // Passes the candidate's skills array.
        );
        // Completes the creation of the Candidate object.

        int jobCount = scanner.nextInt();
        // Reads the total number of jobs entered by the user.

        Job[] jobs = new Job[jobCount];
        // Creates an array of Job objects to store multiple job details.

        for (int i = 0; i < jobCount; i++) {
            // Loops through the array to collect details of each job.

            String company = scanner.next();
            // Reads the company name.

            String role = scanner.next();
            // Reads the job role.

            double minimumPercentage = scanner.nextDouble();
            // Reads the minimum academic percentage required for the job.

            int maximumBacklogs = scanner.nextInt();
            // Reads the maximum number of backlogs allowed.

            int requiredGraduationYear = scanner.nextInt();
            // Reads the required graduation year for the job.

            int requiredSkillCount = scanner.nextInt();
            // Reads the total number of skills required for the job.

            String[] requiredSkills = new String[requiredSkillCount];
            // Creates an array to store all the required job skills.

            for (int j = 0; j < requiredSkillCount; j++) {
                // Loops through the array to accept each required skill.

                requiredSkills[j] = scanner.next();
                // Reads a required skill and stores it in the array.
            }
            // Ends the loop for entering required skills.

            jobs[i] = new Job(
                    // Creates a Job object and stores it at the current array index.

                    company,
                    // Passes the company name to the Job constructor.

                    role,
                    // Passes the job role.

                    minimumPercentage,
                    // Passes the minimum required academic percentage.

                    maximumBacklogs,
                    // Passes the maximum allowed backlogs.

                    requiredGraduationYear,
                    // Passes the required graduation year.

                    requiredSkills
            // Passes the array containing the required skills.
            );
            // Completes the creation of the Job object.
        }
        // Ends the loop for entering all job details.

        Job selectedJob = jobs[0];
        // Selects the first job from the jobs array for eligibility checking.

        EligibilityChecker checker = new EligibilityChecker();
        // Creates an EligibilityChecker object to evaluate candidate eligibility.

        System.out.println("================================");
        // Prints a decorative separator line.

        System.out.println("PLACEMENT ELIGIBILITY RESULT");
        // Displays the heading of the placement eligibility result.

        System.out.println("================================");
        // Prints another decorative separator line.

        System.out.println();
        // Prints an empty line to improve output formatting.

        System.out.println("Candidate : " + candidate.getName());
        // Retrieves and displays the candidate's name using the getName() method.

        System.out.println("Company   : " + selectedJob.getCompany());
        // Retrieves and displays the selected company's name.

        System.out.println("Role      : " + selectedJob.getRole());
        // Retrieves and displays the selected job role.

        System.out.println();
        // Prints an empty line for better readability.

        boolean eligible = checker.evaluate(candidate, selectedJob);
        // Calls the evaluate() method to check whether the candidate is eligible.
        // Passes the Candidate and Job objects as arguments.
        // Stores the returned true or false value in the eligible variable.

        System.out.println();
        // Prints an empty line before displaying the final result.

        if (eligible) {
            // Checks whether the eligible variable contains true.

            System.out.println("Final Result : ELIGIBLE");
            // Displays ELIGIBLE if the candidate satisfies all eligibility rules.

        } else {
            // Executes this block if the eligible variable contains false.

            System.out.println("Final Result : NOT ELIGIBLE");
            // Displays NOT ELIGIBLE if the candidate fails any eligibility rule.
        }
        // Ends the if-else conditional statement.

        System.out.println("================================");
        // Prints the closing separator line.

        scanner.close();
        // Closes the Scanner object and releases the input resource.
    }
    // Ends the main() method.

}
// Ends the Main class.