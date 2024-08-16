package HomeWorkFolder;

import java.util.Arrays;

public class SecondLargestSalary {
    public static void main(String[] args) {
        int [] salaries = {7, 10, 4, 13, 25, 18, 9, 8, 17};
        int length = salaries.length;

        Arrays.sort(salaries);

        int second_largest = salaries[length-2];

        System.out.println(second_largest);
    }
}
