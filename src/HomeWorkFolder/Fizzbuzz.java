package HomeWorkFolder;

import java.util.Scanner;

public class Fizzbuzz {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a integer:");
        int num=sc.nextInt();
        if(num%3==0 && num%5==0){
            System.out.println("FizzBuzz");
        }
        else if(num%5==0){
            System.out.println("Buzz");
        }
        else if (num%3==0) {
            System.out.println("Fizz");

        }
        else{
            System.out.println("not a multiple of 3 and 5");
        }
    }
}



