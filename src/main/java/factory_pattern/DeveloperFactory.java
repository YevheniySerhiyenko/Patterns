package factory_pattern;

import java.util.Scanner;

public interface DeveloperFactory {

    abstract Developer getDeveloper();

    static DeveloperFactory createFactory() {
        Scanner scanner = new Scanner(System.in);
        String position = scanner.nextLine();
        if (position.startsWith("tra") || position.startsWith("TRA")) {
            return new TraineeDeveloperFactory();
        } else if (position.startsWith("jun") || position.startsWith("JUN")) {
            return new JuniorDeveloperFactory();
        } else if (position.startsWith("mid") || position.startsWith("MID")) {
            return new MiddleDeveloperFactory();
        } else if (position.startsWith("sen") || position.startsWith("SEN")) {
            return new SeniorDeveloperFactory();
        } else if (position.startsWith("tea") || position.startsWith("TEAM")) {
            System.out.println("We already have a Team Lead. Choose another position.");
            return DeveloperFactory.createFactory();
        } else {
            throw new IllegalArgumentException(scanner.nextLine() + " is unknown");
        }
    }
}
