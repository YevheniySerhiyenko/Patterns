package factory_pattern;

public class JuniorDeveloper extends Developer {

    private static final DeveloperLevel level = DeveloperLevel.JUNIOR;

    public JuniorDeveloper(){
        super.setSalary(level);
    }

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
