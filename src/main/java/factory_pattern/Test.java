package factory_pattern;

public class Test {
    public static void main(String[] args) {
        DeveloperFactory developerFactory = createFactory(DeveloperLevel.SENIOR);
        Developer developer = developerFactory.getDeveloper();


    }
    static DeveloperFactory createFactory(DeveloperLevel developerLevel) {
        switch (developerLevel) {
            case TRAINEE -> {return new TraineeDeveloperFactory();}
            case JUNIOR -> {return new JuniorDeveloperFactory();}
            case MIDDLE -> {return new MiddleDeveloperFactory();}
            case SENIOR -> {return new SeniorDeveloperFactory();}
            default -> throw new IllegalArgumentException(developerLevel + " is unknown");
        }
    }
}