public class Candidate {
    // Declares a public class named Candidate to represent a person applying for a job.

    private String name;
    // Declares a private String variable to store the candidate's name.

    private double percentage;
    // Declares a private double variable to store the candidate's academic percentage.

    private int backlogs;
    // Declares a private integer variable to store the candidate's number of backlogs.

    private int graduationYear;
    // Declares a private integer variable to store the candidate's graduation year.

    private String[] skills;
    // Declares a private String array to store all the skills possessed by the candidate.

    public Candidate(
        // Declares the constructor of the Candidate class, which initializes candidate details.

        String name,
        // Accepts the candidate's name as a constructor parameter.

        double percentage,
        // Accepts the candidate's academic percentage as a constructor parameter.

        int backlogs,
        // Accepts the candidate's number of backlogs as a constructor parameter.

        int graduationYear,
        // Accepts the candidate's graduation year as a constructor parameter.

        String[] skills
        // Accepts an array containing the candidate's skills.
    ) {
        // Starts the constructor body.

        this.name = name;
        // Assigns the constructor parameter name to the instance variable name.

        this.percentage = percentage;
        // Assigns the constructor parameter percentage to the instance variable percentage.

        this.backlogs = backlogs;
        // Assigns the constructor parameter backlogs to the instance variable backlogs.

        this.graduationYear = graduationYear;
        // Assigns the constructor parameter graduationYear to the instance variable graduationYear.

        this.skills = skills;
        // Assigns the skills array received from the constructor to the instance variable skills.
    }
    // Ends the Candidate constructor.

    public String getName() {
        // Declares a public getter method that returns the candidate's name as a String.

        return name;
        // Returns the value stored in the name variable.
    }
    // Ends the getName() method.

    public double getPercentage() {
        // Declares a public getter method that returns the candidate's percentage as a double.

        return percentage;
        // Returns the candidate's academic percentage.
    }
    // Ends the getPercentage() method.

    public int getBacklogs() {
        // Declares a public getter method that returns the candidate's backlog count as an integer.

        return backlogs;
        // Returns the number of backlogs.
    }
    // Ends the getBacklogs() method.

    public int getGraduationYear() {
        // Declares a public getter method that returns the candidate's graduation year.

        return graduationYear;
        // Returns the candidate's graduation year.
    }
    // Ends the getGraduationYear() method.

    public boolean hasSkill(String requiredSkill) {
        // Declares a public boolean method to check whether the candidate possesses a particular skill.

        for (int i = 0; i < skills.length; i++) {
            // Loops through the candidate's skills array from the first element to the last element.

            if (skills[i].equalsIgnoreCase(requiredSkill)) {
                // Compares the current candidate skill with the required skill without considering uppercase or lowercase letters.

                return true;
                // Returns true if the candidate possesses the required skill.
            }
            // Ends the if condition.
        }
        // Ends the for loop after checking all the candidate's skills.

        return false;
        // Returns false if the required skill is not found in the candidate's skills array.
    }
    // Ends the hasSkill() method.

}
// Ends the Candidate class.