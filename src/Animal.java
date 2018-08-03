public class Animal {
private String kingdom;
private String classAttribute;
private String family;
private String species;
private int size;
private int age;
private String whatToSay;
private int amountOfSteps;

public Animal(String kingdom, String classAttribute, String family, String species, int size, int age, String whatToSay,
              int amountOfSteps) {
        this.kingdom = kingdom;
        this.classAttribute = classAttribute;
        this.family = family;
        this.species = species;
        this.age = age;
        this.size = size;
        this.whatToSay = whatToSay;
        this.amountOfSteps = amountOfSteps;
}

    public  void go (){
        System.out.println(amountOfSteps);
    }
    public  void say () {
    System.out.println(whatToSay);
    }
    public void printInformation (){
        System.out.println(kingdom);
        System.out.println(classAttribute);
        System.out.println(species);
        System.out.println(size+" cm");
        System.out.println(age+" years");
    }

}

