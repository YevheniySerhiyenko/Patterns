package factory_pattern;

public class TeamLeadFactory implements DeveloperFactory{
    @Override
    public Developer getDeveloper() {
        return TeamLead.getTeamLead();
    }
}