public  class SkillRule extends EligibilityRule {

    @Override
    public String getRuleName() {
        return "Skills";
    }

    @Override
    public boolean check(Candidate candidate, Job job) {
        String[] requiredSkills = job.getRequiredSkills();

        for (String i : requiredSkills) {
            if (!candidate.hasSkill(i)) {
                return false;
            }
        }

        return true;
    }
}