package factory_pattern;

public class JuniorDeveloper implements Developer{
    private String name;
    private int age;
    private int desiredSalary;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void takePosition(DeveloperLevel level) {
        level = DeveloperLevel.JUNIOR;
        System.out.println("I am a Junior.");
    }

    @Override
    public String toString() {
        return "factory_pattern.JuniorDeveloper{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", desiredSalary=" + desiredSalary +
                '}';
    }
}
