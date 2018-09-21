public class Classroom {

    public static void main(String[] args) {

        Wilder jeanKevin = new Wilder("Jean-Kevin", false);
        Wilder joeLeClodo = new Wilder("Joe le Clodo", true);
        Wilder perlinpimpin = new Wilder("Perlinpimpin ", true);

        System.out.println(jeanKevin.whoAmI());
        System.out.println(joeLeClodo.whoAmI());
        System.out.println(perlinpimpin.whoAmI());

        System.out.println("Test de setAware() : ");
        jeanKevin.setAware(true);
        System.out.println(jeanKevin.whoAmI());

    }

}