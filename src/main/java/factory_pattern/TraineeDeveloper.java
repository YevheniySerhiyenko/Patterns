package factory_pattern;

public class TraineeDeveloper extends Developer {

    private final DeveloperLevel level = DeveloperLevel.TRAINEE;

    public TraineeDeveloper(){
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
