package factory_pattern;

public class TraineeDeveloperFactory implements DeveloperFactory{
    @Override
    public Developer getDeveloper() {
        return new TraineeDeveloper(DeveloperLevel.TRAINEE);
    }
}
