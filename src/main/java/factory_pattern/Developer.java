package factory_pattern;

public interface Developer {
    void takePosition(DeveloperLevel level);
    String getName();
    void setName(String name);
    int getAge();
    void setAge(int age);
}