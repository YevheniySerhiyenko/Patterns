package factory_pattern;

public class JuniorDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer getDeveloper() {

        return new JuniorDeveloper();
    }
}
