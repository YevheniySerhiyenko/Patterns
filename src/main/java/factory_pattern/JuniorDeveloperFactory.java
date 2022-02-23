package factory_pattern;

public class JuniorDeveloperFactory extends DeveloperFactory {
    @Override
    public Developer getDeveloper() {
        return new JuniorDeveloper(DeveloperLevel.JUNIOR);
    }
}
