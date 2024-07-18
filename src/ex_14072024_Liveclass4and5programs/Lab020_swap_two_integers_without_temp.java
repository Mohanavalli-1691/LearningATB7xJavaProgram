package ex_14072024_Liveclass4and5programs;

public class Lab020_swap_two_integers_without_temp {

    public static void main(String[] args) {
        int a=2;
        int b=4;

        a=a+b; // 2+4=6
        b=a-b; //6-4=2   b=2
        a=a-b;  //6-2    a=4

        System.out.println(a);
        System.out.println(b);



    }
}
