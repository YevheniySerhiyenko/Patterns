public class SeniorDeveloper implements Developer{
    private String name;
    private int age;
    private int salary;

    public SeniorDeveloper(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void takePosition() {
        System.out.println("I am a Senior.");
    }
}
