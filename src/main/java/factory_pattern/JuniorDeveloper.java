package factory_pattern;

import static factory_pattern.DeveloperLevel.*;

public class JuniorDeveloper implements Developer{
    private String name;
    private int age;
    private int desiredSalary;
    private DeveloperLevel level;


    public JuniorDeveloper(){
        setName("John");
        setAge(25);
        setDesiredSalary(1000);
    }

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

    public void takePosition() {
        this.level = JUNIOR;
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
