// Declares a public class named SkillRule that extends the EligibilityRule class.
public class SkillRule extends EligibilityRule {

    // Overrides the getRuleName() method from the parent class.
    @Override
    // Returns the name of this eligibility rule as "Skills".
    public String getRuleName() {
        // Specifies the name of the rule.
        return "Skills";
    }

    // Overrides the check() method to verify whether a candidate has the required skills.
    @Override
    // Checks if the candidate meets the job's skill requirements.
    public boolean check(Candidate candidate, Job job) {
        // Retrieves the list of skills required for the job.
        String[] requiredSkills = job.getRequiredSkills();

        // Iterates through each required skill.
        for (String i : requiredSkills) {
            // Checks whether the candidate possesses the current required skill.
            if (!candidate.hasSkill(i)) {
                // Returns false if the candidate does not have a required skill.
                return false;
            }
        }

        // Returns true if the candidate possesses all required skills.
        return true;
    }
    // Marks the end of the SkillRule class.
}