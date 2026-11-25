
public class Candidate {
    // Declares a public class named Candidate.
    // This class represents a person applying for a job.
    // It stores the candidate's personal and academic information.

    private String name;
    // Declares a private String variable named name.
    // Stores the candidate's name.
    // private means it cannot be directly accessed from outside this class.

    private double percentage;
    // Declares a private double variable named percentage.
    // Stores the candidate's academic percentage.
    // double is used because percentage can contain decimal values.
    // Example: 75.5 or 82.0.

    private int backlogs;
    // Declares a private integer variable named backlogs.
    // Stores the number of backlogs the candidate has.
    // Example: 0 means no backlogs.

    private int graduationYear;
    // Declares a private integer variable named graduationYear.
    // Stores the year in which the candidate graduates.
    // Example: 2026.

    public Candidate(
        String name,
        double percentage,
        int backlogs,
        int graduationYear
    ) {
        // This is the constructor of the Candidate class.
        // A constructor is automatically called when a Candidate object is created.
        // It accepts four parameters containing candidate information.
        // These parameters are used to initialize the object's variables.

        this.name = name;
        // Assigns the name parameter to the instance variable name.
        // this.name refers to the class variable.
        // name refers to the constructor parameter.
        // The this keyword distinguishes between the two.

        this.percentage = percentage;
        // Assigns the percentage received from the constructor
        // to the instance variable percentage.

        this.backlogs = backlogs;
        // Assigns the number of backlogs received from the constructor
        // to the instance variable backlogs.

        this.graduationYear = graduationYear;
        // Assigns the graduation year received from the constructor
        // to the instance variable graduationYear.
    }
    // Closing brace of the Candidate constructor.

    public String getName() {
        // Declares a public getter method named getName().
        // It returns a String value.
        // This method allows other classes to access the private name variable.

        return name;
        // Returns the candidate's name.
    }
    // Closing brace of getName() method.

    public double getPercentage() {
        // Declares a public getter method named getPercentage().
        // It returns a double value.
        // This method provides access to the candidate's percentage.

        return percentage;
        // Returns the candidate's academic percentage.
    }
    // Closing brace of getPercentage() method.

    public int getBacklogs() {
        // Declares a public getter method named getBacklogs().
        // It returns an integer value.
        // This method provides access to the candidate's backlog count.

        return backlogs;
        // Returns the number of backlogs.
    }
    // Closing brace of getBacklogs() method.

    public int getGraduationYear() {
        // Declares a public getter method named getGraduationYear().
        // It returns an integer value.
        // This method provides access to the candidate's graduation year.

        return graduationYear;
        // Returns the candidate's graduation year.
    }
    // Closing brace of getGraduationYear() method.

}
// Closing brace of the Candidate class.