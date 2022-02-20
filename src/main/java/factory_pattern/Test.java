package factory_pattern;

import static factory_pattern.DeveloperLevel.*;

public class Test {
    public static void main(String[] args) {
        DeveloperFactory developerFactory = createFactory(TRAINEE);
        Developer developer = developerFactory.getDeveloper();
        developer.setAge(35);
        developer.setName("Kohn");
        System.out.println(developer);


    }

    static DeveloperFactory createFactory(DeveloperLevel developerLevel) {
        switch (developerLevel) {
            case TRAINEE : return new TraineeDeveloperFactory();

            case JUNIOR : return new JuniorDeveloperFactory();

            case MIDDLE : return new MiddleDeveloperFactory();

            case SENIOR : return new  SeniorDeveloperFactory();

            case TEAM_LEAD : return new TeamLeadFactory();

            default : throw new IllegalArgumentException(developerLevel + " is unknown");
        }
    }
}
