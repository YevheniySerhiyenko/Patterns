package factory_pattern;

public abstract class Developer {

    protected static String name = "John";
    static int age = 28;
    protected int salary = 0;


    public void setName(String name) {
        Developer.name = name;
    }

    public void setAge(int age) {
        Developer.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {return age;}

    public int getSalary() {
        return salary;
    }

//    public void setSalary(DeveloperLevel level){
//        for(DeveloperLevel levels : DeveloperLevel.values()){
//            if (level.equals(levels)) salary = 500;
//                else if (){
//                    salary = 1000;
//                    break;
//                }
//                case MIDDLE : {
//                    salary = 2000;
//                    break;
//                }
//                case SENIOR : {
//                    salary = 4000;
//                    break;
//                }
//                case TEAM_LEAD : {
//                    salary = 7000;
//                    break;
//                }
//                default : throw new IllegalArgumentException();
//            }
//        }
//    }

    @Override
    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", applying for a salary=" + salary +
                '}';
    }
}