public class JuniorDeveloper implements Developer{
    private String name;
    private int age;

    private int salary;


    public JuniorDeveloper(String name, int age) {
        this.name = name;
        this.age = age;
        salary = 1000;
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
        System.out.println("I am a Junior.");
    }
}
