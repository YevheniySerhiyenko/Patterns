package factory_pattern;

public class MiddleDeveloper extends Developer {

    private static final DeveloperLevel level = DeveloperLevel.MIDDLE;

    public MiddleDeveloper(){
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
