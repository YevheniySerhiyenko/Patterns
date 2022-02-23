package factory_pattern;

public class Test {
    public static void main(String[] args) {
//        write to console developer position, name and age
       Developer developer = DeveloperFactory.createFactory().getDeveloper().setName().setAge();
        System.out.println(developer);
    }
}
