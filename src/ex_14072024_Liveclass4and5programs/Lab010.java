package ex_14072024_Liveclass4and5programs;

public class Lab010 {
    public static void main(String[] args)
    {
        int a=11, b=22, c;

        c = a + b + a++ + b++ + ++a + ++b;

        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println("c="+c);
    }
}
