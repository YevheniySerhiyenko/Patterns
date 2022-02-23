package factory_pattern;

public class SeniorDeveloperFactory extends DeveloperFactory{
    @Override
    public Developer getDeveloper() {
        return new SeniorDeveloper(DeveloperLevel.SENIOR);
    }
}
