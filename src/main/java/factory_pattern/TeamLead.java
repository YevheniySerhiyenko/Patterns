package factory_pattern;

import static factory_pattern.DeveloperLevel.*;

//singleton
public class TeamLead implements Developer{

    private static TeamLead teamLead;
    private static String name = "John";
    private static int age = 28;
    private DeveloperLevel level;

    private TeamLead(String name,int age){
        try{
            Thread.sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        this.name = name;
        this.age = age;

    }

    public void takePosition() {
        level = TEAM_LEAD;
        System.out.println("I am a Team Lead");
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
            teamLead = new TeamLead(TeamLead.name, TeamLead.age);
        }
        return teamLead;
    }

    @Override
    public String toString() {
        return "TeamLead{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}