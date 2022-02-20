package factory_pattern;

public class Test {
    public static void main(String[] args) {
        DeveloperFactory developerFactory = createFactory(DeveloperLevel.JUNIOR);
        Developer developer = developerFactory.getDeveloper();
        developer.setAge(1);
        developer.setName("john");
        System.out.println(developer);


    }

    static DeveloperFactory createFactory(DeveloperLevel developerLevel) {
        DeveloperFactory factory = null;
        switch (developerLevel) {
            case TRAINEE: {
                factory = new TraineeDeveloperFactory();
                break; }
            case JUNIOR: {
                factory = new JuniorDeveloperFactory();
                break; }
            case MIDDLE: {
                factory = new MiddleDeveloperFactory();
                break; }
            case SENIOR: {
                factory = new SeniorDeveloperFactory();
                break; }
            case TEAM_LEAD: {
                factory = new TeamLeadFactory();
                break; }
            default:
                throw new IllegalArgumentException(developerLevel + " is unknown");
        }
        return factory;
    }
}
