package factory_pattern;

public class JuniorDeveloper extends SetterAgeAndNameForDevelopers {
    private String name;
    private int age;

    public JuniorDeveloper(DeveloperLevel level){
        super.setSalary(level);
        setName();
        setAge();
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + this.name + '\'' +
                ", age=" + this.age +
                ", salary=" + super.getSalary() +
                ", level=" + DeveloperLevel.JUNIOR +
                '}';
    }
}
