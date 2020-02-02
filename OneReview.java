// Write a program that given your birth year, such as 1998, displays it one digit per line. Use
// arithmetic operations to isolate each digit. A possible output might be:
// 1
// 9
// 9
// 8

import java.util.*;
public class OneReview {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("Please enter your birth year: ");
        String year = console.next();
        int counter = 1;

        for(int i = 0; i <= year.length() - 1; i++) {
            System.out.println(year.substring(i, counter));
            counter++;
        }
    }
}