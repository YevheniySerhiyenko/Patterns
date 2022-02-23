package factory_pattern;


//singleton
public class TeamLead extends Developer {
    private static final String NAME = "John";
    private static final int AGE = 28;

    private static volatile TeamLead teamLead;
    private static final DeveloperLevel level = DeveloperLevel.TEAM_LEAD;

    private TeamLead() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            e.printStackTrace();
        }

    }

    public static TeamLead getTeamLead() {
        if (teamLead == null) {
            synchronized (TeamLead.class) {
                if (teamLead == null) {
                    teamLead = new TeamLead();
                }
            }
        }
        return teamLead;
    }

    @Override
    public Developer setName() {
        return TeamLead.getTeamLead();
    }

    @Override
    public Developer setAge() {
        return TeamLead.getTeamLead();
    }

    public String toString() {
        return "{" +
                "name='" + NAME + '\'' +
                ", age=" + AGE +
                ", salary=" + super.getSalary() +
                ", level=" + level +
                '}';
    }
}