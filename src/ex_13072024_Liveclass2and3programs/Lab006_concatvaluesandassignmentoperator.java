package ex_13072024_Liveclass2and3programs;

public class Lab006_concatvaluesandassignmentoperator {
    public static void main(String[] args) {
        int x=100;
        int y=200;
        String c = "add";
        System.out.println(x+y+c+y+c+x+y);

        int a = 10;
        System.out.println(++a + a++ + a++);
        System.out.println(a);
    }
}
