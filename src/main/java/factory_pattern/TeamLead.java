package factory_pattern;


//singleton
public class TeamLead extends Developer {

    private static volatile TeamLead teamLead;
    private static final DeveloperLevel level = DeveloperLevel.TEAM_LEAD;

    private TeamLead(String name, int age) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            e.printStackTrace();
        }
        Developer.name = name;
        Developer.age = age;

    }

    @Override
    public void setName(String name) {
        if (!name.equalsIgnoreCase("john")){
         System.out.println(("Your name wrong. TeamLeads name is John."));
        }
    }

    @Override
    public void setAge(int age) {
        if (age != 28) {
            System.out.println(("Your age wrong. Team Lead 28 years old."));
        }
    }

    public static TeamLead getTeamLead() {
        if (teamLead == null) {
            synchronized (TeamLead.class) {
                if (teamLead == null) {
                    teamLead = new TeamLead(name, age);
                }
            }
        }
            return teamLead;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + super.getName() + '\'' +
                ", age=" + super.getAge() +
                ", level=" + level +
                '}';
    }
}