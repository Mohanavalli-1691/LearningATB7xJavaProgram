package ex_14072024_Liveclass4and5programs;

public class Lab044_matches {
    public static void main(String[] args) {
        String regex = "cat|dog|fish";

        System.out.println("cat".matches(regex));
        System.out.println("dog".matches(regex));
        System.out.println("catfish".matches(regex));
        System.out.println("doggy bag".matches(regex));
        System.out.println("|".matches(regex));
    }
}
