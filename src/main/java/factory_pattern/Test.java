package factory_pattern;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
       Developer developer = DeveloperFactory.createFactory().getDeveloper().setName().setAge();
        System.out.println(developer);


    }

}
