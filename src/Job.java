
public class Job {
    // Declares a public class named Job.
    // This class represents a job opportunity offered by a company.
    // It stores the company name, job role and eligibility requirements.

    private String company;
    // Declares a private String variable named company.
    // Stores the name of the company offering the job.
    // private means this variable cannot be directly accessed
    // from outside the Job class.

    private String role;
    // Declares a private String variable named role.
    // Stores the job position or designation.
    // Example: Java Developer, Software Engineer.

    private double minimumPercentage;
    // Declares a private double variable named minimumPercentage.
    // Stores the minimum academic percentage required for the job.
    // double is used because percentage can contain decimal values.
    // Example: 65.0 or 70.5.

    private int maximumBacklogs;
    // Declares a private integer variable named maximumBacklogs.
    // Stores the maximum number of backlogs allowed for the job.
    // Example: 0 means the candidate must have no backlogs.

    private int requiredGraduationYear;
    // Declares a private integer variable named requiredGraduationYear.
    // Stores the graduation year required by the company.
    // Example: 2026 means the candidate must graduate in 2026.

    private String[] requiredSkills;


    public Job(
        String company,
        String role,
        double minimumPercentage,
        int maximumBacklogs,
        int requiredGraduationYear,
        String[] requiredSkills
    ) {
        // This is the constructor of the Job class.
        // A constructor is automatically called when a Job object is created.
        // It accepts five parameters to initialize the job details.
        // The parameter names represent the values passed during object creation.

        this.company = company;
        // Assigns the constructor parameter company to the instance variable company.
        // 'this.company' refers to the class variable.
        // 'company' refers to the constructor parameter.
        // The this keyword distinguishes instance variables from parameters.

        this.role = role;
        // Assigns the job role passed to the constructor
        // to the instance variable role.

        this.minimumPercentage = minimumPercentage;
        // Assigns the minimum percentage requirement
        // passed to the constructor to the instance variable.

        this.maximumBacklogs = maximumBacklogs;
        // Assigns the maximum allowed backlogs
        // passed to the constructor to the instance variable.

        this.requiredGraduationYear = requiredGraduationYear;
        // Assigns the required graduation year
        // passed to the constructor to the instance variable.

        this.requiredSkills = requiredSkills;
    }
    // Closing brace of the Job constructor.

    public String getCompany() {
        // Declares a public getter method named getCompany().
        // It returns a String value.
        // This method allows other classes to access the private company variable.

        return company;
        // Returns the company name stored in the company variable.
    }
    // Closing brace of getCompany() method.

    public String getRole() {
        // Declares a public getter method named getRole().
        // It returns the job role stored in the role variable.

        return role;
        // Returns the job role.
    }
    // Closing brace of getRole() method.

    public double getMinimumPercentage() {
        // Declares a public getter method named getMinimumPercentage().
        // It returns a double value containing the minimum required percentage.

        return minimumPercentage;
        // Returns the minimum percentage requirement.
    }
    // Closing brace of getMinimumPercentage() method.

    public int getMaximumBacklogs() {
        // Declares a public getter method named getMaximumBacklogs().
        // It returns an integer representing the maximum allowed backlogs.

        return maximumBacklogs;
        // Returns the maximum number of backlogs allowed.
    }
    // Closing brace of getMaximumBacklogs() method.

    public int getRequiredGraduationYear() {
        // Declares a public getter method named getRequiredGraduationYear().
        // It returns the graduation year required by the company.

        return requiredGraduationYear;
        // Returns the required graduation year.
    }
    // Closing brace of getRequiredGraduationYear() method.

    public String[] getRequiredSkills() {
        return requiredSkills;
    }

}
// Closing brace of the Job class.