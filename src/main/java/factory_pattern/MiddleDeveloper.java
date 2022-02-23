package factory_pattern;

public class MiddleDeveloper extends SetterAgeAndNameForDevelopers {
    public MiddleDeveloper(DeveloperLevel level) {
        super.setSalary(level);
        setName();
        setAge();
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + super.getName() + '\'' +
                ", age=" + super.getAge() +
                ", salary=" + super.getSalary() +
                ", level=" + DeveloperLevel.MIDDLE +
                '}';
    }
}
