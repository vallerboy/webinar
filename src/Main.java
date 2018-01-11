public class Main {
    public static void main(String[] args) {

        String name = "Oskar";
        int weight = 86;
        int height = 190;

        String name1 = "Adam";
        int weight1 = 56;
        int height1 = 170;

        Person somePerson = new Person("Oskar", 190, 86);
        Person somePerson1 = new Person("Adam", 190);

        Marker marker = new Marker("EasyWipe", "black", "6953070", 2);


        System.out.println(somePerson);
    }
}
