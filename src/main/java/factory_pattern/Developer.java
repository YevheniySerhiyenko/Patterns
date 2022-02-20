package factory_pattern;

import static factory_pattern.DeveloperLevel.*;

public abstract class Developer {

    protected static String name = "John";
    static int age = 28;
    protected int salary = 0;


    public void setName(String name) {
        Developer.name = name;
    }

    public void setAge(int age) {
        Developer.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {return age;}

    public int getSalary() {
        return salary;
    }

    public void setSalary(DeveloperLevel level){

            if (level.equals(TRAINEE)) {salary = 500;}
            else if (level.equals(JUNIOR)) {salary = 1000;}
            else if (level.equals(MIDDLE)) {salary = 2000;}
            else if (level.equals(SENIOR)) {salary = 4000;}
            else if (level.equals(TEAM_LEAD)) {salary = 7000;}
            else {throw new IllegalArgumentException();}
    }

    @Override
    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", applying for a salary=" + salary +
                '}';
    }
}