package factory_pattern;

import static factory_pattern.DeveloperLevel.*;

//singleton
public class TeamLead implements Developer{

    private static TeamLead teamLead;
    private String name;
    private int age;
    private DeveloperLevel level;

    private TeamLead(String name,int age){
        try{
            Thread.sleep(1000);
        }catch (InterruptedException e){
            Thread.currentThread().interrupt();
            e.printStackTrace();
        }
        this.name = name;
        this.age = age;

    }

    public void takePosition() {
        level = TEAM_LEAD;
    }

    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
         if(name.equalsIgnoreCase("john")){
             this.name = name;
         }else System.out.println("Your name wrong. TeamLeads name is John.");

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age == 28){
            this.age = age;
        }else System.out.println("Your age wrong. Team Lead 28 years old.");
    }
    public static TeamLead getTeamLead(){
        if (teamLead == null){
            assert false;
            teamLead = new TeamLead(TeamLead.teamLead.name, TeamLead.teamLead.age);
        }
        return teamLead;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", level=" + level +
                '}';
    }
}