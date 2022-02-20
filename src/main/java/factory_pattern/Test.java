package factory_pattern;

public class Test {
    public static void main(String[] args) {
        DeveloperFactory developerFactory = createFactory(DeveloperLevel.JUNIOR);
        Developer developer = developerFactory.getDeveloper();
        developer.setAge(35);
        developer.setName("Andrew");
        System.out.println(developer.toString());


    }

    static DeveloperFactory createFactory(DeveloperLevel developerLevel) {
        DeveloperFactory factory = null;
        switch (developerLevel) {
            case TRAINEE -> factory = new TraineeDeveloperFactory();
            case JUNIOR -> factory = new JuniorDeveloperFactory();
            case MIDDLE -> factory = new MiddleDeveloperFactory();
            case SENIOR -> factory = new SeniorDeveloperFactory();
            case TEAM_LEAD ->  factory = new TeamLeadFactory();
            default -> throw new IllegalArgumentException(developerLevel + " is unknown");
        }
        return factory;
    }
}
