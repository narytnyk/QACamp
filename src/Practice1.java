public class Practice1 {
    public static void main (String[] args) {

       // Animal animal = new Animal();

        String name = "Yuliana Narytnyk";
        System.out.println(name);

    outputNumber();
        outputName();
        outputName1();
        Animal dog = new Animal ("Animalia", "Mammalia", "Canidae", "C. lupus", 110, 5, "wuf",150);
        dog.say();
        dog.go();
        dog.printInformation();

    }

    public static long outputNumber () {
        int a = 7;
        if (a < 10) {
            System.out.println(a);
        }
        return 0;
    }

    public static void outputName() {
        String name = "Yuliana";
        for(int i = 0; i < name.length(); i++){
            System.out.println(name.charAt(i));
        }
    }
    public static void outputName1() {
        String name = "Yuliana";
        for (int i = 0; i < name.length(); i++) {
        while (i < name.length()) {
        System.out.println(name.charAt(i));
        i++;
        }
        }
    }
}