package factory_pattern;

public class JuniorDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer getDeveloper() {
        System.out.println("Junior");
        return new JuniorDeveloper();
    }
}
