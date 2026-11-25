
public abstract class EligibilityRule {
    // Declares a public abstract class named EligibilityRule.
    // This class acts as a common blueprint for all eligibility rules.
    // abstract means we cannot directly create an object of this class.
    // Other classes must extend this class and provide implementations
    // for its abstract methods.

    public abstract String getRuleName();
    // Declares an abstract method named getRuleName().
    // public means this method can be accessed from other classes.
    // abstract means this method has no body or implementation here.
    // String indicates that the method must return a String value.
    // Every child class must implement this method.
    // Its purpose is to return the name of a particular eligibility rule.
    // Example: "Percentage Rule" or "Backlog Rule".

    public abstract boolean check(Candidate candidate, Job job);
    // Declares another abstract method named check().
    // It accepts two parameters:
    // Candidate candidate -> Contains the candidate's academic information.
    // Job job             -> Contains the company's eligibility requirements.
    // boolean means this method must return either true or false.
    // Since it is abstract, its implementation must be provided by child classes.
    // Its purpose is to check whether a candidate satisfies a particular rule.
    // true means the candidate passes that rule.
    // false means the candidate fails that rule.

}
// Closing brace of the EligibilityRule class.