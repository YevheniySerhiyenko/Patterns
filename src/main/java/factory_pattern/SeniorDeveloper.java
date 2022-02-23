package factory_pattern;

public class SeniorDeveloper extends SetterAgeAndNameForDevelopers {
    public SeniorDeveloper(DeveloperLevel level) {
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
                ", level=" + DeveloperLevel.SENIOR +
                '}';
    }
}
