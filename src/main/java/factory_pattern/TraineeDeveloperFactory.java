package factory_pattern;

public class TraineeDeveloperFactory extends DeveloperFactory{
    @Override
    public Developer getDeveloper() {
        return new TraineeDeveloper(DeveloperLevel.TRAINEE);
    }
}
