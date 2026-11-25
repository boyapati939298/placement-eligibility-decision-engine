public class BacklogRule extends EligibilityRule {
    // Creates BacklogRule class that inherits the EligibilityRule abstract class.

    @Override
    // Indicates that this method overrides the parent class method.

    public String getRuleName() {
        // Defines a method that returns the name of the eligibility rule.

        return "Backlogs";
        // Returns the rule name as a String.
    }

    @Override
    // Indicates that this method overrides the parent's check() method.

    public boolean check(Candidate candidate, Job job) {
        // Checks whether the candidate's backlogs are within the allowed limit.

        return candidate.getBacklogs() <= job.getMaximumBacklogs();
        // Returns true if the candidate's backlogs are less than or equal to the maximum allowed backlogs, otherwise returns false.
    }
    // Closes the check() method.
}
// Closes the BacklogRule class.