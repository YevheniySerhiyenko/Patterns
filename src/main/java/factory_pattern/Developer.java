package factory_pattern;

import java.util.Scanner;

import static factory_pattern.DeveloperLevel.*;

public abstract class Developer {
    private Scanner scanner = new Scanner(System.in);
    private String nameConsole = scanner.nextLine();
    private int ageConsole = scanner.nextInt();

    private String name;
    private int age;
    protected int salary = 0;

    public Developer setName() {
        name = nameConsole;
        return this;
    }

    /* метод устанавливает возраст разработчика
    ввод осуществляется с консоли, производится проверка
     */
    public Developer setAge() {
        if (ageConsole > 0 && ageConsole < 100) {
            age = ageConsole;
        } else {
            System.out.println("Your age is wrong! One more!");
            age = ageConsole = scanner.nextInt();
        }
        return this;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }

    //    метод для определения зарплаты согласно уровню разработчика
    public void setSalary(DeveloperLevel level) {

        if (level.equals(TRAINEE)) {
            salary = 500;
        } else if (level.equals(JUNIOR)) {
            salary = 1000;
        } else if (level.equals(MIDDLE)) {
            salary = 2000;
        } else if (level.equals(SENIOR)) {
            salary = 4000;
        } else if (level.equals(TEAM_LEAD)) {
            salary = 7000;
        } else {
            throw new IllegalArgumentException();
        }
    }


}