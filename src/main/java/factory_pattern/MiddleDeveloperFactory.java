package factory_pattern;

public class MiddleDeveloperFactory extends DeveloperFactory{
    @Override
    public Developer getDeveloper() {
        return new MiddleDeveloper(DeveloperLevel.MIDDLE);
    }
}
