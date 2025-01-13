/**
 * Name: Subject.java
 * Date: 13 January 2025
 * Author: SAM Sokleap
 * Modified: 13 January 2025
 * Description: Lab 05
 * Functions:
 *      -getPrice(): Subject
 *      -getProgram(): Subject
 *      -getName(): Subject
 *      -getCredits(): Subject
 * Variables:
 *      -price: Subject
 *      -PROGRAM: Subject
 *      -name: Subject
 *      -credits: Subject
 * */
public class Subject {

    private static final double price;
    static {
        price = 9.9;
    }

    private static final String PROGRAM = "Year 2 Program";

    private String name;
    private int credits;

    public static final double getPrice() {
        return price;
    }

    public static String getProgram() {
        return PROGRAM;
    }

    public Subject(String name, int credits) {
        this.name = name;
        this.credits = credits;
    }

    public String getName() {
        return name;
    }

    public int getCredits() {
        return credits;
    }

    public static void main(String[] args) {

    }

}