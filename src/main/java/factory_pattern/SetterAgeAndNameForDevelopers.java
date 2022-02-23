package factory_pattern;

public class SetterAgeAndNameForDevelopers extends Developer {
    private String name;
    private int age;

    @Override
    public Developer setName() {
        super.getName();
        return super.setName();
    }

    @Override
    public Developer setAge() {
        super.getAge();
        return super.setAge();
    }
}
