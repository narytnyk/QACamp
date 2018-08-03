package practice3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public enum  Users {

    PROJECTMANAGER("projectmanager", "123456"),
    DEVELOPER("developer", "123456"),
    QA("qa", "123456");

    private String name;
    private String pass;

    public String getName() {
        return name;
    }

    public String getPass() {
        return pass;
    }

    Users(final String name, final String pass) {
        this.name = name;
        this.pass = pass;
    }

  public static void main(String[] args) {

                  startPrint();
                  printUserCredentials();
                  finishPrint();
  }
    @Before
    private static void startPrint() {
        System.out.println("Start printing user credentials");
    }

    @Test
    private static void printUserCredentials() {
        System.out.println("PROJECTMANAGER: " + Users.PROJECTMANAGER.getName()+" - "+ Users.PROJECTMANAGER.getPass());
        System.out.println("DEVELOPER: " + Users.DEVELOPER.getName()+" - "+ Users.DEVELOPER.getPass());
        System.out.println("QA: " + Users.QA.getName()+" - "+ Users.QA.getPass());
    }

    @After
    private static void finishPrint() {
        System.out.println("Finish printing user credentials");
    }
}

