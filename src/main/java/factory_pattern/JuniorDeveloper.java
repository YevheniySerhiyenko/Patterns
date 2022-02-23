package factory_pattern;

public class JuniorDeveloper extends SetterAgeAndNameForDevelopers {

    public JuniorDeveloper(DeveloperLevel level) {
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
                ", level=" + DeveloperLevel.JUNIOR +
                '}';
    }
}
