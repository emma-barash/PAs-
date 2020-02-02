// A cookie recipe calls for the following ingredients:
// • 1.5 cups of sugar
// • 1.0 cup of butter
// • 2.75 cups of flour
// The recipe produces 48 cookies with these amounts of the ingredients. Write a program that
// displays the number of cups of each ingredient needed for 144 cookies and for 72 cookies. Your
// solution should calculate the appropriate amount of ingredients for any of the cases. Your output
// should be:
// Ingredients Recipe 1
// 1.5
// 1.0
// 2.75
// Ingredients Recipe 2
// 4.5
// 3.0
// 8.25
// Ingredients Recipe 3
// 2.25
// 1.5
// 4.125

public class TwoReview {
    public static void main(String[] args){
        double sugar = 1.5;
        double butter = 1.0;
        double almondFlour = 2.75;
        int cookiesAmount = 48;

        System.out.println("Ingredience Recipe 1: ");
        System.out.println("sugar: " + sugar);
        System.out.println("butter: "  + butter);
        System.out.println("almond flour: " + almondFlour);
        System.out.println("makes " + cookiesAmount + " cookies!");
        System.out.println();

        System.out.println("Ingredience Recipe 2: ");
        System.out.println("sugar: " + sugar * 1.5);
        System.out.println("butter: "  + butter * 1.5);
        System.out.println("almond flour: " + almondFlour * 1.5);
        System.out.println("makes " + cookiesAmount * 1.5 + " cookies!");
        System.out.println();

        System.out.println("Ingredience Recipe 3: ");
        System.out.println("sugar: " + sugar * 3);
        System.out.println("butter: "  + butter * 3);
        System.out.println("almond flour: " + almondFlour * 3);
        System.out.println("makes " + cookiesAmount * 3 + " cookies!");
    }
}