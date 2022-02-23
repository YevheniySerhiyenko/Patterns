package factory_pattern;

public class SetterAgeAndNameForDevelopers extends Developer{
    private String name;
    private int age;

    @Override
    public Developer setName() {
        name = super.getName();
        return super.setName();
    }

    @Override
    public Developer setAge() {
        age = super.getAge();
        return super.setAge();
    }
    }
