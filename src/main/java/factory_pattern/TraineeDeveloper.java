package factory_pattern;

public class TraineeDeveloper extends Developer {
    private String name;
    private int age;
    public TraineeDeveloper(DeveloperLevel level){
        super.setSalary(level);
        setName();
        setAge();
    }

    @Override
    public Developer setName() {
        name = super.getName();
        return super.setName();
    }

    @Override
    public Developer setAge() {
        age = super.getAge();
        return super.setAge();
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + this.name+ '\'' +
                ", age=" + this.age +
                ", salary=" + super.getSalary() +
                ", level=" + DeveloperLevel.TRAINEE +
                '}';
    }
}
