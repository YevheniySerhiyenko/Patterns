package factory_pattern;

public class SeniorDeveloper extends SetterAgeAndNameForDevelopers {
    private String name;
    private int age;

    public SeniorDeveloper(DeveloperLevel level){
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
                ", level=" + DeveloperLevel.SENIOR +
                '}';
    }
}