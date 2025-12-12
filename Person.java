import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Person {
    private Name personName;
    private static int personCounter = 0;

    public Person(Name personName) {
        this.personName = personName;
    }

    public Person() {
        personCounter++;

    }

    public String helloWorld() {
        return "Hello, World!";
    }

    public String hello(String name) {
        return "Hello, " + name + "!";
    }

    public static int numberOfPersons() {
        return personCounter;
    }

}