package factory_pattern;

public class TraineeDeveloper extends SetterAgeAndNameForDevelopers {
    public TraineeDeveloper(DeveloperLevel level) {
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
                ", level=" + DeveloperLevel.TRAINEE +
                '}';
    }
}
