package factory_pattern;

import static factory_pattern.DeveloperLevel.*;

public class SeniorDeveloper implements Developer{
    private String name;
    private int age;
    private int desiredSalary;
    private DeveloperLevel level;

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

    public void takePosition() {
        this.level = SENIOR;
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
