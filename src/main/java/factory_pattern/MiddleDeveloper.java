package factory_pattern;

public class MiddleDeveloper extends SetterAgeAndNameForDevelopers {
    private String name;
    private int age;

    public MiddleDeveloper(DeveloperLevel level) {
        super.setSalary(level);
        setName();
        setAge();
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + this.name + '\'' +
                ", age=" + this.age +
                ", salary=" + super.getSalary() +
                ", level=" + DeveloperLevel.MIDDLE +
                '}';
    }
}
