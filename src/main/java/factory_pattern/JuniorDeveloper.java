package factory_pattern;

public class JuniorDeveloper extends Developer {

    private final DeveloperLevel level = DeveloperLevel.JUNIOR;

    @Override
    public String toString() {
        return "{" +
                "name='" + super.getName() + '\'' +
                ", age=" + super.getAge() +
                ", applying for a salary=" + super.getSalary() +
                ", level=" + level +
                '}';
    }
}
