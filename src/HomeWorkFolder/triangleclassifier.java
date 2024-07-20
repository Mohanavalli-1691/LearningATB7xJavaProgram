package HomeWorkFolder;

import java.util.Scanner;

public class triangleclassifier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side 1:");
        int side1=sc.nextInt();
        //Scanner sc = new Scanner(System.in);
        System.out.println("Enter side 2:");
        int side2=sc.nextInt();
        //Scanner sc = new Scanner(System.in);
        System.out.println("Enter side 3:");
        int side3=sc.nextInt();
        if(side1==side2 & side1==side3 & side2==side3){
            System.out.println("the triangle is equilateral");}
        else if (side1!=side2 & side1!=side3 & side2!=side3) {
            System.out.println("No sides are equal");
        }
        else {
            System.out.println("isosceles triangle");
        }

    }
}
