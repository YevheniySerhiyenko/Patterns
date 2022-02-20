package factory_pattern;

public class Test {
    public static void main(String[] args) {
        DeveloperFactory developerFactory = createFactory(DeveloperLevel.JUNIOR);
        Developer developer = developerFactory.getDeveloper();
        developer.setAge(35);
        developer.setName("olya");
        System.out.println(developer.toString());


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
