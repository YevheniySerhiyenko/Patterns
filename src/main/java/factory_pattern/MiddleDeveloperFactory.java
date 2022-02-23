package factory_pattern;

public class MiddleDeveloperFactory implements DeveloperFactory{
    @Override
    public Developer getDeveloper() {
        return new MiddleDeveloper(DeveloperLevel.MIDDLE);
    }
}
