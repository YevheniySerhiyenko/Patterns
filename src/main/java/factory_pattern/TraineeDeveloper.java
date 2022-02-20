package factory_pattern;

public class TraineeDeveloper implements Developer {
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
        level = DeveloperLevel.TRAINEE;
        System.out.println("I am a Trainee");
    }

    @Override
    public String toString() {
        return "factory_pattern.TraineeDeveloper{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", desiredSalary=" + desiredSalary +
                '}';
    }
}
