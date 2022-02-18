public class ITCompany implements Recruiter{
    public Developer getDeveloper(DeveloperLevel developerLevel){
        Developer developer = switch (developerLevel) {
            case TRAINEE -> new TraineeDeveloper("Andrew", 27);
            case JUNIOR -> new JuniorDeveloper("Ivan", 25);
            case MIDDLE -> new MiddleDeveloper("Alex", 26);
            case SENIOR -> new SeniorDeveloper("Tom", 30);
            case TEAM_LEAD -> TeamLead.getTeamLead("John");
            default -> throw new IllegalArgumentException(String.valueOf(developerLevel));
        };
        return developer;
    }

    @Override
    public void getToKnow(Developer developer) {
        System.out.println("Glad to see you in our company " + developer.getName());
    }

    @Override
    public void techInterview(Developer developer) {

    }

    @Override
    public void allocateJob(Developer developer) {

    }

    @Override
    public void setSalary(int salary) {
        System.out.println("Your salary is " + );
    }
}
