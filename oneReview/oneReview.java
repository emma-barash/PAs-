// Write a program that given your birth year, such as 1998, displays it one digit per line. Use
// arithmetic operations to isolate each digit. A possible output might be:
// 1
// 9
// 9
// 8

// ######################################## TRY AGAIN.

public class oneReview{
    public static void main(String[] args){
        int year = 1998;
        int x = 10;
        int first;
        int second;
        int third;
        int fourth;

        first = year / 1000;
        System.out.println(first);
        year = year % 1000;
        second = year / 100;
        System.out.println(second);
        year = year % 100;
        third = year / 10;
        System.out.println(third);
        year = year % 10;
        fourth = year;
        System.out.println(fourth);

    }
}