public class PercentageRule extends EligibilityRule {
    // Creates PercentageRule class that inherits the EligibilityRule abstract class.

    @Override
    // Indicates that this method overrides the parent class method.

    public String getRuleName() {
        // Defines a method that returns the name of the eligibility rule.

        return "Percentage";
        // Returns the rule name as a String.
    }

    @Override
    // Indicates that this method overrides the parent's check() method.

    public boolean check(Candidate candidate, Job job) {
        // Checks whether the candidate's percentage meets the company's requirement.

        return candidate.getPercentage() >= job.getMinimumPercentage();
        // Returns true if the candidate's percentage is greater than or equal to the minimum required percentage, otherwise returns false.
    }
    // Closes the check() method.
}
// Closes the PercentageRule class.