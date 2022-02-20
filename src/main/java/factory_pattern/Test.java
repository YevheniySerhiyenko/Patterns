package factory_pattern;

import static factory_pattern.DeveloperLevel.*;

public class Test {
    public static void main(String[] args) {
        DeveloperFactory developerFactory = createFactory(SENIOR);
        Developer developer = developerFactory.getDeveloper();
        developer.setAge(35);
        developer.setName("Kohn");
        System.out.println(developer);


    }

    static DeveloperFactory createFactory(DeveloperLevel developerLevel) {
        DeveloperFactory factory;
        switch (developerLevel) {
            case TRAINEE -> factory = new TraineeDeveloperFactory();

            case JUNIOR -> factory = new JuniorDeveloperFactory();

            case MIDDLE -> factory = new MiddleDeveloperFactory();

            case SENIOR -> factory = new SeniorDeveloperFactory();

            case TEAM_LEAD -> factory = new TeamLeadFactory();

            default -> throw new IllegalArgumentException(developerLevel + " is unknown");
        }
        return factory;
    }
}
