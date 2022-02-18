public class Test {
    public static void main(String[] args) {
        ITCompany school = new ITCompany();

        Developer trainee = school.getDeveloper(DeveloperLevel.TRAINEE);
        Developer junior = school.getDeveloper(DeveloperLevel.JUNIOR);
        Developer middle = school.getDeveloper(DeveloperLevel.MIDDLE);
        Developer senior = school.getDeveloper(DeveloperLevel.SENIOR);
        Developer teamLead = school.getDeveloper(DeveloperLevel.TEAM_LEAD);

        trainee.takePosition();
        junior.takePosition();
        middle.takePosition();
        senior.takePosition();
        teamLead.takePosition();
    }
}
