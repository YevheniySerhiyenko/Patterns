package factory_pattern;

public class SeniorDeveloperFactory implements DeveloperFactory{
    @Override
    public Developer getDeveloper() {
        return new SeniorDeveloper(DeveloperLevel.SENIOR);
    }
}
