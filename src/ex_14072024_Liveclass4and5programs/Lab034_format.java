package ex_14072024_Liveclass4and5programs;

public class Lab034_format {
    public static void main(String[] args) {
        String myStr = "Hello %s! One kilobyte is %,d bytes.";
        String result = String.format(myStr, "World", 1024);
        System.out.println(result);
    }
}
