package factory_pattern;

public class SeniorDeveloperFactory implements DeveloperFactory{
    @Override
    public Developer getDeveloper() {
        System.out.println("Senior");
        return new SeniorDeveloper();
    }
}
