public class EligibilityChecker {
    // Creates a public class named EligibilityChecker to check candidate eligibility.

    private EligibilityRule[] rules;
    // Declares a private array to store different eligibility rule objects.

    public EligibilityChecker() {
        // Creates a constructor that initializes the eligibility rules.

        rules = new EligibilityRule[] {
            // Creates an array of EligibilityRule type to store different rule objects.

            new PercentageRule(),
            // Creates an object of PercentageRule to check the candidate's percentage.

            new BacklogRule(),
            // Creates an object of BacklogRule to check the candidate's backlogs.

            new GraduationYearRule()
            // Creates an object of GraduationYearRule to check the candidate's graduation year.
        };
        // Closes the eligibility rules array initialization.
    }
    // Closes the EligibilityChecker constructor.

    public boolean evaluate(Candidate candidate, Job job) {
        // Defines a method that checks all eligibility rules and returns a boolean result.

        boolean eligible = true;
        // Assumes the candidate is eligible initially.

        for (int i = 0; i < rules.length; i++) {
            // Loops through every eligibility rule stored in the rules array.

            boolean passed = rules[i].check(candidate, job);
            // Executes the current rule's check() method and stores the result.

            if (passed) {
                // Checks whether the candidate passed the current eligibility rule.

                System.out.println(rules[i].getRuleName() + " : PASS");
                // Displays the rule name with PASS if the candidate satisfies the rule.

            } else {
                // Executes when the candidate fails the current eligibility rule.

                System.out.println(rules[i].getRuleName() + " : FAIL");
                // Displays the rule name with FAIL if the candidate does not satisfy the rule.

                eligible = false;
                // Changes eligible to false if any one eligibility rule fails.
            }
            // Closes the if-else condition.
        }
        // Closes the for loop after checking all eligibility rules.

        return eligible;
        // Returns true if all rules pass, otherwise returns false.
    }
    // Closes the evaluate() method.
}
// Closes the EligibilityChecker class.