package factory_pattern;

public class MiddleDeveloper implements Developer{
    private String name;
    private int age;
    private int desiredSalary;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void takePosition(DeveloperLevel level) {
        level = DeveloperLevel.MIDDLE;
        System.out.println("I am a Middle.");
    }

    @Override
    public String toString() {
        return "factory_pattern.MiddleDeveloper{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", desiredSalary=" + desiredSalary +
                '}';
    }
}