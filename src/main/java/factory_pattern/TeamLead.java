package factory_pattern;

import static factory_pattern.DeveloperLevel.*;

//singleton
public class TeamLead {

    private static TeamLead teamLead;
    private final String name;
    private int age;
    private DeveloperLevel level;

    private TeamLead(String name){
        try{
            Thread.sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        this.name = name;
        setAge(25);

    }

    public void takePosition() {
        level = TEAM_LEAD;
        System.out.println("I am a Team Lead");
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public static TeamLead getTeamLead(String name){
        if (teamLead == null){
            teamLead = new TeamLead(name);
        }
        return teamLead;
    }

}