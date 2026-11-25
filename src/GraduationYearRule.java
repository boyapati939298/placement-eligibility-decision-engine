public class GraduationYearRule extends EligibilityRule {
    // Creates GraduationYearRule class that inherits the EligibilityRule abstract class.

    @Override
    // Indicates that this method overrides the parent class method.

    public String getRuleName() {
        // Defines a method that returns the name of this eligibility rule.

        return "Graduation Year";
        // Returns the rule name as a String.
    }

    @Override
    // Indicates that this method overrides the parent's check() method.

    public boolean check(Candidate candidate, Job job) {
        // Checks whether the candidate's graduation year matches the job requirement.

        return candidate.getGraduationYear() == job.getRequiredGraduationYear();
        // Returns true if both graduation years are equal, otherwise returns false.
    }
    // Closes the check() method.
}
// Closes the GraduationYearRule class.