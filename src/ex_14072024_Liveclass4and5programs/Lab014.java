package ex_14072024_Liveclass4and5programs;

public class Lab014 {
    public static void main(String[] args)
    {
        int i=19, j=29, k;

        k = i-- - i++ + --j - ++j + --i - j-- + ++i - j++;

        System.out.println("i="+i);
        System.out.println("j="+j);
        System.out.println("k="+k);
    }
}
