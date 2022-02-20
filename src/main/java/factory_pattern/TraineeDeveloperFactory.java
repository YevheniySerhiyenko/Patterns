package factory_pattern;

public class TraineeDeveloperFactory implements DeveloperFactory{
    @Override
    public Developer getDeveloper() {
        System.out.println("Trainee");
        return new TraineeDeveloper();
    }
}
