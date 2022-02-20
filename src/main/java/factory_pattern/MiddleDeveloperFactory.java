package factory_pattern;

public class MiddleDeveloperFactory implements DeveloperFactory{
    @Override
    public Developer getDeveloper() {
        System.out.println("Middle");
        return new MiddleDeveloper();
    }
}
