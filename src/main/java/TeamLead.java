//singleton
public class TeamLead implements Developer{

    private static TeamLead teamLead;
    private String name;

    private TeamLead(String name){
        try{
            Thread.sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        this.name = name;
    }
    public static TeamLead getTeamLead(String name){
        if (teamLead == null){
            teamLead = new TeamLead(name);
        }
        return teamLead;
    }

    @Override
    public void takePosition() {
        System.out.println("I am a Team Lead. My name is John.");
    }

    @Override
    public String getName() {
        return name;
    }
}
