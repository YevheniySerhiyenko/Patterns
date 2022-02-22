package factory_pattern;

public class SeniorDeveloper extends Developer {

    private static final DeveloperLevel level = DeveloperLevel.SENIOR;

    public SeniorDeveloper(){
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
