package factory_pattern;

import static factory_pattern.DeveloperLevel.*;

public class TraineeDeveloper implements Developer {
    private String name;
    private int age;
    private int desiredSalary;
    private DeveloperLevel level;

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

    public void takePosition() {
        this.level = TRAINEE;
    }

    public void setDesiredSalary(int desiredSalary){
        this.desiredSalary = desiredSalary;
    }


    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", desiredSalary=" + desiredSalary +
                ", level=" + level +
                '}';
    }
}
