package factory_pattern;

public class TraineeDeveloper implements Developer {
    private String name;
    private int age;
    private int desiredSalary;

    public TraineeDeveloper(){
        setName("Jack");
        setAge(23);
        setDesiredSalary(500);
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
        level = DeveloperLevel.TRAINEE;
        System.out.println("I am a Trainee");
    }

    public int setDesiredSalary(int desiredSalary){
        this.desiredSalary = desiredSalary;
        return this.desiredSalary;
    }


    @Override
    public String toString() {
        return "TraineeDeveloper{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", desiredSalary=" + desiredSalary +
                '}';
    }
}
