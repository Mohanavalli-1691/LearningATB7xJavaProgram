package ex_14072024_Liveclass4and5programs;

public class Lab036_getchar {
    public static void main(String[] args) {

            char[] myArray = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
            System.out.println(myArray);

            String myStr = "Hello, World!";
            myStr.getChars(7, 10, myArray, 3);
            System.out.println(myArray);

    }
}
