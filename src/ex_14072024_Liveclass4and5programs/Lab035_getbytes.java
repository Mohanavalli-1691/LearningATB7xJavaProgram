package ex_14072024_Liveclass4and5programs;

public class Lab035_getbytes {
    public static void main(String[] args) {
        String myStr = "Hello";
        byte[] result = myStr.getBytes();
        System.out.println(result[2]);
    }
}
