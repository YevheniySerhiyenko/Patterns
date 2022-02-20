package factory_pattern;

public class SeniorDeveloper implements Developer{
    private String name;
    private int age;
    private int desiredSalary;

    public SeniorDeveloper(){
        setName("Robert");
        setAge(29);
        setDesiredSalary(4000);
    }


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
        level = DeveloperLevel.SENIOR;
        System.out.println("I am a Senior.");
    }

    public int setDesiredSalary(int desiredSalary){
        this.desiredSalary = desiredSalary;
        return this.desiredSalary;
    }

    @Override
    public String toString() {
        return "SeniorDeveloper{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", desiredSalary=" + desiredSalary +
                '}';
    }
}
